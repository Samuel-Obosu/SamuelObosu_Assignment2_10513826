package assignment2_10513826;
import java.util.Scanner;
public class CountingWhile {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
                System.out.print("How many times? ");
                int times = keyboard.nextInt();
		int n = 0;
		while ( n < times )
		{
                    if (n==0){
			System.out.println( (n+10) + ". " + message );
			n++;
		}
                    else {
                        System.out.println( ((n+1)*10) + ". " + message );
			n++;
                    }
                }
	}
}
/*
Q1. n++ is the increment operator. If removed, the code will run endlessly.

*/