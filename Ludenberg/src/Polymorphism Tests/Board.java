import java.util.ArrayList;

public class Board extends Piece
{
	public static void main(String[] args) 
	{
		Piece king = new King();
		Piece queen = new Queen();
		Piece rook = new Rook();
		Piece bishop = new Bishop();
		Piece knight = new Knight();
		Piece pawn = new Pawn();
		
		ArrayList<Piece> whitePieces = new ArrayList<>();
		ArrayList<Piece> blackPieces = new ArrayList<>();
		
		System.out.println(bishop.getXPos());
	}
}
