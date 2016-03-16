package assignment2_10513826;
import java.util.Random;
import java.util.Scanner;
public class AnumberGuessingGame {
    public static void main(String[]args ){
        Random myrand = new Random();
        Scanner input = new Scanner(System.in);
        int guess;
        System.out.println("I'm thinking of a number from 1 to 10");
        System.out.print("your guess: ");
        int myguess = 1+ myrand.nextInt(10);
        guess = input.nextInt();
        
        System.out.println();
        if(guess == myguess){
            System.out.println("That's right! My secret number was "+ myguess);
        }
        else{
            System.out.println("Sorry, but I was really thinking of " + myguess);
        }
    }
}
