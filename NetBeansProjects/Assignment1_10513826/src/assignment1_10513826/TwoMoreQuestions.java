package assignment1_10513826;
import java.util.Scanner;
public class TwoMoreQuestions {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String ans1 , ans2;
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        ans1 = input.next();
        System.out.print("Question 2) Is it a living thing? ");
        ans2 = input.next();
        System.out.println();
        if("outside".equals(ans1)&& "yes".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a bison");
        }
        if("outside".equals(ans1)&& "no".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a billboard");
        }
        if("inside".equals(ans1)&& "yes".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a houseplant");
        }
        if("outside".equals(ans1)&& "no".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a shower curtain");
        }
        if("both".equals(ans1)&& "yes".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a dog");
        }
        if("both".equals(ans1)&& "no".equals(ans2)){
            System.out.println("Then what else could you be thinking of besides a cell phone");
        }
    }
}
