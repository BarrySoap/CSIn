import java.util.*;

public class Formatting {

	public static void main(String[] args) {
		try {
			System.out.println("Today's date: " + String.format("%tc", new Date()));					// tc for the time & date
			System.out.println("The time is: " + String.format("%tr", new Date()));						// tr for the time
			System.out.println("The day of the week is: " + String.format("%tA", new Date()));			// tA for the day of the week
			System.out.println("The month is: " + String.format("%tB", new Date()));					// tB for the month
			System.out.println("The day of the month is: " + String.format("%td", new Date()));			// td for the day of the month
		} catch (Exception e) {
			System.out.println("Something failed.");
		} finally {
			System.out.println(String.format(" Decimals: %d \n Floating points: %.3f \n Hexadecimals: %x \n Characters: %c", 42, 42.000000, 42, 42));
		}
	}
}
