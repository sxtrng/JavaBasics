public class Printf {
	public static void main(String[] args) {

		System.out.println();

		System.out.printf("First Name: %s\n\n", "Mike");

		double pi = 3.141592;
		int precision = 2;

		System.out.printf("Pi rounded to %d decimal places: %.2f\n\n", precision, pi);

		String subject = "Java";
		int chapter = 1;

		System.out.printf("Read chapter %d of your %s book.\n\n", chapter, subject);

		boolean finished = true;
		System.out.printf("A boolean variable set to true displays %b.\n\n", finished);

		double large = 123456789;
		double small = 0.00000001;
		System.out.printf("%e\n%e\n\n", large,small);

		System.out.printf("|%10s|\n", subject);
		System.out.printf("|%-10s|\n\n", subject);

		String word = "houseboat";
		System.out.printf("%.5s\n\n", word);	


	}
}
