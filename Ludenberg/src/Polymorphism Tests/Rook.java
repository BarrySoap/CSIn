public class Rook extends Piece
{
	public Rook() 
	{

	}

	public Rook(String colour) 
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
