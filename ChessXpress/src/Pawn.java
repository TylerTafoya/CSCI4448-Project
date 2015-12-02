
public class Pawn extends Piece {
	PieceType type;
	public Pawn(boolean inPlay, boolean hasMoved, int x, int y) {
		super(inPlay, hasMoved, x, y);
	}
	
	@Override
	public boolean isValid(Board board, int currX, int currY, int destX, int destY, boolean hasMoved) {
		if(super.isValid(board, currX, currY, destX, destY) == false)
			return false;
		//Pawns move forward by one, but can move forward by two on first move and attack diagonally
		if(destX == currX && destY == currY+1){
			if(hasMoved != true)
				hasMoved = true;
			return true;
		}
		if(hasMoved != true){
			if(if destC == currX && destY == currY+2){
				hasMoved = true;
				return true;
			}
		}
		return false;		
	}
}
