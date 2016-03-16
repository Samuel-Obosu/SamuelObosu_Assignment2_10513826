package assignment2_10513826;
import java.util.Random;
import java.util.Scanner;
public class LimitedHi_Lo {
     public static void main(String []args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1-100. Try to guess it");
        System.out.print("First guess: ");
        int guess = input.nextInt();
        int myguess = 1 + rand.nextInt(100);
        int counter =2;
        while (counter <8&& guess!= myguess){
      
         if (guess < myguess){
            System.out.println("Sorry, you are too low. ");
            System.out.print("Guess #"+ counter +": ");
            guess = input.nextInt();
        }
        else{
            System.out.println("Sorry, you are too high.");
            System.out.print("Guess #"+ counter +": ");
            guess = input.nextInt();
        }
        counter ++;
}
        if (guess == myguess){
            System.out.println("You guessed it!  What are the odds?!?");
        }
        else{
        System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
}
}
}
