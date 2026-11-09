
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This starts the same as week 8
		//Look for the NEW comments to see what changed

		//Calling a static method
		//we call it on the class name, we have not made any accounts yet
		System.out.println("Account types: " + BankAccount.accountTypes());
		//NEW - static field in action. No accounts yet, so it is still 1000
		System.out.println("Next account number: " + BankAccount.getNextAccountNumber());

		//Making instances of BankAccount - using the constructor
		//dataType variableName = new ClassName(arguments);
		BankAccount account1 = new BankAccount("Josh", 100);
		BankAccount account2 = new BankAccount("Sam", 50);
		//NEW - using the overloaded constructor, starts with $0
		BankAccount account3 = new BankAccount("Alex");

		//println calls our toString method for us
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		//I use the instance variable and a . to access the methods
		//getters
		System.out.println(account1.getOwner() + "'s balance is " + account1.getBalance());
		System.out.println(account1.getOwner() + "'s account number is " + account1.getAccountNumber());

		//setters
		account2.setOwner("Samantha");
		System.out.println(account2);
		//NEW - there is no setBalance anymore, this will not compile
		//account2.setBalance(1000000);

		//deposit and withdraw
		//each account has its OWN fields
		//changing account1 does not change account2
		account1.deposit(25);
		account2.withdraw(10);
		System.out.println("After deposit and withdraw");
		System.out.println(account1);
		System.out.println(account2);

		//NEW - withdraw returns true or false so we can check if it worked
		if (account3.withdraw(20)) {
			System.out.println("Withdraw worked");
		} else {
			System.out.println("Not enough money in " + account3.getOwner() + "'s account");
		}

		//NEW - The validation in our class protects the object from bad data
		//Each of these will throw an exception and crash the app
		//account1.deposit(-500);
		//BankAccount badAccount = new BankAccount("", 10);
		//BankAccount badAccount2 = new BankAccount("Bob", -10);

		//NEW - Objects as parameters - pass one account to another account's method
		account1.transferTo(account3, 75);
		System.out.println("After transfer");
		System.out.println(account1);
		System.out.println(account3);

		//NEW - Objects are stored by reference not value
		//sameAccount is NOT a new account. It is a second variable pointing at
		//the SAME object in the heap as account1
		BankAccount sameAccount = account1;
		sameAccount.deposit(1000);
		System.out.println("Account 1 balance: " + account1.getBalance());

		//NEW - == vs .equals
		//== checks if they point to the same object
		//.equals uses the method we wrote and compares account numbers
		//account4 has the same owner and balance as account1 but a different account number
		BankAccount account4 = new BankAccount("Josh", 1050);
		System.out.println("account1 == sameAccount: " + (account1 == sameAccount));
		System.out.println("account1 == account4: " + (account1 == account4));
		System.out.println("account1.equals(account4): " + account1.equals(account4));

		//NEW - We can make arrays of objects just like arrays of ints or Strings
		BankAccount[] accounts = { account1, account2, account3, account4 };
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
	//NEW - Objects can be passed to methods just like arrays
	//lets write a method that takes in an array of accounts and returns the total balance
	static double totalBalance(BankAccount[] accounts) {
		double total = 0;
		for (int i = 0; i < accounts.length; i++) {
			total += accounts[i].getBalance();
		}
		return total;
	}
	//NEW - lets write a method that returns the account with the most money
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
	//NEW - lets write a method that creates a new account with a welcome bonus
	static BankAccount openAccount(String owner, double bonus) {
		BankAccount account = new BankAccount(owner);
		account.deposit(bonus);
		return account;
	}

}
