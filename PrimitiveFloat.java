public class PrimitiveFloat {
    public static void main(String[] args) {

        System.out.println("*****************************************************************************");

        float floatValue;
        double doubleValue;

        System.out.print("Java has two types of primitive floating-point values: ");
        System.out.println("'float' and 'double'");

        System.out.println("*****************************************************************************");

        System.out.println("A float occupies 4 bytes (32 bits) of memory.");
        System.out.println("Approximately 6-7 decimal digits of precision.");
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Maximum Value: " + Float.MAX_VALUE);

        System.out.println("*****************************************************************************");

//        floatValue = 3.0;
        floatValue = 3.0f;
        System.out.println("An 'f' must be appended toa float declaration, because Java defaults to double");
        System.out.println("when any floating-point value is entered.");
        System.out.println(floatValue);

        System.out.println("*****************************************************************************");

        doubleValue = 3.14159;
        System.out.println("A double is a floating-point value that can hold a greater range of values ");
        System.out.println("with greater precision after the decimal place.");
        System.out.println(doubleValue);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println("*****************************************************************************");
    }
}