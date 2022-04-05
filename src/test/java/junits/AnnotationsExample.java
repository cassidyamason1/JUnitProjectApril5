package junits;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {

	@BeforeAll
	public static void method3() {
		
		System.out.println("Inside before all");
	}
	
	@BeforeEach
	public void method1() {
		System.out.println("Inside before each");
	}
	@Test
	public void addTest1() {
		assertEquals(9,Calculator.addition(5, 4));
		assertTrue(true);
		
		String[] array1 = {"one", "two", "three"};
		String[] array2 = {"one", "two", "three"};
		
		assertArrayEquals(array1,array2);
		
		System.out.println("Inside Test1");
	}
	
	@Test
	public void addTest2() {
		assertEquals(9,Calculator.addition(5, 4));
		System.out.println("Inside Test2");
	}
	
	@AfterEach
	public void method2() {
		System.out.println("Inside after each");
	}
	
	@AfterAll
	public static void method4() {
		System.out.println("Inside after all");
	}
}
