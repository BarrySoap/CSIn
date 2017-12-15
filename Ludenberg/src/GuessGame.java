public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void StartGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessOne = 0;
		int guessTwo = 0;
		int guessThree = 0;
		
		String correctGuess = "";
		
		boolean isGuess1Right = false;
		boolean isGuess2Right = false;
		boolean isGuess3Right = false;
		
		int targetNumber = (int)(Math.random() * 10);
		
		while (true) {
			System.out.println("The random number is: " + targetNumber);
			
			p1.Guess();
			p2.Guess();
			p3.Guess();
			
			guessOne = p1.getNumber();
			guessTwo = p2.getNumber();
			guessThree = p3.getNumber();
			
			System.out.println("Guess One: " + guessOne);
			System.out.println("Guess Two: " + guessTwo);
			System.out.println("Guess Three: " + guessThree);
			
			if (guessOne == targetNumber) {
				isGuess1Right = true;
				correctGuess = "Guess One";
			} else if (guessTwo == targetNumber) {
				isGuess2Right = true;
				correctGuess = "Guess Two";
			} else if (guessThree == targetNumber) {
				isGuess3Right = true;
				correctGuess = "Guess Three";
			}
			
			if (isGuess1Right || isGuess2Right || isGuess3Right) {
				System.out.println(correctGuess + " was correct!");
				break;
			} else {
				System.out.println("No correct guesses!");
				System.out.println();
			}
		}
	}
}
