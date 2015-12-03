
public class Bishop extends Piece {
	PieceType type;
	public Bishop(boolean inPlay, int x, int y, int player) {
		super(inPlay, x, y, player);
		type = PieceType.BISHOP;
	}
	
	@Override
	public boolean isValid(Board board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Bishops move diagonally
		if(destX - this.getX() == destY - this.getY())
			return true;
		
		return false;
	}

}
