import java.util.*;

public class DotCom 
{
	private ArrayList<String> locationCells;
	private String name;
	
	public void SetLocationCells(ArrayList<String> locs) 
	{
		locationCells = locs;
	}
	
	public void SetName(String n) 
	{
		name = n;
	}
	
	public String CheckGuess(String userInput) 
	{
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) 
		{
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) 
			{
				result = "kill";
				System.out.println("You sunk " + name + " : ( ");
			} else 
			{
				result = "hit";
			}
		}
		return result;
	}
}
