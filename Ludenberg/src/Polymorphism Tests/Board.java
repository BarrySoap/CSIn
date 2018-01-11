import java.util.ArrayList;
import java.util.Date;

public final class Board extends Piece
{
	private static Board instance = new Board();
	
	private Board() {}
	
	public static Board getInstance() 
	{
		return instance;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The current date is: " + String.format("%tc", new Date()));
		
		ArrayList<Piece> whitePieces = new ArrayList<>();
		ArrayList<Piece> blackPieces = new ArrayList<>();
		BoardHelper helper = new BoardHelper();
		helper.SetWhitePieces(whitePieces);
		helper.SetBlackPieces(blackPieces);
	}
}
