public class Knight extends Piece
{
	public Knight() 
	{

	}

	public Knight(String colour) 
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
