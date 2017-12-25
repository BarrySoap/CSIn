
public class SimpleDotCom {

	private int[] locationCells;
	private int numOfHits = 0;
	
	public String checkGuess(String guess) {
		int newGuess = Integer.parseInt(guess);
		for (int i = 0; i < locationCells.length; i++) {
			if (newGuess == locationCells[i]) {
				numOfHits++;
				if (numOfHits == 3) {
					return "kill";
				} else {
					return "hit";
				}
			} else {
				return "miss";
			}
		}
		return guess;
	}
	
	public void setLocationCells(int[] loc) {
		locationCells = loc;
	}
}
