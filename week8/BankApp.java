
public class BankApp {

	//Main is static because it needs to be called WITHOUT making an instance
	//of the BankApp class
	//BankApp app = new BankApp();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I can run bankApp because it has a main method
		//I cannot run BankAccount.java, it has no main
		//Create an instance of the back account class
		BankAccount account1 = new BankAccount("Josh", 100);
		//I have to call getters and setters on the instance
		//not the class itself
		System.out.println(account1.getOwner());
		//lets change owners
		account1.setOwner("Joey");
		System.out.println(account1.getOwner());
		//Accessing the field directly - dont do this, bad practice
		//account1.owner = "Josh";
		//System.out.println(account1.owner);
		
		//lets say that owner has to exist, it cannot be an empty string
		//account1.owner = "";
		//account1.owner = "456-567-7897";
		double balance = account1.getBalance();
		double cash = -500;
//		if(account1.deposit(cash)) {
//			System.out.println("Deposit worked: " + account1.getBalance());
//		}
//		else {
//			System.out.println("Deposit failed: " + account1.getBalance());
//		}
		if(account1.withdraw(cash)) {
			System.out.println("Widthdraw worked: " + account1.getBalance());
		}
		else {
			System.out.println("Widthdraw failed: " + account1.getBalance());
		}
		//We cannot directly print out the details of an instance of a class
		//Sysout needs strings
		//Sysout calls the toString() method inside of that class in order
		//to print it out
		System.out.println(account1);
		
		//Calling a static method
		String types = BankAccount.accountTypes();
		System.out.println(types);

	}


}
