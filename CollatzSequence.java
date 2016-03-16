package assignment2_10513826;
import java.util.Scanner;
public class CollatzSequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Starting number: ");
        int num = input.nextInt();
        int count =0,max=num;
        System.out.print(num+"\t");
        while( num!= 1){
            int num1;
            if(num% 2==0){
                num /=2;
                 num1= num/2;
                System.out.print(num+"\t");
                if(num1 > num){
                    max =num1;
                }
            }
            else{
                num = (num*3)+1;
                num1 = (num*3)+1;
                System.out.print(num+"\t");
                if(num1 > num){
                    max =num1;
                }
            }
            count+=1;
        }
        System.out.println();
        System.out.print("Terminated after "+count +"steps. ");
        System.out.print("The largest value was "+ max);
        System.out.println();
    }
}
