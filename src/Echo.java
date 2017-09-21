import javax.swing.*;
import java.util.Scanner;

public class Echo {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Boolean Value");
        boolean booleanVar = keyboard.nextBoolean();
        System.out.println("Enter a Character");
        char charVar = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "You have just entered the boolean value of \'" + booleanVar + "\' You have just entered a character value of \'" + charVar +"\'");

    }
}
