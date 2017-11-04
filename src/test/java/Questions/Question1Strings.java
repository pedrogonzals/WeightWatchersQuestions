package Questions;

import java.util.Scanner;

public class Question1Strings {
	/**
	 * Given a string, reverse each word in it and reverse the entire string.
	 * For example, if the given string is “hope you are doing well”, then the
	 * output should be “llew gniod era uoy epoh”.
	 * 
	 * Assume that all characters in the string are lower case. Create a method
	 * called reverseEverything(String s) where ‘s’ is the input from the user
	 * in order to solve this question.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputPhrase;

		Scanner in = new Scanner(System.in);

		// Get input String from console
		System.out.println("Enter a string: ");
		inputPhrase = in.nextLine();

		System.out.println("Input String is: " + inputPhrase);
		System.out.println("Original String: " + inputPhrase);

		// passes input reverse method
		reverseEverything(inputPhrase);

	}

	public static void reverseEverything(String s) {
		StringBuilder b = new StringBuilder(s);
		System.out.println("Reverse String: " + b.reverse());
	}

}
