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
 * The program below creates four different methods named: Length, CharAt, substring and indexof.
 * The methods take the code of a string but provides a different result based on the particular function. 
 * The length function tests the length of the phrase
 * The CharAt function tests to see what character is at the particular location within the phrase
 * The substring function tests to see what set of characters are grouped together within a phrase
 * The indexof function tests to find the particular letter within the phrase
 */
public class StringTest {
//Creating public class
	public static void main (String[] args) {
//Creating public method	
	}

/* 
 * Gets the length of the string and returns it
 * @param - String
 * @return - int (length of string)
 */
public static int Length(String phrase) {
	int test = phrase.length();
	System.out.print(test);
	return test;
}

/* 
 * Finds whatever character is at the specific location within the phrase
 * @param - String, int/number
 * @return - Character - Whatever the character of the specified location was 
 */
public static char CharAt (String phrase, int x) {
	char test = phrase.charAt(x);
	System.out.print(test);
	return test;
}

/* 
 * Finds substring based on two numbers, specifiying location within phrase
 * @param - String, 2 ints/numbers
 * @return - substring - the characters in the location given by the numbers/ints
 */
public static String substring (String phrase, int x, int x1) {
	String test = phrase.substring(x, x1);
	System.out.print(test);
	return test;
}


/*
 * Finds particular letter within the phrase
 * @param - String & character
 * @return - Int/number - the location of the character within the phrase
 *
 */
public static int indexof(String phrase, char character) {
	int test = phrase.indexOf(character);
	System.out.print(test);
	return test;
}

}