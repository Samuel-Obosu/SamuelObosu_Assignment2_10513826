package assignment1_10513826;
import java.util.Scanner;
public class ChooseYourOwnAdventure {
    public static void main(String[]args){
        String lvl1,lvl2,lvl3,lvl4,lvl5,lvl6,lvl7,lvl8;
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO SAMMY'S TINY ADVENTURE! ");
        System.out.println();
        System.out.println("You are in a creepy house!  Would you like to go'upstairs' or into the\n" +
"'kitchen'");
        System.out.print("> ");
        lvl1 = input.next();
        System.out.println();
        if("kitchen".equals(lvl1)){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
"there is, as you'd expect, a refrigerator. You may open the 'refrigerator'\n" +
"or look in a 'cabinet'.");
            System.out.print("> ");
            lvl2= input.next();
             System.out.println();
            if("refrigerator".equals(lvl2)){
                System.out.print("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
"Would you like to eat some of the food? ('yes' or 'no')");
                System.out.print("> ");
                lvl3 = input.next();
                 System.out.println();
                if("no".equals(lvl3)){
                    System.out.println("You die of starvation... eventually.");
                }
            }
        }
        else if ("upstairs".equals(lvl1)){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
"'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like\n" +
"to go?");
            System.out.print("> ");
                lvl4 = input.next();
                System.out.println();
                if("bedroom".equals(lvl4)){
                    System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
"bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
"like to open the door? ('yes' or 'no')");
                    System.out.print("> ");
                    lvl5 = input.next();
                    if("no".equals(lvl5)){
                        System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
"I'm tired of making nested if statements.");
                    }
                }
        }
    }
}
