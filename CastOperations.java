public class CastOperations {
	public static void main(String[] args) {
	
		double x = 1.1;
		System.out.println(x + ", " + (int)x);

		x = 1.9;
		System.out.println(x + ", " + (int)x);

		int a = 5;

		System.out.printf("%d, %f\n", a, (double)a);

		a = 'a';
		System.out.printf("%c, %d, %f\n", a, a, (double)a);

	}
}