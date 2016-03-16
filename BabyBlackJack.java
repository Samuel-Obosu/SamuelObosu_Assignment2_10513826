package assignment2_10513826;
import java.util.Random;
public class BabyBlackJack {
    public static void main(String[]args){
    Random rand = new Random();
    System.out.println("Baby BlackJack!\n");
    int num1 =1+ rand.nextInt(10);
    int num2 =1+ rand.nextInt(10);
    int dealer1 =1+ rand.nextInt(10);
    int dealer2 =1+ rand.nextInt(10);
    int sum1 =num1+num2;
    int sum2 =dealer1+dealer2;
    System.out.println("You drew "+ num1 + " and "+ num2);
    System.out.println("Your total is "+ sum1+ "\n");
    System.out.println("The dealer has "+ dealer1 + " and "+ dealer2);
    System.out.println("Dealer's total is "+ sum2);
    if(sum1>sum2){
        System.out.println("YOU WIN!");
    }
    else{
        System.out.println("DEALER WINS!");
    }
    
}
}