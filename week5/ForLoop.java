
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For loop is really just a shortcut for a while loop
		//for(st1; st2; st3){}
		// st1 runs once before the loop starts (setup variables)
		// st2 - condition that is checked before each iteration
		// st3 runs at the end of each iteration of the loop (change variables)
		// we typically use i as the variable in a for loop
		for(int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
		}
		//i is no longer in scope here
		//once we exit the loop we cannot get to i unless
		//we declare i before the loop
		//System.out.println(i);
		
		
	}

}
