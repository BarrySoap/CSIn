public class Triangle {
	
	public static void DrawTriangle(int size) {
		// Start the triangle as an empty string
		String tree = "";
		
		for (int i = 0; i < size; i++) {
			tree += '*';
			System.out.println(tree);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		DrawTriangle(n);
	}
}
