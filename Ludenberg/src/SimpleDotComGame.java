
public class SimpleDotComGame {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		SimpleDotCom simp = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		int randStart = (int)(Math.random() * 5);
		
		int[] locations = {randStart, randStart + 1, randStart + 2};
		simp.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive == true) 
		{
			String guess = helper.getUserInput("Guess a number:");
			String result = simp.checkGuess(guess);
			numOfGuesses++;
			
			if (result.equals("kill")) 
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses.");
			}
		}
	}
}
