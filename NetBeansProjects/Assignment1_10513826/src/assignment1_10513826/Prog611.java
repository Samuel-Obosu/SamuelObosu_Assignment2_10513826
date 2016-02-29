package assignment1_10513826;
import javax.swing.*;
public class Prog611 {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("What is your name?");
        
        String input = JOptionPane.showInputDialog("How old are you?");
        int age= Integer.parseInt(input);
        System.out.print("Hello "+name +" .");
        //JOptionPane.showMessageDialog(null,"Next year, you'll be "+ (age+1));
        System.out.println("Next year, you'll be "+ (age+1));
        System.exit(0);
    }
}
