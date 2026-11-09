//A class is a BLUEPRINT for an object
//It describes what information the object holds (fields)
//and what the object can do (methods)
//Once we have the blueprint we can make as many objects (instances) as we want
//Every instance gets its own copy of the fields

//Think about a bank account. What do we need to know about it?
//Who owns it, what the account number is, and how much money is in it
//What can you do with a bank account? Deposit, withdraw, check the balance
public class BankAccount {

	//fields - the information we want to capture about the object
	//also called instance variables or attributes
	//fields should be PRIVATE. Code outside of this class can not touch them directly
	private String owner;
	private int accountNumber;
	private double balance;

	//static field - there is only ONE of these shared by EVERY instance of the class
	//we are going to use it to hand out account numbers so no two accounts
	//end up with the same number
	private static int nextAccountNumber = 1000;

	//Constructor - Special method that is called to create an instance of your class
	//The job of the constructor is to give the fields their starting values
	//Rules for constructors:
	//1. The name must match the name of the class EXACTLY
	//2. There is no return type, not even void
	public BankAccount(String owner, double startingBalance) {
		//inside of the constructor we have access to a new keyword
		//this - refers to the instance of the class we are creating
		//this.owner is the field, owner is the parameter
		//without this, Java would think we were talking about the parameter both times
		//we can use our setter so the validation happens in one place
		this.setOwner(owner);
		//we do not want to allow an account to be opened with negative money
		if (startingBalance < 0) {
			//Here we are raising an exception. If not handled it crashes the app
			throw new IllegalArgumentException("Starting balance cannot be negative: " + startingBalance);
		}
		this.balance = startingBalance;
		//grab the next account number and move the counter forward for the next account
		this.accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	//Constructors can be overloaded just like methods
	//this lets someone open an account without putting any money in
	public BankAccount(String owner) {
		//this(...) calls the OTHER constructor so we do not repeat code
		//it must be the first line in the constructor
		this(owner, 0);
	}

	//methods - actions that a class can take

	//getters/setters
	//The getters and setters provide access to the private fields
	//If the user of the class should be able to READ a field, that field should have a getter
	//If the user of the class should be able to CHANGE a field, that field should have a setter
	//Not every field needs both!

	public String getOwner() {
		return this.owner;
	}
	//people change their name, so owner gets a setter
	public void setOwner(String owner) {
		//validate - an account must have an owner
		if (owner == null || owner.isEmpty()) {
			throw new IllegalArgumentException("Owner cannot be empty");
		}
		this.owner = owner;
	}

	//account number can be read but NEVER changed, so there is no setter
	public int getAccountNumber() {
		return this.accountNumber;
	}

	//balance can be read but there is no setBalance
	//if there was, someone could just do account.setBalance(1000000)
	//the ONLY way to change the balance is through deposit and withdraw
	public double getBalance() {
		return this.balance;
	}

	//everything else - the behavior of the object
	//notice these methods are NOT static
	//they work on the fields of whichever instance they are called on
	//account1.deposit(50) changes account1's balance, NOT account2's

	//lets write a method to put money into the account
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit must be more than 0: " + amount);
		}
		this.balance += amount;
	}

	//lets write a method to take money out of the account
	//instead of throwing an exception if there is not enough money
	//lets return true or false so the caller knows if it worked
	public boolean withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraw must be more than 0: " + amount);
		}
		//not enough money, do not change anything
		if (amount > this.balance) {
			return false;
		}
		this.balance -= amount;
		return true;
	}

	//Objects can be passed to methods just like any other variable
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
	//if we do not write one we get something like BankAccount@6d06d69c
	//which is the name of the class and the address of the object
	@Override
	public String toString() {
		return String.format("Account #%d - %s - Balance: $%.2f", accountNumber, owner, balance);
	}

	//equals - by default .equals does the same thing as ==
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

	//A static method can be called WITHOUT making an instance of the class
	//you call it on the class itself: BankAccount.getNextAccountNumber()
	public static int getNextAccountNumber() {
		//inside of a static method you do not have access to this
		//or any of the non static fields - which account would balance even be?
		return nextAccountNumber;
	}

}
