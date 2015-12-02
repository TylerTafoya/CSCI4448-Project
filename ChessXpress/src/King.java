
public class King extends Piece {
	PieceType type;
	public King(boolean inPlay, int x, int y) {
		super(inPlay, x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Kings move in any direction by 1
		if(destX == currX+1 && destY == currY+1)
			return true;
		if(destX == currX+1 && destY == currY-1)
			return true;
		if(destX == currX-1 && destY == currY+1)
			return true;
		if(destX == currX-1 && destY == currY-1)
			return true;
		if(destX == currX+1 && destY == currY)
			return true;
		if(destX == currX-1 && destY == currY)
			return true;
		if(destX == currX && destY == currY+1)
			return true;
		if(destX == currX && destY == currY-1)
			return true;
		



		return false;
		
	}

}
