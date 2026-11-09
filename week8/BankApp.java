
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling a static method
		//we call it on the class name, we have not made any accounts yet
		System.out.println("Account types: " + BankAccount.accountTypes());

		//Making instances of BankAccount - using the constructor
		//dataType variableName = new ClassName(arguments);
		BankAccount account1 = new BankAccount("Josh", 100);
		BankAccount account2 = new BankAccount("Sam", 50);

		//println calls our toString method for us
		System.out.println(account1);
		System.out.println(account2);

		//I use the instance variable and a . to access the methods
		//getters
		System.out.println(account1.getOwner() + "'s balance is " + account1.getBalance());

		//setters
		account2.setOwner("Samantha");
		System.out.println(account2);

		//deposit and withdraw
		//each account has its OWN fields
		//changing account1 does not change account2
		account1.deposit(25);
		account2.withdraw(10);
		System.out.println("After deposit and withdraw");
		System.out.println(account1);
		System.out.println(account2);
	}

}
