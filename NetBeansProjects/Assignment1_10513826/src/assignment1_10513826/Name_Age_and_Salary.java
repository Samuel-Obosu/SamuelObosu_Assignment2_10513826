package assignment1_10513826;
import java.util.Scanner;
public class Name_Age_and_Salary {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String name;
        int age;
        double salary;
    System.out.println("Hello, What is your name");
    name= input.next();
    System.out.println();
    System.out.println("Hi "+name + "! how old are you");
    age=input.nextInt();
    System.out.println();
    System.out.println("So you're "+ age +", eh? thats not old at all");
    System.out.println("How much do you make, "+ name);
    salary=input.nextDouble();
    System.out.println();
    System.out.println(salary +"! I hope thats for an hour and not for a year! LOL!");
    
}
}
