
public class Queen extends Piece {
	public Queen(int x, int y, int player) {
		super(x, y, player, PieceType.QUEEN);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
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
