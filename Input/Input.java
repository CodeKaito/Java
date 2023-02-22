// Import java.util.Scanner
// create scanner object
// make some questions

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your last name?");
        String surname = scanner.nextLine();

        System.out.println("Where do you live?");
        String city = scanner.nextLine();

        System.out.println("What's your age?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + " " + surname);
        System.out.println("You have " + age + " years old");
        System.out.println("You live in " + city);
        
    }
}
