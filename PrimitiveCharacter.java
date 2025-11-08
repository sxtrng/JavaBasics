import java.util.Scanner;

public class PrimitiveCharacter {
    public static void main(String[] args) {
    


        System.out.println("");


        System.out.println("Within apostrophes, a char holds one character.");
        System.out.println("A char is not equal to a one-letter string.");
        System.out.println("A string can hold a single character, but it is still a string.");
        System.out.println("A char is a primitive data type (built into Java) and a String is a class.");
        System.out.println("2 bytes of memory are used to hold a char.");
        System.out.println("Each character corresponds to a Unicode number.");
        System.out.println("ints ranging from 0 to 255 may be assigned to a character data type.");



        char a1 = 'a';
        char a2 = 'A';

        System.out.println("A single letter, a character: " + a1);
        System.out.println("A a character, single letter  " + a1);
        System.out.println("");



        char letterZero = 't';
        char letterOne = 'h';
        char letterTwo = 'e';

        System.out.print("Each letter, character is its own character variable: ");
        System.out.printf("%c%c%c\n", letterZero, letterOne, letterTwo);
        System.out.println("");



        char numberA = 65;
        System.out.println("char numberA = " + numberA + ";");

        char numberB = 66;
        System.out.println("char numberB = " + numberB + ";");
        System.out.println("etc.");

    }
}