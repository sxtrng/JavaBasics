import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

        String word;
        int number;


        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Enter a word: ");
        word = scanner.nextLine();
        System.out.println("You entered: " + word);  
        System.out.print("1a. Enter a number: ");
        number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.nextLine();  //  try removing

        System.out.print("2. Enter more words: ");
        word = scanner.nextLine();
        System.out.println("You entered: " + word);  
        System.out.print("2a. Enter a number: ");
        number = scanner.nextInt();
        System.out.println("You entered: " + number);
         scanner.nextLine();  //  try removing

        System.out.print("3. Enter more words: ");
        word = scanner.nextLine();
        System.out.println("You entered: " + word);  
        System.out.print("3a. Enter a number: ");
        number = scanner.nextInt();
        System.out.println("You entered: " + number);
         scanner.nextLine();  //  doesn't matter now
        System.out.println("Finished");


          scanner.close();

    }
}
