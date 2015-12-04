
public class Rook extends Piece {
	public Rook(int x, int y, int player) {
		super(x, y, player, PieceType.ROOK);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
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
