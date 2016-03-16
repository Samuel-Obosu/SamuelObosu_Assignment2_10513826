package assignment2_10513826;
import java.util.Random;
public class Dice {
    public static void main(String[]args){
    Random rand = new Random();
    int roll1 = 1+ rand.nextInt(6);
    int roll2 = 1 + rand.nextInt(6);
    System.out.println("HERE COMES THE DICE! ");
    System.out.println();
    System.out.println("Roll#1 is: " + roll1);
    System.out.println("Roll#2 is: " + roll2);
    System.out.println("The total is " + (roll1 + roll2) + "!" );
    
}
}