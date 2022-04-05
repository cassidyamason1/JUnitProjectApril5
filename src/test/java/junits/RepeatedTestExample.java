package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {

	@RepeatedTest(3)
	public void addTest1() {
		
		assertEquals(9,Calculator.addition(4, 5));
		
	}
	
}
