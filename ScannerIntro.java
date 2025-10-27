import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x;
        char x2;

        System.out.print("Enter a character: ");
        x = scanner.nextLine();
        x2 = x.charAt(0);

        System.out.println(x);
        System.out.println(x2);


        String name;
        System.out.print("Enter a Word: ");
        name = scanner.nextLine();
        System.out.println("You Entered: " + name);

        int wholeNumber;
        System.out.print("Enter a  whole number: ");
        wholeNumber = scanner.nextInt();
        System.out.println("You Entered: " + wholeNumber);

        double decimalNumber;
        System.out.print("Enter a number with a decimal place: ");
        decimalNumber = scanner.nextDouble();
        System.out.println("You Entered: " + decimalNumber);

        boolean maybe;
        System.out.print("Enter \"true\" or \"false\": ");
        maybe = scanner.nextBoolean();
        System.out.println("Your Entered: " + maybe);


        scanner.close();
    }
}