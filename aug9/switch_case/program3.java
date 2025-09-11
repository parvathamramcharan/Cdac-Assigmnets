//Problem 3: Traffic Light System
//Write a program that takes a character input (R, Y, G) and prints the corresponding
// traffic light action (Stop, Wait, Go). Use a switch statement to handle the conversion.

package aug9_switchCase;
import java.util.*;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        switch(ch){
            case 'R' : System.out.println("Stop"); break;
            case 'Y' :System.out.println("Wait"); break;
            case 'G' : System.out.println("Go"); break;
            default : System.out.println("enter valid symbol");
        }
    }
}
