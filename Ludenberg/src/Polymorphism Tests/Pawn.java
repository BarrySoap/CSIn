public class Pawn extends Piece
{
	public Pawn() 
	{

	}

	public Pawn(String colour) 
	{
		super.setColour(colour);
		
		if (colour == "White") 
		{
			super.setYPos(1);
		} else if (colour == "Black") 
		{
			super.setYPos(6);
		}
	}
}