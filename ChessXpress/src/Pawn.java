
public class Pawn extends Piece {
	boolean hasMoved;
	public Pawn(int x, int y, int player) {
		super(x, y, player, PieceType.PAWN);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		
		if(super.isValid(board, destX, destY) == false)
			return false;
		
		//If 1st player (0) only move pieces down
		if (this.getPlayer() == 0) {
			//Check if pawn has moved
			if (this.getX() != 1) {
				hasMoved = true;
			}
			//Pawns move forward by one, but can move forward by two on first move and attack diagonally
			//Pawns can't jump over occupied spaces or capture on first move
			if(destX == this.getX()+1 && destY == this.getY()){
				return true;
			}
			if(destX == this.getX()+2 && destY == this.getY()){
				if (!hasMoved) {
					return true;
				}
			}
			
		}
		//Otherwise is black piece, only move up
		else {
			//Check if pawn has moved
			if (this.getX() != 6) {
				hasMoved = true;
			}
			//Pawns move forward by one, but can move forward by two on first move and attack diagonally
			//Pawns can't jump over occupied spaces or capture on first move
			if(destX == this.getX()-1 && destY == this.getY()){
				return true;
			}
			if(destX == this.getX()-2 && destY == this.getY()){
				if (!hasMoved) {
					return true;
				}
			}
		}
		return false;		
	}
}
