
public class Queen extends Piece {
	PieceType type;
	public Queen(boolean inPlay, int x, int y, int player) {
		super(inPlay, x, y, player);
		type = PieceType.QUEEN;
	}
	
	@Override
	public boolean isValid(Board board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Queens move in any direction 
		if(destX == this.getX())
			return true;
		
		if(destY == this.getY())
			return true;
		
		if(destX - this.getX() == destY - this.getY())
			return true;
		
		return false;		
	}

}
