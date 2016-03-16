package assignment2_10513826;
import java.util.Scanner;
public class BabyNim {
    public static void main(String[] args){
        int a,b,c;
        a=b=c=3;
        String choice;
        Scanner input = new Scanner(System.in);
        while(a>0 || b>0 || c>0){
            System.out.println();
            System.out.println("A:  "+ a +"\t"+"B:  "+b+"\t"+"C:   "+c);
            System.out.println();
            System.out.print("Choose a pile: ");
            choice = input.next();
            int pile;
            if(choice.equals("A")){
                System.out.print("How many to remove from pile A: ");
                pile = input.nextInt();
                if(pile==1){
                    a-=1;
                }
                else if(pile==2){
                    a-=2;
                }
                else if(pile==3){
                    a-=3;
                }
            }
            else if(choice.equals("B")){
                System.out.print("How many to remove from pile B: ");
                pile = input.nextInt();
                if(pile==1){
                    b-=1;
                }
                else if(pile==2){
                    b-=2;
                }
                else if(pile==3){
                    b-=3;
                }
            }
            if(choice.equals("C")){
                System.out.print("How many to remove from pile C: ");
                pile = input.nextInt();
                if(pile==1){
                    c-=1;
                }
                else if(pile==2){
                    c-=2;
                }
                else if(pile==3){
                    c-=3;
                }
            }
            
        }
        System.out.println();
        System.out.println("All piles are empty. Good job!");
    }
}
