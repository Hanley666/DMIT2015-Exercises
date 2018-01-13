package dmit2015.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testAll() 
	{
		// Create a rectangle object
		Rectangle rectangle1 = new Rectangle();
		//Set the Width to 5
		rectangle1.setWidth(5);
		//set the length to 10
		rectangle1.setLength(10);
		//Verify Area
		assertEquals(50, rectangle1.getArea(), 0);
		//Verify Perimeter
		assertEquals(30, rectangle1.getPerimeter(), 0);
		//Verify Diagonal
		assertEquals(11.18, rectangle1.getDiagonal(), 0.01);
		
	}

}
