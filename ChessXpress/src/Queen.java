
public class Queen extends Piece {
	public Queen(int x, int y, int player) {
		super(x, y, player, PieceType.QUEEN);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Queens move in any direction 
		//Act like a rook vertically
		if(destX == this.getX()) {
			//Create temporary Rook and test movement using rooks isValid
			Piece tempRook = new Rook(this.getX(),this.getY(),this.getPlayer());
			boolean valid = tempRook.isValid(board, destX, destY);
			//Remove reference to tempRook so garbage collection will delete it faster
			tempRook = null;
			return valid;
		}
		//Act like a rook horizontally
		else if(destY == this.getY()) {
			//Create temporary Rook and test movement using rooks isValid
			Piece tempRook = new Rook(this.getX(),this.getY(),this.getPlayer());
			boolean valid = tempRook.isValid(board, destX, destY);
			//Remove reference to tempRook so garbage collection will delete it faster
			tempRook = null;
			return valid;
		}
		//Act like a bishop
		else if(Math.abs(destX - this.getX()) == Math.abs(destY - this.getY())) {
			//Create temporary Bishop and test movement using bishops isValid
			Piece tempBishop = new Bishop(this.getX(),this.getY(),this.getPlayer());
			boolean valid = tempBishop.isValid(board, destX, destY);
			//Remove reference to tempRook so garbage collection will delete it faster
			tempBishop = null;
			return valid;
		}
		//Else try to act like a king
		else {
			//Create temporary King and test movement using kings isValid
			Piece tempKing = new King(this.getX(),this.getY(),this.getPlayer());
			boolean valid = tempKing.isValid(board, destX, destY);
			//Remove reference to tempRook so garbage collection will delete it faster
			tempKing = null;
			return valid;
		}		
	}

}
