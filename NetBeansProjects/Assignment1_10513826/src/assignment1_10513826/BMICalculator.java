package assignment1_10513826;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[]args){
        double Fheight,Iheight,height,weight,BMI;
        Scanner input =new Scanner(System.in);
        System.out.print("Your height (feet only): ");
        Fheight = input.nextDouble();
        System.out.print("Your height (inches): ");
        Iheight = input.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = input.nextDouble();
        weight*=0.453592;
        Iheight*=0.0254;
        Fheight*=0.3048;
        height= Fheight+Iheight;
        BMI = weight/height;
        System.out.println();
        System.out.print("Your BMI is "+BMI);
        
    }
}
