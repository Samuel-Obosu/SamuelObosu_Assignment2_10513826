package assignment1_10513826;
import java.util.Scanner;
public class GenderGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sex, Fname,Lname,status;
        int age;
        System.out.print("What is your gender (M or F): ");
        sex = input.next();
        System.out.print("First name: ");
        Fname =input.next();
        System.out.print("Last name: ");
        Lname = input.next();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.println();
        if("f".equals(sex)&& age>=20){
        System.out.println("Are you married "+Fname+" (y or n)? ");
        status = input.next();
            if("y".equals(status)){
        System.out.println();
        System.out.println("Then i shall call you Mrs. "+Lname);
        }
            else if("n".equals(status)){
        System.out.println();
        System.out.println("Then i shall call you Ms. "+Lname);
        }
        }
        else if("m".equals(sex)&& age>=20){
        System.out.println("Then i shall call you Mr. "+Lname);
        }
        else{
            System.out.println("Then i shall call you "+Fname+" "+Lname);
        }
    }
}
