package assignment2_10513826;
import java.util.Scanner;
public class SafeSquareRoot {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        while (num <0){
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            num = input.nextInt();
        }
        System.out.println("The square root of " + num + " is " + Math.sqrt(num));
    }
}
