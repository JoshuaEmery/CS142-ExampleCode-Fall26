//This is the same BankAccount from week 8 with some upgrades
//Look for the NEW comments to see what changed
//
//A class is a BLUEPRINT for an object
//It describes what information the object holds (fields)
//and what the object can do (methods)
//Once we have the blueprint we can make as many objects (instances) as we want
public class BankAccount {

	//fields - the information we want to capture about the object
	//fields should be PRIVATE. Code outside of this class can not touch them directly
	private String owner;
	private double balance;
	//NEW - every account gets its own account number
	private int accountNumber;

	//NEW - static field
	//there is only ONE of these shared by EVERY instance of the class
	//we use it to hand out account numbers so no two accounts get the same number
	private static int nextAccountNumber = 1000;

	//Constructor - Special method that is called to create an instance of your class
	//The job of the constructor is to give the fields their starting values
	//The name must match the name of the class and there is no return type
	public BankAccount(String owner, double balance) {
		//this - refers to the instance of the class we are creating
		//NEW - instead of setting the field directly we call our setter
		//that way the validation in setOwner happens here too
		this.setOwner(owner);
		//NEW - validation
		//we do not want to allow an account to be opened with negative money
		if (balance < 0) {
			//Here we are raising an exception. If not handled it crashes the app
			throw new IllegalArgumentException("Starting balance cannot be negative: " + balance);
		}
		this.balance = balance;
		//NEW - grab the next account number and move the counter forward
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	//NEW - Constructors can be overloaded just like methods
	//this lets someone open an account without putting any money in
	public BankAccount(String owner) {
		//this(...) calls the OTHER constructor so we do not repeat code
		//it must be the first line in the constructor
		this(owner, 0);
	}

	//methods - actions that a class can take

	//getters/setters
	//A getter lets someone READ a field
	//A setter lets someone CHANGE a field
	//Not every field needs both!
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		//NEW - validation, an account must have an owner
		if (owner == null || owner.isEmpty()) {
			throw new IllegalArgumentException("Owner cannot be empty");
		}
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	//NEW - setBalance has been REMOVED
	//if it existed, anyone could do account.setBalance(1000000)
	//now the ONLY way to change the balance is through deposit and withdraw

	//NEW - account number can be read but NEVER changed, so there is no setter
	public int getAccountNumber() {
		return accountNumber;
	}

	//everything else - the behavior of the object
	//these methods change the balance of whichever account they are called on
	public void deposit(double amount) {
		//NEW - validation, you can not deposit 0 or a negative amount
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit must be more than 0: " + amount);
		}
		balance = balance + amount;
	}

	//NEW - withdraw now returns a boolean instead of void
	//true means it worked, false means there was not enough money
	//this lets the caller decide what to do instead of crashing the app
	public boolean withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraw must be more than 0: " + amount);
		}
		//not enough money, do not change anything
		if (amount > balance) {
			return false;
		}
		balance = balance - amount;
		return true;
	}

	//NEW - Objects can be passed to methods just like any other variable
	//lets move money from THIS account into another account
	//other is a reference to a different BankAccount
	public boolean transferTo(BankAccount other, double amount) {
		//we can reuse our own methods
		//if the withdraw fails, we do not deposit anything
		if (this.withdraw(amount)) {
			other.deposit(amount);
			return true;
		}
		return false;
	}

	//toString - controls what shows up when you print the object
	//println looks inside of the object for a method called toString()
	//NEW - we are using String.format to show the account number and 2 decimal places
	@Override
	public String toString() {
		return String.format("Account #%d - %s has $%.2f", accountNumber, owner, balance);
	}

	//NEW - equals
	//by default .equals does the same thing as ==
	//it checks if two variables point at the SAME object in the heap
	//we override it to define what equal actually means for a BankAccount
	//Two accounts are the same if they have the same account number
	@Override
	public boolean equals(Object obj) {
		//if obj is not a BankAccount they can not be equal
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		//we know it is a BankAccount, so we cast it so we can use it like one
		BankAccount other = (BankAccount) obj;
		return this.accountNumber == other.accountNumber;
	}

	//static - the method belongs to the CLASS, not to any one account
	//you do not need to make an instance to call it
	//you call it on the class name: BankAccount.accountTypes()
	public static String accountTypes() {
		return "Checking, Savings";
	}

	//NEW - another static method that uses our static field
	//inside of a static method you do not have access to this
	//or any of the non static fields - which account's balance would it even be?
	public static int getNextAccountNumber() {
		return nextAccountNumber;
	}

}
