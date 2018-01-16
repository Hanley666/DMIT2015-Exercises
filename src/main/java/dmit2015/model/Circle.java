package dmit2015.model;

/**
 * The Circle Class Models a Circle Shape.
 * @author Chris Hanley
 *@version 2018.01.15
 *
 */
public class Circle {

	/** The Radius of the circle */
	private double radius;
	
	/**
	 * return the radius of the circle
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Set the radius 
	 * @param radius the value to store in the radius field
	 */
	public void setRadius(double radius) {
		if (radius >= 0)
		this.radius = radius;
	}

	/**
	 * Construct a Circle with a radius of 1
	 */
	public Circle() 
	{
		radius = 1;
	}

	/**
	 * Constructing a Circle with the radius of a specified value
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	/**
	 * Returns the area of the circle using the formula:
	 * area = PI * radius * radius
	 * @return the calculated area of the circle
	 */
	public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
	
	/**
	 * Returns the Circumference of the circle using the formula:
	 * Circumference = 2 * PI * radius
	 * @return the calculated circumference of the circle
	 */
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Returns the Diameter of the circle using the formula:
     * diameter = 2 * radius
     * @return the calculated diameter of the circle
     */
    public double getDiameter()
    {
        return 2 * radius;
    }
	
}
