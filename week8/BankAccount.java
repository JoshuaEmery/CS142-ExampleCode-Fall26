//A class is a blueprint for creating objects
//It describes what information that the object holds (fields)
//What the object can do (methods)
//Once you have the blueprint you can make as many objects as you want (instances)

//What do we need to make a bank account - Owner, Balance - Fields

public class BankAccount {

	//Define the fields
	//Variables that will store the information about the object
	//fields should always PRIVATE
	//private means it cannot be accessed from outside of the BankAccount class
	//We should not let our fields be set to an invalid value
	private String owner;
	private double balance;
	
	//Constructor - This is a special method that is called when creating
	//an instance of your class. Its job is to give the fields their starting
	//values - Assigns the fields
	//The name of the constructor matches the name of the class
	//The constructor is public so it can be accessed from outside of the class
	public BankAccount(String owner, double balance) {
		//assign the values to the fields
		//this - refers to the current instance of the class
		this.owner = owner;
		this.balance = balance;
	}
	//methods - These are the actions that a class can take
	//two basic groups - getters/setters
	//everything else
	//getters and setters provide access to the fields
	//if a field has a getter it can be accessed outside of the class
	//if a field has a setter it can be changed outside of the class
	public String getOwner() {
		return this.owner;
	}
	//a setter is just a method that takes in a new value for a field and
	//sets it
	public void setOwner(String owner) {
		//I can run tests on the string that came into this setter function
		//BEFORE I allow it to update my field
		this.owner = owner;
	}
	//this gives read access to balance
	public double getBalance() {
		return balance;
	}
	//this gives write access to balance
	//this setBalance method seems kinda dangerous
	
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	// setter for balance is too much power to the user of my class
	//instead we are going to provide a deposit and a withdraw method
	
	//lets make a deposit method. It will check that the amount is positive
	// change the balance, return true if successful
	public boolean deposit(double amount) {
		if(amount < 0) {
			return false;
		}
		this.balance += amount;
		return true;
	}
	//lets make a withdraw. Check to see if they have enough money to withdraw
	//if not dont let them withdraw
	public boolean withdraw(double amount) {
		//we need to check that amount is positive
		if(amount < 0) {
			return false;
		}
		//we have to check that they have enough money
		if(this.balance - amount < 0) {
			return false;
		}
		this.balance -= amount;
		return true;
	}
	//customize the toString method - Override
	@Override
	public String toString() {
		return "Account Owner: " + this.owner + ", Balance: " + this.balance;
	}
	//A static method is a method that can be called WITHOUT making an instance of
	//the class. It is called on the CLASS ITSELF
	//These are commonly used to give the user CATEGORIES relevant to a class
	public static String accountTypes() {
		//There is no THIS inside of a static method.
		//The constructor has not run, no fields, no this
		return "Checking, Savings";
	}
	
}
