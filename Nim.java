package assignment2_10513826;
import java.util.Scanner;
public class Nim {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");
        String player1 = input.next();
        System.out.print("Player 2, enter your name: ");
        String player2 = input.next();
        int a=3,b=4,c=5;
        String choice;
        int counter =1;
        while(a>=0 || b>=0 || c>=0){
            System.out.println();
            System.out.println("A:  "+ a +"\t"+"B:  "+b+"\t"+"C:   "+c);
            System.out.println();
            if (counter %2 !=0){
            System.out.print( player1 +", choose a pile: ");
            }
            else if (counter %2 ==0){
            System.out.print( player2 +", choose a pile: ");
            }
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
           counter+=1; 
        }
        if(counter %2==0){
        System.out.println();
        System.out.println(player1+", there are no counters left, so you WIN!");
    }
        else if(counter %2!=0){
        System.out.println();
        System.out.println(player2+", there are no counters left, so you WIN!");
    }
}
}
