import java.util.Scanner;

public class ReadingNumbersChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter the " + order + "th number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                if (counter > 9) break;
            } else {
                System.out.println("invalid number entered.");
            }

            scanner.nextLine();

        }
        System.out.println("sum="+sum);
        scanner.close();
    }
}