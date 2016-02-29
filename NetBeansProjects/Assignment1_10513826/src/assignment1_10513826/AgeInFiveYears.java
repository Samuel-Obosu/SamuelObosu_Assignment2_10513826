package assignment1_10513826;
import java.util.Scanner;
public class AgeInFiveYears {
    public static void main(String[]args){
        String name;
        int age;
        System.out.println("Hello. What is your name? ");
        Scanner input=new Scanner(System.in);
        name = input.next();
        System.out.println();
        System.out.print("Hi, "+name+"!  How old are you?");
        age=input.nextInt();
        System.out.println();
        System.out.println("Did you know that in five years you would be "+ (age+5)+ "years old");
        System.out.println("And five years ago you were "+ (age-5)+ "!  Imagine that!");
        
    }
}
