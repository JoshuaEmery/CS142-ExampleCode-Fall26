
public class Point {
	//fields - private
	private double x;
	private double y;
	
	//What comes next?
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Methods - getters and setters

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	//method that calculates an returns the distance from origin for a point
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	//What about if we wanted a method that could calculate the distance between two points
	//lets make it static and take in two points
	//If you are going to use a static method for a calculation, you have to 
	//take in everything you need as parameters. You dont have access to the fields
	//from a static method
	public static double distanceBetweenPoints(Point point1, Point point2) {
		double dx = point2.getX() - point1.getX();
		double dy = point2.getY() - point1.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{X: " + x + " Y: " + y + "}";
	}
	
	
	
}
