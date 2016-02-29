package assignment1_10513826;
import java.util.Scanner;
public class MoreUserInputofData {
public static void main(String args[]){
   Scanner input= new Scanner(System.in);
   System.out.println("Please enter the following information so i can sell it for a profit");
   String FirstName, LastName,Login;
   int grade,ID;
   double gpa;
   System.out.print("First name: ");
   FirstName=input.next();
   System.out.print("Last name: ");
   LastName=input.next();
   System.out.print("Grade (9-12): ");
   grade= input.nextInt();
   System.out.print("Student ID: ");
   ID=input.nextInt();
   System.out.print("Login: ");
   Login=input.next();
   System.out.print("GPA (0.0-4.0): ");
   gpa=input.nextDouble();
   System.out.println();
   System.out.println("Your information:");
   System.out.println("        Login: "+ Login);
   System.out.println("        ID:    "+ID);
   System.out.println("        Name:  "+LastName +", "+FirstName);
   System.out.println("        GPA:   "+gpa);
   System.out.println("        Grade: "+grade);
}    
}
