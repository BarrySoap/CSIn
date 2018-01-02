public class Queen extends Piece
{
	public Queen() 
	{

	}

	public Queen(String colour) 
	{
		super.setColour(colour);

		if (super.getColour() == "White") {
			super.setXPos(4);
			super.setYPos(0);
		} else if (super.getColour() == "Black") {
			super.setXPos(4);
			super.setYPos(7);
		}
	}
}
