public class kjn {

		 public static void main(String[] args) {
		  final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		  final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		  int[] numbers = { 2 }; // First prime
		  int number = 2; //Start testing for prime at 2
		 
		  System.out.println("The first 50 prime numbers are \n");
		 
		  // Repeatedly find prime numbers
		  while (numbers.length<= NUMBER_OF_PRIMES) {
		   // Assume the number is prime
		   boolean isPrime = true; // Is the current number prime?
		 
		   // Test if number is prime
		   for (int i = 0; i < numbers.length && numbers[i]<= Math.sqrt(number); i++) { //change from numbers[i]< Math.sqrt(number); i++). See Rafael's comment below.
		    int divisor = numbers[i];
		    if (number % divisor == 0) { // If true, number is not prime
		     isPrime = false; // Set isPrime to false
		     break; // Exit the for loop
		    }
		   }
		 
		   // Add the prime number to array
		   if (isPrime) {
		    numbers= add2Array(numbers, number);
		 
		    if ((numbers.length-1) % NUMBER_OF_PRIMES_PER_LINE == 0) {
		     // Print the number and advance to the new line
		     System.out.println(number);
		    } else
		     System.out.print(number + " ");
		   }
		 
		   // Check if the next number is prime
		   number++;
		  }
		 }
		 
		 // Copy array numbers1 to array numbers2
		 // If the length of array numbers2 is less then array numbers2, return false
		 public static boolean copyArray(int[] source, int[] dest) {
		  if (source.length > dest.length)
		   return false;
		 
		  for (int i = 0; i < source.length; i++) {
		   dest[i] = source[i];
		  }
		  return true;
		 }
		 
		 // Increase array size by one and add integer to the end of array
		 // Return new array
		 public static int[] add2Array(int[] source, int data) {
		 
		  int[] dest = new int[source.length + 1];
		  copyArray(source, dest);
		  dest[source.length] = data;
		  return dest;
		 
		 }
		}
