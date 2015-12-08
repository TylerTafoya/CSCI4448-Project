
public class Bishop extends Piece {
	public Bishop(int x, int y, int player) {
		super(x, y, player, PieceType.BISHOP);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Bishops move diagonally
		if(!((destX - this.getX()) == (destY - this.getY()))) 
			return false; 
		//Checks the diagonals above you
		if (destX < this.getX()) {
			//Above Left Case
			if (destY < this.getY()) {
				//Iterate towards destination
				for (int i=1; i<8; i++) {
					//Check if the spot is your destination
					if ((this.getX()-i) == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()-i][this.getY()-i].getPlayer() == this.getPlayer()) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank)
						if (!(board[this.getX()-i][this.getY()-i].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
			//Above right case
			else {
				//Iterate towards destination
				for (int i=1; i<8; i++) {
					//Check if it is destination
					if ((this.getX()-i) == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()-i][this.getY()+i].getPlayer() == this.getPlayer()) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank)
						if (!(board[this.getX()-i][this.getY()+i].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
		}
	
		//Destination is below the piece
		else {
			//Below left case
			if (destY < this.getY()) {
				//Iterate towards destination
				for (int i=1; i<8; i++) {
					//Check if the spot is your destination
					if ((this.getX()+i) == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()+i][this.getY()-i].getPlayer() == this.getPlayer()) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank)
						if (!(board[this.getX()+i][this.getY()-i].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
			//Below right case
			else {
				//Iterate towards destination
				for (int i=1; i<8; i++) {
					//Check if the spot is your destination
					if ((this.getX()+i) == destX) {
						//Return false if it is your own piece, otherwise true
						if (board[this.getX()+i][this.getY()+i].getPlayer() == this.getPlayer()) {
							return false;
						}
						//Otherwise it's valid
						else {
							return true;
						}
					}
					//Otherwise spot is not destination
					else {
						//Return false is space is occupied (not Blank)
						if (!(board[this.getX()+i][this.getY()+i].getPlayer() == 2)) {
							return false;
						}
					}
				}
			}
		}
		
		return false;
	}
}
