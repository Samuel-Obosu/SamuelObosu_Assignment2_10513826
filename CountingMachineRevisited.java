package assignment2_10513826;
import java.util.Scanner;
public class CountingMachineRevisited {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int from = input.nextInt();
        System.out.print("Count to: ");
        int to = input.nextInt();
        System.out.print("Count by: ");
        int by = input.nextInt();
        System.out.println();
        for (int i = from; i<=to; i=i+by){
            System.out.print(i+ " ");
        }
    }
}
