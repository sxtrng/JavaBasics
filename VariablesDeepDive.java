import java.util.Arrays;

public class VariablesDeepDive {
    public static void main(String[] args) {
        System.out.println("*****************************************************************************************");
        System.out.println("\nAn Extensive Look at Variables.\n");
        System.out.println("*****************************************************************************************");

        System.out.println("Variables make a program modular, and allow for performing calculations.");
        System.out.println("Java is a statically-typed, and a strongly-typed language.  Which means the following: ");
        System.out.println("Prior to usage, variables must be declared with a name and a type.");
        System.out.print("The name is how the variable is identified, ");
        System.out.println("and the type specifies the kind of data it can hold.");
        System.out.println("A variable can only hold one value at a time.  A new value is stored when");
        System.out.println("you reassign a new value to an existing variable name.");

        System.out.println("\nLet us begin with primitive data types, built into Java.\n");
        System.out.println("The following variables are all local to main() and are visible in main() only.");

        System.out.println("byte: 1 byte (8 bits) of memory");

        //  Declaration
        byte b1, b2, b3;
        var b4 = 6;
        
        System.out.println(b4);
        // b4 = 6.0; // too late, b4 is already a byte

        //Initialization
        b1 = 100;
        b2 = 100;

        System.out.print("bytes are for small values, such as " + b1);
        System.out.println(" and " + b2);
        
        b3 = (byte) (b1 + b2);
        
        System.out.println("byte is too small of a data type, int is the default.");
        System.out.printf("%d + %d = %d\n", b1, b2, b3);
        System.out.print("Here we explicitly cast our result to a byte and lost information: ");

        //  Declaration and Assignment in One Statement
        int sumBytes = b1 + b2;
        
        System.out.println("If we use an int instead, the problem is no more.");
        System.out.printf("%d + %d = %d\n", b1, b2, sumBytes);
        System.out.println("This is because our result is too large for a byte, but not an int.");

        //
        int minimum = Byte.MIN_VALUE;
        int maximum = Byte.MAX_VALUE;

        // System.out.println("Below is the entire range of values a byte can hold: ");
        // for (int i = minimum; i < maximum; i++) {
        //     System.out.println(i);
        // }

        System.out.println("Next Data Type is short.");
        System.out.println("Short is 16-bit, or 2-bytes in size.");

        int minimumShortValue = Short.MIN_VALUE;
        int maximumShortValue = Short.MAX_VALUE;

        System.out.printf("Minimum Value for a short: %d\n", minimumShortValue);
        System.out.printf("Maximum Value for a short: %d\n", maximumShortValue);


        System.out.println("Integer (int)");
        System.out.println("An integer requires more memory, but modern computers have that additional memory.");

        int minimumIntegerValue = Integer.MIN_VALUE;
        int maximumIntegerValue = Integer.MAX_VALUE;
        
        System.out.printf("Minimum Value an int can hold: %d\n", minimumIntegerValue);
        System.out.printf("Maximum Value an int can hold: %d\n", maximumIntegerValue);

        System.out.println("When dividing integers, the result is always an integer");
        
        int valueOne = 11;
        int valueTwo = 3;
        int result = valueOne / valueTwo;
        
        System.out.printf("%d / %d = %d\n",valueOne, valueTwo, result);
        System.out.println("We can get a decimal result by using double values: ");
        System.out.println("Our result variable is a double, capable of holding decimals, but Java still would like");
        System.out.println("one of our values to be cast to a double.");

        // Because we used an integer, we must use casting because one value must be of type double.
        double resultWithDecimal = (double) valueOne / valueTwo;
        
        System.out.printf("%d / %d = %f\n", valueOne, valueTwo, resultWithDecimal);
        System.out.println("But here we just get a floating-point representation of our integer, ");
        System.out.println("not a true result of dividing these two integers.");
        System.out.println(resultWithDecimal);
        System.out.println("But when we cast one of our values to a double, we get the proper result.");
        System.out.println(resultWithDecimal);
        System.out.println("Whenever possible, use the proper floating-point data type when dividing");

        System.out.println("\nBefore floating-point, we have one more integer type, long.");
        System.out.println("Long requires more memory and can hold a greater range of value.");

        long minimumLongValue = Long.MAX_VALUE;
        long maximumLongValue = Long.MIN_VALUE;
        
        System.out.printf("Minimum Value for a Long: %d\n", minimumLongValue);
        System.out.printf("Maximum Value for a Long Value: %d\n", maximumLongValue);

        System.out.println("The same integer division rules apply.");
        System.out.printf("%d\n", (3 / 2));
        System.out.printf("%d\n", (2 / 3));

        System.out.println("\nfloat\n");
        
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        
        System.out.println("Maximum Value: " + maxFloatValue);
        System.out.println("Minimum Value: " + minFloatValue);
        System.out.println("Memory: 4 bytes or 32 bits");

        float f1 = 10;

        System.out.println("Floating-Point values have a decimal part to store fractional values.");
        System.out.println("A float is less precise after the decimal point that double is.");
        System.out.println("Float has 6 places after the decimal.");
        System.out.printf("%f\n", f1);

        float f2 = 0.123456789F;

        System.out.printf("%f\n", f2);
        System.out.println("double is the default floating-point data type, so we must append our value with an F");
        System.out.println("Also note that it could not hold all our decimal places and also rounded the last value.");
        System.out.println("Below are some options to manipulate floats");
        System.out.println(Float.toHexString(f2));
        System.out.println(Float.floatToRawIntBits(f1));

        float f3 = 1;
        float f4 = 2;

        System.out.println(Float.compare(f3, f4));
        System.out.println(Float.compare(f4, f3));

        float f5 = 1.0E5F;

        System.out.println(f5);

        System.out.println("CHARACTER: char");
        System.out.println("Characters hold single values.");

        char c1 = 'a';
        
        System.out.println(c1);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.getType(c1));
        
