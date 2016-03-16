package assignment2_10513826;
import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;
                int e_count = 0;
                int i_count = 0;
                int o_count = 0;
                int u_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' )
			{
				a_count++;
			}
		}
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'e' || letter == 'E' )
			{
				a_count++;
			}
		}
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'i' || letter == 'I' )
			{
				a_count++;
			}
		}
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'o' || letter == 'O' )
			{
				a_count++;
			}
		}
                for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'u' || letter == 'U' )
			{
				a_count++;
			}
		}

		System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'a' " + e_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'a' " + i_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'a' " + o_count + " times. Isn't that interesting?");
                System.out.println("\nYour message contains the letter 'a' " + u_count + " times. Isn't that interesting?");
	}
}
/*
Q1. The string index goes out of range and produces an error after execution.

Q2.The message 'box' is three characters long and the character 'x' is at position 2

Q3. The code doesn't work for " i <= message.length()" because the indexing of the characters start
from 0, and " i <= message.length()" exeeds the maximum index.
*/