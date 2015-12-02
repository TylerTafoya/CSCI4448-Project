
public class Rook extends Piece {
	PieceType type;
	public Rook(boolean inPlay, int x, int y, int player) {
		super(inPlay, x, y, player);
	}
	
	@Override
	public boolean isValid(Board board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Rooks move horizontal or vertical
		if(destX == this.getX())
			return true;
		
		if(destY == this.getY())
			return true;
		
		return false;
	}
}