        char c2 = '\n';
        
        System.out.println("first line" + c2 + "last line");
        
        char c3 = '*';
        
        System.out.println(c3);
        System.out.println(Character.getType('A'));
        System.out.println(Character.getType('a'));
        System.out.println(Character.getType('B'));
        System.out.println(Character.getDirectionality(c3));

        /*
                see strings repository for complete list of string methods.
        */

        System.out.println("Strings");
        System.out.println("A String is a sequence of characters enclosed within double quotation marks.");
        System.out.println("Strings are reference types, not primitive types.");
        System.out.println("Despite this difference, Strings are still declared similarly to primitive types.\n");

        String s1 = "String One";

        int size = s1.length();
        System.out.println("Length of s1: " + size + " characters long.");
        char firstCharacter = s1.charAt(0);
        System.out.println("Using charAt() to find a character at desired index: " + firstCharacter);
        char lastCharacter = s1.charAt(size - 1);
        System.out.println(lastCharacter);

        System.out.println("Using a loop with charAt() to print each character individually");
        for (int i = 0; i < size; i++) {
            System.out.print(s1.charAt(i));
        }

        System.out.println();

        System.out.println("Below we are using getBytes() to get a numerical representation of each character");
        byte[] getBytesMethod = s1.getBytes();
        System.out.println(Arrays.toString(getBytesMethod));

        System.out.println("Using toUpperCase() to convert all characters to upper case equivalents.");
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        String capitalLetters = "CAPITALS";
        System.out.println(capitalLetters);
        System.out.println(capitalLetters.toLowerCase());

        System.out.println("COMPARING STRINGS");
        System.out.println("Using compareTo() method");
        String a = "a";
        String b = "b";
        System.out.println("a is 'less' than b, so the result is: " + a.compareTo(b));
        System.out.println("b is 'less' than s, so the result is: " + b.compareTo(a));
        System.out.println("Using isEmpty() and isBlank()");
        String emptyString = "";
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());

        String blankString = " ";
        System.out.println(blankString.isEmpty());
        System.out.println(blankString.isBlank());

        System.out.println("Concatenating Two Strings: ");
        System.out.println(s1 + " " + a);


        System.out.println("\nSee Strings repository for details about string immutability.");
        s1 = "Changed the string";
        System.out.println(s1);
        
        System.out.println("\n");

        if (Character.isAlphabetic(c1)) {
            System.out.println("Character.isAlphabetic = true");
        }

        var v1 = 1;
        System.out.println(v1);

    }
}