
public class Pawn extends Piece {
	boolean hasMoved;
	PieceType type;
	public Pawn(boolean inPlay, int x, int y, int player) {
		super(inPlay, x, y, player);
		type = PieceType.PAWN;
	}
	
	@Override
	public boolean isValid(Board board, int destX, int destY) {
		
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Pawns move forward by one, but can move forward by two on first move and attack diagonally
		//Pawns can't jump over occupied spaces or capture on first move
		if(destX == this.getX() && destY == this.getY()+1){
			if(this.getY() != 1 || this.getY() != 6)
				hasMoved = true;
			return true;
		}
		if(hasMoved != true){
			if(destX == this.getX() && destY == this.getY()+2){
				hasMoved = true;
				return true;
			}
		}
		return false;		
	}
}
