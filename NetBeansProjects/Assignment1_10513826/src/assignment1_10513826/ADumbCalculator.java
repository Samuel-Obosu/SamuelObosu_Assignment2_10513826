package assignment1_10513826;
import java.util.Scanner;
public class ADumbCalculator {
    public static void main(String[]args){
        double first, second,third;
        System.out.print("What is your first number?");
        Scanner input=new Scanner(System.in);
        first=input.nextDouble();
        System.out.print("What is your second number?");
        second = input.nextDouble();
        System.out.print("What is your third number?");
        third = input.nextDouble();
        System.out.println();
        double result = first+ second +third;
        System.out.print("( "+first+" + "+second+ " + "+third+ " )"+ " / 2 is....."+ result);
    }
}
