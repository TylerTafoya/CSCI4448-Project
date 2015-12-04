
public class Rook extends Piece {
	public Rook(int x, int y, int player) {
		super(x, y, player, PieceType.ROOK);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		//Check if it's on the board
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Rooks move horizontal or vertical
		//Check vertical case
		if(destX == this.getX())
			//Destination is above the piece
			if (destX < this.getX()) {
				//Iterate backwards towards destination
				for (int i=this.getX()-1; i>=destX; i--) {
					//Check if the spot is your destination
					if (i == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[i][this.getY()].getPlayer() == (1-this.getPlayer())) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank
						if (!(board[i][this.getY()].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
			//Destination is below the piece
			else {
				//Iterate forwards towards destination
				for (int i=this.getX()+1; i<=destX; i++) {
					//Check if the spot is your destination
					if (i == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[i][this.getY()].getPlayer() == (1-this.getPlayer())) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank
						if (!(board[i][this.getY()].getPlayer() == 2)) {
							return false;
						}
					}
				}
		}
		//Horizontal case
		if(destY == this.getY())
			//Destination is to the left of the piece
			if (destY < this.getY()) {
				//Iterate backwards towards destination
				for (int i=this.getY()-1; i>=destY; i--) {
					//Check if the spot is your destination
					if (i == destY) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()][i].getPlayer() == (1-this.getPlayer())) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank
						if (!(board[this.getX()][i].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
			//Destination is to the right of the piece
			else {
				//Iterate towards destination
				for (int i=this.getY()+1; i<=destY; i++) {
					//Check if the spot is your destination
					if (i == destY) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()][i].getPlayer() == (1-this.getPlayer())) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank
						if (!(board[this.getX()][i].getPlayer() == 2)) {
							return false;
						}
					}
				}
		}
		
		return false;
	}
}
