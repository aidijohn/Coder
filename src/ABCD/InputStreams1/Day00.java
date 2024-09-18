package ABCD.InputStreams1;

import java.util.*;
public class Day00 {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
        System.out.println(inputString);
      
	    // ToDo: Write a line of code here that prints the contents of inputString to stdout.
	}
}

//TASK
//ToDo 1: Type your name in the console, and print it
//     2: Type in some names to a list, type exit then display the list of names. {while, for}
//     3: Type in some numbers to a list, after hitting exit, only display the even numbers.
//         ii. Catch error, when a non-number is provided.

