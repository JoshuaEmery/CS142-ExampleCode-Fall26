
public class LineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lets make a line
		//passing x1, y1, x2, y2
		Line line1 = new Line(-2, 3.2, -10, 7);
		//passing two points
		Point p1 = new Point(4, -5);
		Point p2 = new Point(10, 20);
		Line line2 = new Line(p1, p2);
		System.out.println("Line 1: " + line1);
		System.out.println("Line 2: " + line2);
		//lets assume that once a line is create we dont want the points
		//to be able to be changed
		//Can I change the points of these lines?
		//if I change p1 I have changed the point inside of line 2
		p1.setX(40);
		p1.setY(-50);
		System.out.println("Line 2: " + line2);
		//what about line1? Can I change the points inside of there?
		//because the getter returns the Point objects, I can call the set
		//functions inside of point
		line1.getP1().setX(-20);
		line1.getP1().setY(32);
		System.out.println("Line 2: " + line2);
		
		
		
	}

}
