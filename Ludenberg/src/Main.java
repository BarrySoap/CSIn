import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static boolean IsLeapYear(int year) {
		// If a year is divisible by 400, it is a leap year.
		if (year % 400 == 0) {
			return true;
		}
		// Similarly, if a year is divisible by 4 by not by 100, it is a leap year.
		else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		// If neither of the conditions pass, the year is not a leap year.
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Initialise leap years
		int leapYear = 2000;
		int leapYear2 = 2004;
		// Initialise non-leap years
		int notLeapYear = 1993;
		int notLeapYear2 = 2003;
		int notLeapYear3 = 2100;
		
		// Initialise a list to store the years
		List<Integer> list = new ArrayList<>();
		// Add the years to the new list
		list.add(leapYear);
		list.add(leapYear2);
		list.add(notLeapYear);
		list.add(notLeapYear2);
		list.add(notLeapYear3);
		
		// For each item in the years list,
		for (int i = 0; i < list.size(); i++) {
			// If it is a leap year,
			if (IsLeapYear(list.get(i)) == true) {
				// Print it out as so.
				System.out.println(list.get(i) + " is a leap year.");
			}
			// If the year isn't a leap year,
			else {
				// Print it out as so.
				System.out.println(list.get(i) + " is not a leap year.");
			}
		}
	}
}
