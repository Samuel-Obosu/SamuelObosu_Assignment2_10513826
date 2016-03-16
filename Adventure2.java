package assignment2_10513826;
import java.util.Scanner;
public class Adventure2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("MITCHELL'S TINY ADVENTURE 2");
        System.out.println();
        String kitchen ="There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
"there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"\n" +
"or go \"back\".";
        String refrigerator ="Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
"Would you like to eat some of the food? (\"yes\" or \"no\")\n" +">";
        String yes ="The food is slimy and foul, but you manage to choke it down. Your stomach\n" +
"starts jumping like a frog in hot water.  You feel faint. Sliding to the\n" +
"floor, the darkness closes in.\n" +"You have died.";
        String no ="You do not eat the food and eventually starve to death.";
        String back= "You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
"\"kitchen\"?";
        String upstairs =" Upstairs you see a hallway.  At the end of the hallway is the master\n" +
"\"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can\n" +
"go back \"downstairs\". Where would you like to go?\n" +">";
        String bedroom ="You go to the bedroom and take a deep sleep\n "+ "Game Ended";
        System.out.println(back);
        String response = input.next();
        if(response.equals("kitchen")){
            System.out.println(kitchen);
            response = input.next();
            if (response.equals("refrigerator")){
                System.out.println(refrigerator);
                response = input.next();
                if(response.equals("yes")){
                    System.out.println(yes);
                }
                else if(response.equals("no")){
                    System.out.println(no);
                }
            }
            else if(response.equals("back")){
                System.out.println(back);
                response = input.next();
                if(response.equals("upstairs")){
                    System.out.println(upstairs);
                    response = input.next();
                    if(response.equals("downstairs")){
                        System.out.println(back);
                        response = input.next();
                if(response.equals("upstairs")){
                    System.out.println(upstairs);
                    }
               else if(response.equals("kitchen")){
            System.out.println(kitchen);
            response = input.next();
            if (response.equals("refrigerator")){
                System.out.println(refrigerator);
                response = input.next();
                if(response.equals("yes")){
                    System.out.println(yes);
                }
                else if(response.equals("no")){
                    System.out.println(no);
                }
            }
                    else if (response.equals("bedroom")){
                        System.out.println(bedroom);
                    }
                }
                else if(response.equals("kitchen")){
                    System.out.println(kitchen);
                    System.out.println(kitchen);
            response = input.next();
            if (response.equals("refrigerator")){
                System.out.println(refrigerator);
                response = input.next();
                if(response.equals("yes")){
                    System.out.println(yes);
                }
                else if(response.equals("no")){
                    System.out.println(no);
                }
                }
            }
                
                
            
        }
    }
}
}
}
}