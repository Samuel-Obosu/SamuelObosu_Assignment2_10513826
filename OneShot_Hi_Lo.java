package assignment2_10513826;
import java.util.Scanner;
import java.util.Random;
public class OneShot_Hi_Lo {
    public static void main(String []args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1-100. Try to guess it");
        System.out.println();
        int guess = input.nextInt();
        int myguess = 1 + rand.nextInt(100);
        if (guess == myguess){
            System.out.println("You guessed it!  What are the odds?!?");
        }
        else if (guess < myguess){
            System.out.println("Sorry, you are too low.  I was thinking of " + myguess);
        }
        else{
            System.out.println("Sorry, you are too high.  I was thinking of " + myguess);
        }
}
}