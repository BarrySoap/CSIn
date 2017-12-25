import java.util.ArrayList;

public class DotComBust 
{
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<>();
	private int numOfGuesses = 0;
	
	private void SetUpGame() 
	{
		DotCom one = new DotCom();
		DotCom two = new DotCom();
		DotCom three = new DotCom();
		
		one.SetName("Battleship One");
		two.SetName("Battleship Two");
		three.SetName("Battleship Three");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("Your goal is to sink three battleships.");
		System.out.println("Battleship One, Battleship Two, Battleship Three");
		
		for (DotCom dotComToSet : dotComsList) 
		{
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.SetLocationCells(newLocation);
		}
	}
	
	private void StartPlaying() 
	{
		while (!dotComsList.isEmpty()) 
		{
			String userGuess = helper.getUserInput("Enter a guess:");
			CheckUserGuess(userGuess);
		}
		FinishGame();
	}
	
	private void CheckUserGuess(String userGuess) 
	{
		numOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComsList) 
		{
			result = dotComToTest.CheckGuess(userGuess);
			if (result.equals("hit")) 
			{
				break;
			}
			if (result.equals("kill")) 
			{
				dotComsList.remove(dotComToTest);
			}
		}
		System.out.println(result);
	}
	
	private void FinishGame() 
	{
		System.out.println("All battleships have been sunk!");
		System.out.println("It took you " + numOfGuesses + " guesses!");
	}
	
	public static void main(String[] args) 
	{
		DotComBust game = new DotComBust();
		game.SetUpGame();
		game.StartPlaying();
	}
}
