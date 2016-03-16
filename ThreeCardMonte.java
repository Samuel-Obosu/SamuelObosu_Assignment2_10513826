package assignment2_10513826;
import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonte {
    public static void main(String [] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
"He glances at you out of the corner of his eye and starts shuffling.\n" +
"He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?\n" +
"\n" +
"	##  ##  ##\n" +
"	##  ##  ##\n" +
"	1   2   3\n");
        int card = 1+ rand.nextInt(3);
        int guess = input.nextInt();
        System.out.println();
        if (card == guess){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");
        }
        else{
            System.out.println("Ha! Fast Eddie wins again! The ace was card number "+ card+ "\n");
        }
        if(card==1){
            System.out.println(
"	AA  ##  ##\n" +
"	AA  ##  ##\n" +
"	1   2   3\n");
        }
        else if (card ==2){
            System.out.println(
"	##  AA  ##\n" +
"	##  AA  ##\n" +
"	1   2   3\n");
        }
        else{
            System.out.println(
"	##  ##  AA\n" +
"	##  ##  AA\n" +
"	1   2   3\n");
        }
        }
        
    }
