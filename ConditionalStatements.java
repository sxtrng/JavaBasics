public class ConditionalStatements {
	public static void main(String[] args) {


		int x = 10;

		if (x > 0) {
			System.out.println(x + " is positive.");
			System.out.println("Condition is true.");
		} else {
			System.out.println(x + " is not greater than 10");
		}

		int y = 100;

		if (x > 0 && x < y) {
			System.out.println("x is greater than 0, but less than 100.");
		}

		if (x > 0) {
			System.out.println("Positive");
			if (x % 2 == 0) {
				System.out.println("Also an even number");
			} else {
				System.out.println("Greater than 0, but odd");
			}
		}

		if (x > 0 || y > 0) {
			System.out.println("x or y are greater than 0");
		}

		
	}
}