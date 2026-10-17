
public class IntroToWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A loop is a block of code that runs repeatedly based on some condition
		// boolean value
		
		// while(condition){
		// code we want to repeat
		// }
		
		// while is a pre check loop. checks condition BEFORE each iteration of the loop
		// if the condition is initially false it never runs
		// if the condition never becomes false it runs forever
		
		// Three basic steps
		// 1. setup the variables used by the loop
		// 2. condition that determines how long the loop runs for
		// 3. Update one or more of the variables involved in the condition
		
		int counter = 0;
		while(counter < 5) {
			//do some work in the loop
			System.out.println("Counter: " + counter);
			//update the variable involved in the condition
			counter++;
		}
		//System.out.println(counter);
		//the pattern for a loop that runs x times
		//create a variable set it equal to 0
		//variable < x
		//add 1 to the variable with each iteration of the loop
		
		//Lets make a loop that prints out 10, 9, 8, 7 ... 1
		//Where do I want this variable to start and where do I want it to stop
		//How is the variable changing with each iteration of the loop
		int counter2 = 10;
		while(counter2 > 0) {
			System.out.println(counter2);
			counter2--;
		}
		
		//Lets create a loop that adds up all positive numbers between
		//start and stop [1 and 5]
		int start = 1;
		int stop = 5;
		int total = 0;
		while(start <= stop) {
			//System.out.println("Start: " + start);
			total += start;
			start++;
		}
		//once we exit the loop we have our total
		System.out.println("The total is: " + total);
		
		// Create a loop with a variable that ranges from
		// [10 - 20] - print each even number to the console
		// add each odd number to a total
		
		int counter3 = 10;
		int oddTotal = 0;
		while(counter3 < 21) {
			if(counter3 % 2 == 0) {
				System.out.println("Even: " + counter3);
			}
			else {
				oddTotal += counter3;
			}
			counter3++;
			
		}
		System.out.println("Odd total: " + oddTotal);
		
		//break and continue
		//break immediately exits the loop, locked behind and if
		//continue skips to the next iteration of the loop
		int counter4 = 1;
		while(true) {
			counter4++;
			if(counter4 == 2) {
				continue;
			}
			if(counter4 == 7) {
				break;
			}
			System.out.println("Break and Continue: " + counter4);	
		}
		
		
	}

}
