package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;


public class CalculatorTest {

	@Test
	@Tag("Sanity")
	public void addTest1() {
		
		assertEquals(9,Calculator.addition(4, 5));
		
	}
	
	@Tag("Sanity")
	@Test
	public void addTest2() {
		
		assertEquals(4,Calculator.subtraction(9, 5));
		
	}
}
