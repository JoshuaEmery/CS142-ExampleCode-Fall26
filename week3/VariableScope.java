import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable are scoped to the code block in which they are declared
		//x lives and dies within this code block
		{
			int x = 5;
		}
		//once I leave this code block x no longer exists
		//if I make another code block with an x variable
		//this does not create problems
		{
			int x = 20;
		}
		//I can make a variable called base in main and it will not conflict with
		//the base inside of the area method
		double base = 25;
		double height = 10;
		double area = areaTriangle(base, height);
		System.out.println("The area is: " + area);
	}
	//base, height and area are all scoped to this method
	static double areaTriangle(double base, double height) {
		double area = base * height / 2.0;
		return area;
	}

}
