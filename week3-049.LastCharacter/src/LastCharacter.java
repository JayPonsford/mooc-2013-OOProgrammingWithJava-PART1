
import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {

        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();

        System.out.println("Last character: " + lastCharacter(name));

    }

    public static char lastCharacter(String text) {
        
        return text.charAt(text.length()-1);

    }

}
