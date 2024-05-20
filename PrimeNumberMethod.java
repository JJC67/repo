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
 * 
 */
public class PrimeNumberMethod {
		  public static void main(String[] args) {
		    System.out.println("The first 50 prime numbers are \n");
		    printPrimeNumbers(50);
		    /*
		     * @param - 50 - the amount of prime numbers which will be displayed onto console. Note - only prime numbers
		     * are displayed. 
		     */
		  }

		  public static void printPrimeNumbers(int numberOfPrimes) {
		    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		    int count = 0; // Count the number of prime numbers
		    int number = 2; // A number to be tested for primeness

		    // Repeatedly find prime numbers
		    while (count < numberOfPrimes) {
		      // Print the prime number and increase the count
		      if (isPrime(number)) {
		        count++; // Increase the count

		        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
		          // Print the number and advance to the new line
		          System.out.printf("%-5s\n", number);
		        }
		        else
		          System.out.printf("%-5s", number);
		      }

		      // Check if the next number is prime
		      number++;
		    }
		  }

		  /** Check whether number is prime */
		  public static boolean isPrime(int number) {
		    for (int divisor = 2; divisor <= number / 2; divisor++) {
		      if (number % divisor == 0) { // If true, number is not prime
		        return false; // number is not a prime
		      }
		    }

		    return true; // number is prime
		  }
		}
	
