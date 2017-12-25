
public class SimpleDotCom {

	private int[] locationCells;
	private int numOfHits = 0;
	
	public void setLocationCells(int[] loc) 
	{
		locationCells = loc;
	}
	
	public String checkGuess(String guess) 
	{
		int newGuess = Integer.parseInt(guess);
		String result = "miss";
		for (int cell : locationCells) 
		{
			if (newGuess == cell) 
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) 
		{
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
