package assignment2_10513826;
import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
		do
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}while ( again.equals("y") );
	}
}
/*
Q1. If the value in step 1 is deleted the string variable again has no assigned value and cannot be
used as comparison. The program works when changed to a do while loop since it executes for the first
time and allow the user to decide subsequently.
*/
