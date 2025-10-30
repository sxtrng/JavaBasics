//UntitledSix
public class PrimitiveInteger {
    public static void main(String[] args) {

        int wholeNumber = 50;
        int maxInt;
        int minInt;

        // System.out.println(wholeNumber);
        // System.out.println(wholeNumber + " has been assigned to wholeNumber.");
        System.out.printf("%d\n", wholeNumber);
        System.out.printf("%d is being displayed with printf()\n", wholeNumber);

        System.out.println();

        maxInt = Integer.MAX_VALUE;
        System.out.printf("The maximum value an int can hold is: %d\n", maxInt);

        minInt = Integer.MIN_VALUE;
        System.out.printf("The minimum value an int can hold is: %d\n", minInt);

        System.out.println();

        long longInteger = 100_000_000;
        long longMin;
        long longMax;

        System.out.println("Here is a long: " + longInteger);

        longMin = Long.MIN_VALUE;
        System.out.printf("The minimum value a long can hold is: %d\n", longMin);    
        longMax = Long.MAX_VALUE;
        System.out.printf("The maximum value a long can hold is: %d\n", longMax);

        System.out.println();

        short shortInteger = 15_000;
        short shortMin;
        short shortMax;

        System.out.println("Here is a short: " + shortInteger);
        shortMin = Short.MIN_VALUE;
        System.out.printf("The minimum value a short can hold is: %d\n", shortMin);
        shortMax = Short.MAX_VALUE;
        System.out.printf("The maximum value a short can hold is: %d\n", shortMax);

        System.out.println();

        byte byteInteger = 15;
        byte byteMin;
        byte byteMax;

        System.out.println("Here is a byte: " + byteInteger);
        byteMin = Byte.MIN_VALUE;
        System.out.printf("The minimum value a byte can hold is: %d\n", byteMin);
        byteMax = Byte.MAX_VALUE;
        System.out.printf("The maximum value a byte can hold is: %d\n", byteMax);

        System.out.println();

    }
}
        
//        Primitive Data Types: Integer.
//        Integer Data Types hold whole numbers, without decimal places.
//        We will begin with the most common and work our way to the less common.
//        This will most likely be the most commonly used data type for holding whole numbers.