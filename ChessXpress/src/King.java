
public class King extends Piece {
	public King(int x, int y, int player) {
		super(x, y, player, PieceType.KING);
	}
	
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(super.isValid(board, destX, destY) == false)
			return false;
		//Kings move in any direction by 1
		if(destX == this.getX()+1 && destY == this.getY()+1)
			return true;
		if(destX == this.getX()+1 && destY == this.getY()-1)
			return true;
		if(destX == this.getX()-1 && destY == this.getY()+1)
			return true;
		if(destX == this.getX()-1 && destY == this.getY()-1)
			return true;
		if(destX == this.getX()+1 && destY == this.getY())
			return true;
		if(destX == this.getX()-1 && destY == this.getY())
			return true;
		if(destX == this.getX() && destY == this.getY()+1)
			return true;
		if(destX == this.getX() && destY == this.getY()-1)
			return true;

		return false;
		
	}

}
