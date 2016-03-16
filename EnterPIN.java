package assignment2_10513826;
import java.util.Scanner;
public class EnterPIN {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}

/* Q1. Both the while loop and the for loop test for a condition and apply an increment or decrement after
every loop.

 Q2. A for loop consits of an initialization whilst a while loop has no initialization

 Q3. The entry variable has already been declared in line 7.

 Q4. The entry variable is underlined with a red sqigly line. This is because the variable entry
has not been declared.

 Q5.
*/