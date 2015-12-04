
public class Knight extends Piece {
	public Knight(int x, int y, int player) {
		super(x, y, player, PieceType.KNIGHT);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Knights move in an "L"
		if(destX == this.getX()+2 && destY == this.getY()+1)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()+2 && destY == this.getY()-1)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()-2 && destY == this.getY()+1)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()-2 && destY == this.getY()-1)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()+1 && destY == this.getY()+2)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()+1 && destY == this.getY()-2)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()-1 && destY == this.getY()+2)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		if(destX == this.getX()-1 && destY == this.getY()-2)
			//Check if destination is own piece, if so, not valid
			if (board[destX][destY].getPlayer() == this.getPlayer()) {
				return false;
			}
			//Otherwise destination is opponent or blank
			else {
				return true;
			}
		
		return false;
	}
}
