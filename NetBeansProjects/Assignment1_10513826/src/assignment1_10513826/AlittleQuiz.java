package assignment1_10513826;
import java.util.Scanner;
public class AlittleQuiz {
    public static void main(String[] args){
        String ans;
        int reply;
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? ");
        ans = input.next();
        System.out.println("Ok, here it comes! ");
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("    1) Melbourne");
        System.out.println("    2) Anchorage");
        System.out.println("    3) Juneau");
        System.out.println();
        System.out.print("> ");
        reply = input.nextInt();
        System.out.println();
        if(reply==3){
            System.out.println("That's right!");
            count+=1;
        }
        else{
            System.out.println("Sorry, wrong answer!");
        }
        System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
        System.out.println("    1) Yes");
        System.out.println("    2) No");
        System.out.println();
        System.out.print("> ");
        reply= input.nextInt();
        System.out.println();
        if(reply==2){
            System.out.println("That's right!");
            count+=1;
        }
        else{
            System.out.println("Sorry,  'cat' is a string. ints can only store numbers.");
        }
        System.out.println();
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("    1) 5");
        System.out.println("    2) 11");
        System.out.println("    3) 15/3");
        System.out.println();
        System.out.print("> ");
        reply= input.nextInt();
        System.out.println();
        if(reply==2){
            System.out.println("That's correct!");
            count+=1;
        }
        else{
            System.out.println("Sorry,  wrong answer!");
        }
        System.out.println();
        System.out.println();
        System.out.println("Overall, you got "+count+" out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}
