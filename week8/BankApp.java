
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Making an instance of BankAccount - using the constructor
		//the new keyword creates the object in the heap and calls the constructor
		//dataType variableName = new ClassName(arguments);
		BankAccount account1 = new BankAccount("Josh", 100);
		//using the overloaded constructor - starts with $0
		BankAccount account2 = new BankAccount("Sam");

		//I use the instance variable and a . to access the methods
		System.out.println(account1.getOwner());
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getBalance());
		//Since the fields are private, this will not compile
		//account1.balance = 1000000;

		//println calls our toString method for us
		System.out.println(account1);
		System.out.println(account2);

		//Each instance has its OWN fields
		//depositing into account1 does not change account2
		account1.deposit(50);
		System.out.println("After deposit");
		System.out.println(account1);
		System.out.println(account2);

		//withdraw returns true or false so we can check if it worked
		if (account2.withdraw(20)) {
			System.out.println("Withdraw worked");
		} else {
			System.out.println("Not enough money in " + account2.getOwner() + "'s account");
		}

		//The validation in our class protects the object from bad data
		//This will throw an exception and crash the app
		//account1.deposit(-500);
		//BankAccount badAccount = new BankAccount("", 10);

		//Objects as parameters - pass one account to another account's method
		account1.transferTo(account2, 75);
		System.out.println("After transfer");
		System.out.println(account1);
		System.out.println(account2);

		//Objects are stored by reference not value
		//account3 is NOT a new account. It is a second variable pointing at
		//the SAME object in the heap as account1
		BankAccount account3 = account1;
		account3.deposit(1000);
		System.out.println("Account 1 balance: " + account1.getBalance());

		//== checks if they point to the same object
		//.equals uses the method we wrote and compares account numbers
		BankAccount account4 = new BankAccount("Josh", 175);
		System.out.println("account1 == account3: " + (account1 == account3));
		System.out.println("account1 == account4: " + (account1 == account4));
		System.out.println("account1.equals(account4): " + account1.equals(account4));

		//Calling a static method
		//Static methods are called on the class itself and can be run without making an instance
		System.out.println("Next account number: " + BankAccount.getNextAccountNumber());

		//We can make arrays of objects just like arrays of ints or Strings
		BankAccount[] accounts = { account1, account2, account4, new BankAccount("Alex", 500) };
		for (BankAccount account : accounts) {
			System.out.println(account);
		}
		//lets call our methods
		System.out.println("Total in the bank: " + totalBalance(accounts));
		System.out.println("Richest: " + richest(accounts));
		//objects as return types - openAccount builds and returns a new account
		BankAccount account5 = openAccount("Taylor", 25);
		System.out.println(account5);

		//Practice
		//1. Add a method to BankAccount called addInterest(double rate)
		//that adds rate percent of the balance to the balance - 5 would add 5%
		//2. Add a private field to keep track of how many withdraws have been made
		//and a getter for it
		//3. Write a static method in this class that takes in a BankAccount[]
		//and returns how many accounts have a balance over 100
	}
	//Objects can be passed to methods just like arrays
	//lets write a method that takes in an array of accounts and returns the total balance
	static double totalBalance(BankAccount[] accounts) {
		double total = 0;
		for (int i = 0; i < accounts.length; i++) {
			total += accounts[i].getBalance();
		}
		return total;
	}
	//lets write a method that returns the account with the most money
	//the return type is BankAccount - methods can return objects
	static BankAccount richest(BankAccount[] accounts) {
		//start by assuming the first one is the richest
		BankAccount best = accounts[0];
		for (int i = 1; i < accounts.length; i++) {
			if (accounts[i].getBalance() > best.getBalance()) {
				best = accounts[i];
			}
		}
		return best;
	}
	//lets write a method that creates a new account with a welcome bonus
	static BankAccount openAccount(String owner, double bonus) {
		BankAccount account = new BankAccount(owner);
		account.deposit(bonus);
		return account;
	}

}
