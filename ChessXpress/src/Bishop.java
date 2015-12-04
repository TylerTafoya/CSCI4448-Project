
public class Bishop extends Piece {
	public Bishop(int x, int y, int player) {
		super(x, y, player, PieceType.BISHOP);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Bishops move diagonally
		if(destX - this.getX() == destY - this.getY())
			return true;
		
		return false;
	}

}
