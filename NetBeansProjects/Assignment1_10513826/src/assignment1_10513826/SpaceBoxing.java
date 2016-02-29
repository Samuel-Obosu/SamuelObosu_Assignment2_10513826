package assignment1_10513826;
import java.util.Scanner;
public class SpaceBoxing {
    public static void main(String[]args){
        double weight;
        int planet;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your current earth weight: ");
        weight=input.nextDouble();
        System.out.println("I have information for the following planets: ");
        System.out.println("    1. Venus    2.Mars    3.Jupiter");
        System.out.println("    4. Saturn   5.Uranus  6.Neptune");
        System.out.println();
        System.out.println("Which planet are you visiting? ");
        planet=input.nextInt();
        System.out.println();
        if (planet==1){
            weight*=0.78;
        }
        else if(planet==2){
            weight*=0.39;
        }
        else if(planet==3){
            weight*=2.65;
        }
        else if(planet==4){
            weight*=1.17;
        }
        else if(planet==5){
            weight*=1.05;
        }
        else if(planet==6){
            weight*=1.23;
        }
        System.out.println("Your weight should be "+ weight+" on that planet.");
    }
}
