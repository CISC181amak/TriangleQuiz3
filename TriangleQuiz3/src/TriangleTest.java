import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	Triangle triangle1 = new Triangle("", true, 4, 13, 15);
	Triangle triangle2 = new Triangle("", true, 3, 4, 5);

	@Test
	public void testArea1() {
		assertEquals( triangle1.getArea(), 24.0, 0 );
	}
	
	@Test
	public void testArea2() {
		assertEquals( triangle2.getArea(), 6.0, 0 );
	}
	
	@Test
	public void testPerimeter1() {
		assertEquals( triangle1.getPerimeter(), 32.0, 0 );
	}
	
	@Test
	public void testPerimeter2() {
		assertEquals( triangle2.getPerimeter(), 12.0, 0 );
	}

}
