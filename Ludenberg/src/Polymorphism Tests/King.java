public class King extends Piece 
{
	public King() 
	{
		
	}
	
	public King(String colour) 
	{
		super.setColour(colour);

		if (super.getColour() == "White") {
			super.setXPos(3);
			super.setYPos(0);
		} else if (super.getColour() == "Black") {
			super.setXPos(3);
			super.setYPos(7);
		}
	}
}
