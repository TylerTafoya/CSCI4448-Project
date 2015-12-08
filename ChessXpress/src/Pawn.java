
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
			if(destX == this.getX()+1 && destY == this.getY() && board[destX][destY].getPlayer() == 2){
				return true;
			}
			//Check for first move 2 space jump
			if(destX == this.getX()+2 && destY == this.getY()){
				if (!hasMoved && board[destX-1][destY].getPlayer() == 2 && board[destX][destY].getPlayer() == 2) {
					return true;
				}
			}
			//Check for diagonal attack, only down for player 1
			if ((destX == this.getX()+1) && ((destY == this.getY()-1) || (destY == this.getY()+1))) {
				//Check if the diagonal is an opponent
				if (board[destX][destY].getPlayer() == 1){
					return true;
				}
				else {
					return false;
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
			if(destX == this.getX()-1 && destY == this.getY() && board[destX][destY].getPlayer() == 2){
				return true;
			}
			//Check for first move 2 space jump
			if(destX == this.getX()-2 && destY == this.getY()){
				if (!hasMoved && board[destX+1][destY].getPlayer() == 2 && board[destX][destY].getPlayer() == 2) {
					return true;
				}
			}
			//Check for diagonal attack, only up for player 2
			if ((destX == this.getX()-1) && ((destY == this.getY()-1) || (destY == this.getY()+1))) {
				//Check if the diagonal is an opponent
				if (board[destX][destY].getPlayer() == 0){
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;		
	}
}
