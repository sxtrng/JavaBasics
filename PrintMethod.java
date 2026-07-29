public class PrintMethod {
	public static void main(String[] args) {
		

		System.out.print("System.out.print() -> no new line.");
		System.out.println(" System.out.println() -> Inserts a new line.");
		System.out.println("Using the plus operator (+) " + "concatenates strings.");

		String s1 = "Variables of type String.";
		String s2 = "are used to create and hold strings.";
		System.out.printf("%s %s%n", s1, s2);

		int n1 = 100;
		String s3 = " Numerical values such as %d are integers.  ";
		System.out.println(s3 + 100);
		System.out.println(100 + s3);
		
		System.out.println("Generally applicable to other data types.");
		System.out.println("Info about other data types in another file / repository.");


	}
}