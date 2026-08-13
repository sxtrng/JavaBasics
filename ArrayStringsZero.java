public class ArrayStringsZero {
	public static void main(String[] args) {

		String[] words = {"one", "two", "three"};
		int arrayLength = words.length;

		for (int i = 0; i < arrayLength; i++) {
			System.out.println(words[i]);
		}

		System.out.println("\nChanging an element: ");
		words[0] = "FIRST ELEMENT HAS BEEN CHANGED TO ZERO";
		for (int i = 0; i < arrayLength; i++) {
			System.out.println(words[i]);
		}
	}
}