import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testBVA1() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(0, 1, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA2() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(201, 1, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA3() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 0, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA4() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 201, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA5() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 1, 0);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA6() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 1, 201);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA7() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(100, 1, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA8() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 100, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA9() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 1, 100);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA10() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(200, 200, 200);
		assertEquals(1, result);
	}
	
	@Test
	public void testBVA11() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(1, 1, 1);
		assertEquals(1, result);
	}
	
	@Test
	public void testBVA12() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(0, 0, 0);
		assertEquals(4, result);
	}
	
	@Test
	public void testBVA13() {
		Triangle test = new Triangle();
		int result = Triangle.triangleType(201, 201, 201);
		assertEquals(4, result);
	}
	
}
