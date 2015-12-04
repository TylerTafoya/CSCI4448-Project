
public class King extends Piece {
	public King(int x, int y, int player) {
		super(x, y, player, PieceType.KING);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Can't move further than one
		if ((Math.abs(this.getX()-destX) < 2) && (Math.abs(this.getY()-destY) < 2)) {
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise piece is within 1 and opponent or blank
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

}
