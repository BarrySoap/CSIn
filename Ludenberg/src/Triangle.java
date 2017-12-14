
public class Triangle {

	public static void main(String[] args) {
		// Start the triangle as an empty string
		String triangle = "";
		
		// Iterate 5 times, adding an asterisk at the end of each line
		for (int i = 0; i < 5; i++) {
			triangle += '*';
			// System.out.println will separate each iteration
			System.out.println(triangle);
		}
	}
}
