package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {

	@BeforeAll
	public static void SetUp() {
		System.setProperty("ENV", "DEV"); 
	}
	
	@Test
	public void test1() {
		
		assumeTrue("DEV".equals(System.getProperty("ENV"))); //will skip test case if it is not in dev environment
		//assumeFalse("DEV".equals(System.getProperty("ENV"))); //anything other than dev env will be executed
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
	}
}
