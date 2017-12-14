
public class Max {
	
	// Method for finding the max value in an array.
	public static int max(int[] m) {
		
		// Initialise a placeholder.
		int max = 0;
		
		// Iterate through the array,
		for (int i = 0; i < m.length; i++) {
			// If the element in question is higher than our placeholder,
			if (m[i] > max) {
				// The placeholder takes that value.
				max = m[i];
			}
		}
		// Output the highest value.
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
	}
}
