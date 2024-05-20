/* 
 * Class: CSMC 201
 * Instructor: Dr. Grinberg
 * Description: Working with test trials
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student. 
 * Print your Name here: Jasper Caple
 */

/*
 * @author Jasper Caple
 * The program tests each of the four methods(Length,CharAt,substring, indexof), created in StringTest
 * 
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;
//Importing everything necessary to run program 

public class TestStringTest {

	
	/*
	 * Tests the length of the phrase. Requires a parameter. Output is 4. 
	 */
	@Test
	public void testlength() {
		StringTest test = new StringTest();
		assertEquals(4, test.Length("test"));
	}

	/*
	 * Tests if method can identify the correct letter at the corresponding position. Parameter - string and int/num.
	 */
	@Test
	public void testCharAt() {
		StringTest test = new StringTest();
		assertEquals('x', test.CharAt("Axel Rose", 1));
	}
	
	/*
	 * Tests if method can identify substring based on starting and end points. parameter - string. 
	 */
	@Test
	public void testSubstring() {
		StringTest test = new StringTest();
		assertEquals("ing Mcq", test.substring("Lightning Mcqueen", 6, 13));
	}
	
	/* 
	 * Tests if method can identifys a particular letter within the phrase. Parameter - string and character
	 */
	@Test
	public void testIndexof() {
		StringTest test = new StringTest();
		assertEquals(5, test.indexof("Saskatchewan", 't'));
	}
}
