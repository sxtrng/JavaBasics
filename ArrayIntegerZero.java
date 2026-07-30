import java.util.Arrays;

public class ArrayIntegerZero {
    public static void main(String[] args) {


        int[] numbers = {0, 1, 2, 3, 40};

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            System.out.print(number);
        }


    }
}