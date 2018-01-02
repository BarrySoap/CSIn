abstract class Piece
{
	private int xPos;
	private int yPos;
	private int newXPos;
	private int newYPos;
	private String colour;
	
	public int getXPos() { return xPos; }
	public int getYPos() { return yPos; }
	public int getNewXPos() { return newXPos; }
	public int getNewYPos() { return newYPos; }
	public String getColour() { return colour; }
	
	public void setXPos(int pos) { xPos = pos; }
	public void setYPos(int pos) { yPos = pos; }
	public void setNewXPos(int pos) { newXPos = pos; }
	public void setNewYPos(int pos) {newYPos = pos; }
	public void setColour(String col) { colour = col; }
}