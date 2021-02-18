import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author muhdakmaldanial
 */
public class Main {

    //For main program
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String input = String.valueOf(scanner.nextLine());
        DisplayAddress displayAddress = new DisplayAddress();
        displayAddress.display(input);
    }

    //For unit test
    static void main(String args) {
        System.out.println("Input: ");
        System.out.println(args);
        String input = String.valueOf(args);
        DisplayAddress displayAddress = new DisplayAddress();
        displayAddress.display(input);
    }
}
