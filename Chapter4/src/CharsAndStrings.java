/*
 * Some demos of working with the char and String data types.
 * 
 */
import java.util.Scanner;

public class CharsAndStrings {

	public static void main(String[] args) {
		// So far we've talked about 7 primitive data types:
		//  int, long, short, byte
		//  double, float
		//  boolean
		//
		// char is the last primitive data type - it's used to store individual
		//  character values.  char values are denoted using single quotes, and
		//  internally they are stored as 16-bit Unicode.  This means every char
		//  value is associated with a number.  For example, 'A' is 65, and 'a' is 97.
		char x = 'a', y = 'b';
		System.out.println(x);		// Shows a
		System.out.println(y);		// Shows b
		System.out.println(x + y);	// Shows 195 (which came from 97 + 98)
		System.out.println((int)x);	// Casting a char to int shows its numerical value - this shows 97
		System.out.println((char)75);	// Shows K, which is the char with the numerical value of 75
		
		// Declaring String variables and assigning them values
		String word1 = "sloths ";
		String word2 = "are great";
		String s = word1 + word2;	// This is string concatenation, which combines multiple strings into a longer string
		System.out.println(s);
		
		// Reading user input for a string - use nextLine() to read an entire line of input as a string
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("What is your quest?");
		String quest = in.nextLine();
		System.out.println(name + ", " + quest);
	
		// Converting non-string types into strings - just concatenate with the empty string
		int num = 10;
		String numString = "" + num;
		System.out.println(numString);
		
		// Converting strings into non-string types - you can't just cast to int or double!
		String value = "10";
		int valueNum = Integer.parseInt(value);
		double valueDouble = Double.parseDouble(value);
	}

}
