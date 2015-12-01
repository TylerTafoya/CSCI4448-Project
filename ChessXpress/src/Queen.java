
public class Queen extends Piece {
	PieceType type;
	public Queen(int x, int y) {
		super(x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Queens move in any direction 
		if(destX == currX)
			return true;
		
		if(destY == currY)
			return true;
		
		if(destX - currX == destY - currY)
			return true;
		
		return false;		
	}

}
