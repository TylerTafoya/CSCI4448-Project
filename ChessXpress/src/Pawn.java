
public class Pawn extends Piece {
	PieceType type;
	public Pawn(boolean inPlay, int x, int y) {
		super(inPlay, x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Pawns move forward by one, but can move forward by two on first move and attack diagonally
		if(destX == currX)
			return true;
		if(destY == currY+1)
			return true;
		return false;		
	}

}
