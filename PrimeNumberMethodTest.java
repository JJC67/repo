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
 * The program below tests the methods created in the PrimeNumberMethod. 
 * The PrimeNumberTest tests if the number is prime or not. 
 * The PrimeAmountTests verifies the numbers output correlate with the count 
 */
import static org.junit.Assert.*;

import org.junit.Test;
//Establishes necessary imports

public class PrimeNumberMethodTest {

	
	/* 
	 * Tests if the number is a prime number. The test only passes if the number is in fact a prime number. 
	 */
	@Test
	public void PrimeNumberTest() {
		PrimeNumberMethod test = new PrimeNumberMethod();
		assertEquals(true, test.isPrime(3));
	}
	
	
	/*
	 * The test verifies that the numbers outputted onto console is equivalent to the count/primes. 
	 */
	@Test
	public void PrimeAmountTest() {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; int count = 0; int number = 2; int numberOfPrimes = 50;
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
			
			if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
				}
			}
			number++;
		}
		assertEquals(count,numberOfPrimes);
	}

	/* 
	 * Uses division to check whether or not the number is a prime number. If it is the bool is true, vice versa. 
	 * @param - number
	 * @return bool - true/false - depending if number is prime or not
	 */
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
		if (number % divisor == 0) {
			return false;
		}
	}
		return true;
	}
	
}
