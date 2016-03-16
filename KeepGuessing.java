package assignment2_10513826;
import java.util.Scanner;
import java.util.Random;
public class KeepGuessing {
    public static void main(String[]args ){
        Random myrand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int number = 1+ myrand.nextInt(10);
        int guess = input.nextInt();
        while (guess != number){
           System.out.println("That is incorrect. Guess again.");
           System.out.print("Your guess: ");
           guess = input.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
}
}