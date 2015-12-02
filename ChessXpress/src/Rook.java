
public class Rook extends Piece {
	PieceType type;
	public Rook(boolean inPlay, int x, int y) {
		super(inPlay, x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Rooks move horizontal or vertical
		if(destX == currX)
			return true;
		
		if(destY == currY)
			return true;
		
		return false;
	}
}
