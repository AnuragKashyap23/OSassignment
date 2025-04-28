package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		this.x=0;
		this.y=0;
	}
	public Point2D(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}
	
	public String getDetails() {
		return "("+Integer.toString(x)+","+Integer.toString(y)+")"; 
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if(!(obj instanceof Point2D))
			return false; 
		Point2D other = (Point2D) obj;
		if (this.getX()==other.getX() && this.getY()==other.getY())
			return true;
		return false;
	}
	
	public static double calculateDistance(int x1, int x2, int y1, int y2) {
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		return distance;
	}
	public void acceptCoordinates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		setX(sc.nextInt());
		System.out.println("Enter value of y: ");
		setY(sc.nextInt());
	
	
}
}


