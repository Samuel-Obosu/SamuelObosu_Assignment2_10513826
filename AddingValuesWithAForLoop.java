package assignment2_10513826;
import java.util.Scanner;
public class AddingValuesWithAForLoop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number= input.nextInt();
        int sum =0;
        for(int i=1; i<=number; i++){
            sum+=i;
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("The sum is "+ sum);
    }
}
