package Input;
// Import java.util.Scanner
// create scanner object
// make some questions

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
