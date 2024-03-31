package project;

public class Project {

	public static void main(String[] args) {
	    // Create an array of integers that contains 3, 9, 23, 64, 2, 8, 28, 93.
	    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	    // Subtract the value of the first element from the value of the last element
	    int result = ages[ages.length - 1] - ages[0];
	    System.out.println(result); // Print the result

	    // Create a new array of integers that contains 9 elements
	    int[] ages2 = new int[]{9, 16, 52, 3, 18, 42, 97, 88, 10};
	    // Repeat the subtraction from the first step
	    int result2 = ages2[ages2.length - 1] - ages2[0];
	    System.out.println(result2); // Print the result

	    // Use a loop to iterate through the array and calculate the average age.
	    double sum = 0;
	    for (int age : ages2) {
	        sum += age;
	    }
	    double averageAge = (double) sum / ages2.length;
	    System.out.println(averageAge); // Print the average age

	    // Create an array of strings called 'names'
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    // Calculate the average number of letters per name
	    double totalLetters = 0;
	    for (String name : names) {
	        totalLetters += name.length();
	    }
	    double averageLetters = totalLetters / names.length;
	    System.out.println(averageLetters); // Print the average number of letters per name

	    // Concatenate all the names together, separated by spaces
	    StringBuilder concatNames = new StringBuilder();
	    for (String name : names) {
	        concatNames.append(name).append(" ");
	    }
	    System.out.println(concatNames); // Print the concatenated names

	    // Create a new array 'nameLengths' to store the lengths of names
	    int[] nameLengths = new int[names.length];
	    for (int i = 0; i < names.length; i++) {
	        nameLengths[i] = names[i].length();
	    }
	    System.out.println(names.length); // Print the length of the 'names' array

	    // Calculate the sum of all the elements in the 'nameLengths' array
	    int lengthSum = 0;
	    for (int length : nameLengths) {
	        lengthSum += length;
	    }
	    System.out.println(lengthSum); // Print the sum of name lengths

	    // Part of prompt #7
	    String repeatedWord = repeatWord("Hello", 3);
	    System.out.println(repeatedWord); // Print the repeated word

	    // Part of prompt #8
	    String fullName = fullName("John", "Hendrix");
	    System.out.println(fullName); // Print the full name

	    // Part of prompt #9
	    int[] numbers = {3, 53, 12, 40};
	    System.out.println(sumOf100(numbers)); // Print whether the sum of numbers is greater than 100

	    // Part of prompt #10
	    double[] randomNumbers = {4.2, 8.7, 16.4, 8.6};
	    System.out.println(arrayAverage(randomNumbers)); // Print the average of random numbers

	    // Part of prompt #11
	    double[] numArray1 = {1.3, 7.3, 10.7, 8.8};
	    double[] numArray2 = {3.5, 6.9, 8.2, 0.5};
	    System.out.println(averageArrays(numArray1, numArray2)); // Print whether the average of numArray1 is greater than numArray2

	    // Part of prompt #12
	    System.out.println(willBuyDrink(true, 15.21)); // Print whether to buy a drink based on weather and money in pocket

	    // Part of prompt #13
	    int[] evenNumbers = { 10, 13, 7, 8, 20, 32};
	    System.out.println(numbersEven(evenNumbers)); // Print the sum of even numbers
	}

	// Method to concatenate a word with itself 'n' number of times
	public static String repeatWord(String word, int n) {
	    StringBuilder repeated = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	        repeated.append(word);
	    }
	    return repeated.toString(); // Return the repeated word
	}

	// Method to generate a full name from first name and last name
	public static String fullName(String firstName, String lastName) {
	    return firstName + " " + lastName; // Return the full name
	}

	// Method to check if the sum of numbers in an array is greater than 100
	public static boolean sumOf100(int[] array) {
	    int sum = 0;
	    for (int num : array) {
	        sum += num;
	    }
	    return sum > 100;  // Return whether sum is greater than 100
	}

	// Method to calculate the average of elements in a double array
	public static double arrayAverage(double[] array) {
	    double sum = 0;
	    for (double num : array) {
	        sum += num;
	    }
	    return sum / array.length; // Return the average
	}

	// Method to compare the average of elements in two double arrays
	public static boolean averageArrays(double[] numArray1, double[] numArray2) {
	    return arrayAverage(numArray1) > arrayAverage(numArray2); // Return whether average of first array is greater than second array
	}

	// Method to determine whether to buy a drink based on weather and money in pocket
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50; // Return whether to buy
	}

	// Method to calculate the sum of even numbers in an array
	public static int numbersEven(int[] array) {
	    int sum = 0;
	    for (int num : array) {
	        if (num % 2 == 0) {
	            sum += num;
	        }
	    }
	    return sum; // Return the sum of even numbers
	}
}