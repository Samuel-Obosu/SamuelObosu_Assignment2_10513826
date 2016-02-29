package assignment1_10513826;
import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String name;
        System.out.print("What is your Last name? ");
        name = input.next();
        if(name.compareTo("Carsewell") <0){
            System.out.println("You don't have to wait long "+ name);
        }
        else if(name.compareTo("Jones") <0){
            System.out.println("that's not bad "+ name);
        }
        else if(name.compareTo("Smith") <0){
            System.out.println("looks like a bit of a wait "+ name);
        }
        else if(name.compareTo("Young") <0){
            System.out.println("it's gonna be a while "+ name);
        }
         else if(name.compareTo("Young") >0){
            System.out.println("not going anywhere for a while? "+ name);
        }
    }
}
