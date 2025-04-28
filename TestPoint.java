package tester;
import com.app.geometry.*;
import java.util.Scanner;
public class TestPoint {
	
	public static void main(String[] args) {
		Point2D ob1 = new Point2D();
		Point2D ob2 = new Point2D();
	
	ob1.acceptCoordinates();
	ob2.acceptCoordinates();
	
	System.out.println(ob1.getDetails());
	System.out.println(ob2.getDetails());
	
	if(ob1.equals(ob2)) {
		System.out.println("Two points are exact same");
	}
	else {
	
	double dist = Point2D.calculateDistance(ob1.getX(), ob1.getY(), ob2.getX(), ob2.getY());
	System.out.printf("Distance between the points: %.2f",dist);
	}
}
}
