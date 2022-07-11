import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Age:");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int age = scanner.nextInt();
            System.out.println("Hi, " + name + " Your age is " + age);
        }
        else {
            System.out.println("Cant parse your age");
        }
        scanner.close();
    }
}
