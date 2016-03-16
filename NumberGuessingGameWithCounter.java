package assignment2_10513826;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGameWithCounter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
        System.out.print("Your guess: ");
        int number = input.nextInt();
        int guess = 1 + rand.nextInt(10);
        int count = 1;
        while (number != guess){
           System.out.println("That is incorrect. Guess again.");
           System.out.print("Your guess: ");
           guess = input.nextInt();
           count +=1;
        }
       if(number ==guess)
       {System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you "+ count +" tries");
       }       
    }
}
               
