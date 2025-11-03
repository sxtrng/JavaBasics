import java.util.Scanner;

public class ScannerOne {
    public static void main(String[] args) {

        String textInput;
        int numericalInput; 


        Scanner scanner = new Scanner(System.in);

        System.out.print("Type Some Words: ");
        textInput = scanner.nextLine();

        System.out.println("You Typed: " + textInput + " ");

        System.out.print("Enter a Whole Number: ");
        numericalInput = scanner.nextInt();

        System.out.println("Your numerical entry: " + numericalInput);

    }
}