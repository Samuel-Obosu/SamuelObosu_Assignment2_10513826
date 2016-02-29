package assignment1_10513826;
import java.util.Scanner;
public class BMICategories {
    public static void main(String[]args){
        double height,weight,BMI;
        Scanner input =new Scanner(System.in);
        System.out.print("Your height in m: ");
        height = input.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = input.nextDouble();
        weight*=0.453592;
        BMI = weight/(height*height);
        System.out.println();
        System.out.print("Your BMI is "+BMI);
        if(BMI < 15.0){
        System.out.println("Very severely underweight");    
        }
        else if(BMI >=15.0 && BMI<=16.0){
        System.out.println("Severely underweight");    
        }
         else if(BMI >=16.1 && BMI<=18.4){
        System.out.println("Underweight");    
        }
         else if(BMI >=18.5 && BMI<=24.9){
        System.out.println("Normal weight");    
        }
         else if(BMI >=25.0 && BMI<=29.9){
        System.out.println("Over weight");    
        }
         else if(BMI >=30.0 && BMI<=34.9){
        System.out.println("moderately obese");    
        }
         else if(BMI >=35.0 && BMI<=39.9){
        System.out.println("severely obese");    
        }
         else if(BMI >=40){
        System.out.println("very severely (or \"morbidly\") obese");    
        }
    }
}
