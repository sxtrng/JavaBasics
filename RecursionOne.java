public class RecursionOne {
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(summation(value));
		System.out.println(factorial(value));
		
		for (int i = 0; i < value; i++) {
        	System.out.print(fibonacci(i)+" ");
    	}

    	System.out.println();

	}

	public static int summation(int number) {

		if (number == 1) {
			return 1;
		}

		return number + summation(number - 1);

	}

	public static long factorial(int number) {

		if (number == 0) {
			return 1;
		}

		return number * factorial(number - 1);

	}

	public static int fibonacci(int number) {

		if (number == 0) {
			return 0;
		}

		if (number == 1 || number == 2) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}

	}

}