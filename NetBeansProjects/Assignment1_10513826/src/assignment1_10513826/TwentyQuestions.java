package assignment1_10513826;
import java.util.Scanner;
public class TwentyQuestions {
    public static void main(String[]args){
        String type, res;
        Scanner input = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and i'll try to guess it.");
        System.out.println();
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        System.out.print("> ");
        type=input.next();
        System.out.println();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        res = input.next();
        System.out.print("My guess is that you are thinking of a ");
        if("animal".equals(type) && "yes".equals(res)){
        System.out.print("moose");
    }
        else if("animal".equals(type) && "no".equals(res)){
        System.out.print("squirrel");
    }
        if("vegetable".equals(type) && "yes".equals(res)){
        System.out.print("watermelon");
}
        else if("vegetable".equals(type) && "no".equals(res)){
        System.out.print("carot");
    }
        if("mineral".equals(type) && "yes".equals(res)){
        System.out.print("Camaro");
}
        else if("mineral".equals(type) && "no".equals(res)){
        System.out.print("paper clip");
}
        System.out.println();
        System.out.println("I would ask you if I'm right, but I don't actually care.");
}
}
