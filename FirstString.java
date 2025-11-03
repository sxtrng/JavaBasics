import java.util.Scanner;

public class FirstString {
    public static void main(String[] args) {

        String stringVariable;

        stringVariable = "This is a sentence.";

        System.out.println(stringVariable);

        stringVariable = "Time for something else.";

        int stringLength = stringVariable.length();
        System.out.print("Length of 'stringVariable': " + stringLength);
        System.out.println(" characters long.");

        String one = "test";
        String one_a = "test";

        if (one.equals(one_a)) {
            System.out.println(one + " equals " + one_a + ".");
        }



        one_a = "Test";

        if (one.equals(one_a)) {
            System.out.print(one + " equals " + one_a + ", ");
        } else {
            System.out.println("but " + one + " does not equal " + one_a + ".");
        }


        if (one.equalsIgnoreCase(one_a)) {
            System.out.print("However ");
            System.out.print(one + " equals " + one_a + ", ");
            System.out.println("if you ignore case-sensitivity.");
        } else {
            System.out.println(one + " does not equal " + one_a + ".");
        }
    }
}
