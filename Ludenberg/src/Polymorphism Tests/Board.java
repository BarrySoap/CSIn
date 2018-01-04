import java.util.ArrayList;

public class Board extends Piece
{
	public static void main(String[] args) 
	{
		ArrayList<Piece> whitePieces = new ArrayList<>();
		ArrayList<Piece> blackPieces = new ArrayList<>();
		BoardHelper helper = new BoardHelper();
		helper.SetWhitePieces(whitePieces);
		helper.SetBlackPieces(blackPieces);
	}
}
