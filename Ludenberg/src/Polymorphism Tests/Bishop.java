public class Bishop extends Piece
{
	public Bishop() 
	{
		
	}
	
	public Bishop(String colour) 
	{
		super.setColour(colour);
		
		if (colour == "White") 
		{
			super.setYPos(0);
		} else if (colour == "Black") 
		{
			super.setYPos(7);
		}
	}
}
