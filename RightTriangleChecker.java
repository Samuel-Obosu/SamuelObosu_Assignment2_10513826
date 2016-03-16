package assignment2_10513826;
import java.util.Scanner;
public class RightTriangleChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2 , num3;
        System.out.println("Enter three integers");
        System.out.print("Side 1: ");
        num1 = input.nextInt();
        System.out.print("Side 2: ");
        num2 = input.nextInt();
        while(num2 < num1){
        System.out.println(num2 +" is less than "+ num1 +"  Try again.");
        System.out.print("Side 2: ");
        num2 = input.nextInt();
    }
        System.out.print("Side 3: ");
        num3 = input.nextInt();
        while(num3 < num2){
        System.out.println(num3 +" is less than "+ num2 +"  Try again.");
        System.out.print("Side 2: ");
        num3 = input.nextInt();
    }
        System.out.println("The numbers you entered are "+ num1 + " "+ num2+" "+ num3);
        if((num1*num1)+(num2*num2)==(num3*num3)){
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }
        else{
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
