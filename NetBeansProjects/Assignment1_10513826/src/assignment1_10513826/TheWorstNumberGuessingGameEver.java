package assignment1_10513826;
import java.util.Scanner;
public class TheWorstNumberGuessingGameEver {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int secret=10,guess;
        System.out.println("THE WORST NUBMER GESSING GAME EVAR!!!!!!!!!");
        System.out.println();
        System.out.print("I\"M THKING OF A NUMBER FROM 1-10.  TRY 2 GUESS! ");
        guess = input.nextInt();
        if(guess==secret){
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 10!");
            System.out.println();
            System.out.println("/me walks away shaking his head....");
        }
        else{
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 10!");
        }
    }
}
