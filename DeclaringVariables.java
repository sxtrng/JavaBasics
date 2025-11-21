public class DeclaringVariables {
    public static void main(String[] args) {

        System.out.println("A variable references a location in memory.");
        System.out.println("Java is a statically and strongly typed language.");
        System.out.println("All variables must be declared prior to use, and must include a name and a type.");
        System.out.println("Variable names begin with a letter or underscore, even a dollar sign.  Beginning with lower case is good practice.");
        System.out.println("There are no spaces.  Use camel case for multipleWords.");
        System.out.println("Numbers allowed, but not as a first letter.");
        System.out.println("The compiler can detect mismatch between types and spelling errors.");
        System.out.println("A variable declaration is a statement and must end with a semicolon.");
        System.out.println("A variable name is an identifer.");
        System.out.println("Upper and lower case characters are distinct.");
        System.out.println("The = sign is the assignment operator.  The value is assigned to the variable name.");
        System.out.println("Use self-documenting names like 'numberOfSongs' rather than 'x' or 'n'.");

        int x;
        x = 10;
        System.out.println("Value of x: " + x);

        x = 50;
        System.out.println("x has been given a new value: " + x);

        int y = 100;
        System.out.println("y +  was declared an initialized on one line.");
        System.out.println("y = " + y);

        //  Legal, but discouraged.
        int a, b;
        a = 500;
        b = 700;
        System.out.println(a + " " + b);

        
    }
}
