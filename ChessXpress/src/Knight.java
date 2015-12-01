
public class Knight extends Piece {
	PieceType type;
	public Knight(int x, int y) {
		super(x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Knights move in an "L"
		if(destX == currX+2 && destY == currY+1)
			return true;
		if(destX == currX+2 && destY == currY-1)
			return true;
		if(destX == currX-2 && destY == currY+1)
			return true;
		if(destX == currX-2 && destY == currY-1)
			return true;
		if(destX == currX+1 && destY == currY+2)
			return true;
		if(destX == currX+1 && destY == currY-2)
			return true;
		if(destX == currX-1 && destY == currY+2)
			return true;
		if(destX == currX-1 && destY == currY-2)
			return true;
		
		return false;
	}
}
