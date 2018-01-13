package dmit2015.model;

public class Rectangle {
	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Rectangle() 
	{
		
	}
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}
	
	public double getPerimeter() {
		double perimeter;
		perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	public double getArea() {
		double area;
		area = length * width;
		return area;
	}
	public double getDiagonal() {
		double diagonalLength;
		diagonalLength = Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2)));
		return diagonalLength;
	}
	

}
