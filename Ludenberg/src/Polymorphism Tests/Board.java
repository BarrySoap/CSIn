import java.util.ArrayList;

public final class Board extends Piece
{
	private static Board instance = new Board();
	
	private Board() {}
	
	public static Board getInstance() {
		return instance;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Piece> whitePieces = new ArrayList<>();
		ArrayList<Piece> blackPieces = new ArrayList<>();
		BoardHelper helper = new BoardHelper();
		helper.SetWhitePieces(whitePieces);
		helper.SetBlackPieces(blackPieces);
	}
}
