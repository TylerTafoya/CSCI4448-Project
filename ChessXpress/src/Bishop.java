
public class Bishop extends Piece {
	PieceType type;
	public Bishop(int x, int y){
		super(x,y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Bishops move diagonally
		if(destX - currX == destY - currY)
			return true;
		
		return false;
	}

}
