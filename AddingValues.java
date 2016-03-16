package assignment2_10513826;
import java.util.Scanner;
public class AddingValues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int number = input.nextInt();
        int sum =0;
        while (number !=0){
            System.out.println("The total so far is " + (sum+=number));
            System.out.print("Number: ");
            number = input.nextInt();
        }
        System.out.println("The total is "+ sum);
    }
}
