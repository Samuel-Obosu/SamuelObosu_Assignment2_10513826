package assignment1_10513826;
import java.util.Scanner;
public class HowOldareYouSpecifically {
    public static void main(String[]args){
        String name;
        int age;
        Scanner input=new Scanner(System.in);
        System.out.print("Hey, what's your name? (sorry, I keep forgetting.) ");
        name= input.next();
        System.out.print("Ok, "+name+ ", how old are you? ");
        age=input.nextInt();
        if(age<16){
            System.out.println("You can't drive, "+name);
        }
        else if(age>=16 && age<=17){
            System.out.println("You can drive but not vote, "+name);
        }
        else if(age>=18 && age<=24){
            System.out.println("You can vote but not rent a car, "+name);
        }
        else if(age>25){
            System.out.println("You can do pretty much everything, "+name);
        }
    }
}
