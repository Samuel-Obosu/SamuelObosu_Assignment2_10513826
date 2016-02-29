package assignment1_10513826;
import java.util.Scanner;
public class AgeMessages3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Your name: ");
        name = input.next();
        System.out.print("Your age: ");
        age = input.nextInt();
        System.out.println();
        if(age <16){
            System.out.println("You can't drive, "+name);
        }
        if(age>=16 && age<=17){
        System.out.println("You can drive but not vote, "+name);    
        }
        if(age>=18 && age<=24){
         System.out.println("You can vote but not rent a car, "+name);   
        }
        if(age>=25){
            System.out.println("You can do pretty much everything, "+ name);
        }
    }
}
