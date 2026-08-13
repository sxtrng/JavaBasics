public class ScopeOne {

	static int x = 1;

	public static void main(String[] args) {

		int x = 2;

		System.out.println(x);
		testX(3);
		testX(x);
		
	}

	static void testX(int x) {
		System.out.println(x);
	}
}