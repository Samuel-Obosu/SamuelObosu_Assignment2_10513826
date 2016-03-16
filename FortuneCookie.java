package assignment2_10513826;
import java.util.Random;
public class FortuneCookie {
    public static void main(String[] args){
    Random rand = new Random();
    int fortune = 1+ rand.nextInt(6);
    System.out.println("Fortune cookie says: ");
    switch (fortune){
        case 1:
            System.out.print("You will find happiness with a new love.");
            break;
        case 2:
            System.out.print("Stick with your wife.");
            break;
        case 3:
            System.out.print("You gonna buy a car soon.");
            break;
        case 4:
            System.out.print("You will be a billonaire.");
            break;
        case 5:
            System.out.print("Don't try gambling.");
            break;
        case 6:
            System.out.print("Gonna get married soon.");
            break;
    }
    System.out.print(1+ rand.nextInt(54)+ " - ");
    System.out.print(1+ rand.nextInt(54)+ " - ");
    System.out.print(1+ rand.nextInt(54)+ " - ");
    System.out.print(1+ rand.nextInt(54)+ " - ");
    System.out.print(1+ rand.nextInt(54)+ " - ");
    System.out.print(1+ rand.nextInt(54));
     
    }

}
