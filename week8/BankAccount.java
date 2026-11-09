//A class is a BLUEPRINT for an object
//It describes what information the object holds (fields)
//and what the object can do (methods)
//Once we have the blueprint we can make as many objects (instances) as we want
//
//Think about a bank account. What do we need to know about it?
//Who owns it and how much money is in it
//What can you do with a bank account? Deposit and withdraw
public class BankAccount {

	//fields - the information we want to capture about the object
	//fields should be PRIVATE. Code outside of this class can not touch them directly
	private String owner;
	private double balance;

	//Constructor - Special method that is called to create an instance of your class
	//The job of the constructor is to give the fields their starting values
	//The name must match the name of the class and there is no return type
	public BankAccount(String owner, double balance) {
		//this - refers to the instance of the class we are creating
		//this.owner is the field, owner is the parameter
		this.owner = owner;
		this.balance = balance;
	}

	//methods - actions that a class can take

	//getters/setters
	//The getters and setters provide access to the private fields
	//A getter lets someone READ a field
	//A setter lets someone CHANGE a field
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//everything else - the behavior of the object
	//these methods change the balance of whichever account they are called on
	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	//toString - controls what shows up when you print the object
	//println looks inside of the object for a method called toString()
	//if we do not write one we get something like BankAccount@6d06d69c
	@Override
	public String toString() {
		return owner + " has $" + balance;
	}

	//static - the method belongs to the CLASS, not to any one account
	//you do not need to make an instance to call it
	//you call it on the class name: BankAccount.accountTypes()
	//Notice it does not use owner or balance, those belong to a specific account
	public static String accountTypes() {
		return "Checking, Savings";
	}

}
