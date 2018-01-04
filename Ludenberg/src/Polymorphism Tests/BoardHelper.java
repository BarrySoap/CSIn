import java.util.ArrayList;

public class BoardHelper 
{
	public void SetWhitePieces(ArrayList<Piece> whitePieces) 
	{
		Piece whiteKing = new King("White");
		Piece whiteQueen = new Queen("White");
		
		whitePieces.add(whiteKing);
		whitePieces.add(whiteQueen);
		
		for (int i = 0; i < 2; i++) 
		{
			Piece rook = new Rook("White");
			Piece knight = new Knight("White");
			Piece bishop = new Bishop("White");
			
			whitePieces.add(rook);
			whitePieces.add(knight);
			whitePieces.add(bishop);
			
			if (i == 0) 
			{
				rook.setXPos(0);
				knight.setXPos(1);
				bishop.setXPos(2);
			} else 
			{
				rook.setXPos(7);
				knight.setXPos(6);
				bishop.setXPos(5);
			}
		}
		
		for (int i = 0; i < 8; i++)
		{
			Piece pawn = new Pawn("White");
			pawn.setXPos(i);
			whitePieces.add(pawn);
		}
	}
	
	public void SetBlackPieces(ArrayList<Piece> blackPieces) 
	{
		Piece blackKing = new King("Black");
		Piece blackQueen = new Queen("Black");
		
		blackPieces.add(blackKing);
		blackPieces.add(blackQueen);
		
		for (int i = 0; i < 2; i++) 
		{
			Piece rook = new Rook("Black");
			Piece knight = new Knight("Black");
			Piece bishop = new Bishop("Black");
			
			blackPieces.add(rook);
			blackPieces.add(knight);
			blackPieces.add(bishop);
			
			if (i == 0) 
			{
				rook.setXPos(0);
				knight.setXPos(1);
				bishop.setXPos(2);
			} else 
			{
				rook.setXPos(7);
				knight.setXPos(6);
				bishop.setXPos(5);
			}
		}
		
		for (int i = 0; i < 8; i++)
		{
			Piece pawn = new Pawn("Black");
			pawn.setXPos(i);
			blackPieces.add(pawn);
		}
	}
}
