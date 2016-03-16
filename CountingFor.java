package assignment2_10513826;
import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for (int n=2  ; n <= 10 ; n=n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}
/*
Q1. n+1 is the increment expression in the for loop. Without it the loop will loop for an infinte number of times

Q2. int n=1 is the initial value assigned to n. Without it the variables 'n' used subsequently in the code will be 
unidentified.

*/