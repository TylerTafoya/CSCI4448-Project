
public class King extends Piece {
	PieceType type;
	public King(boolean inPlay, int x, int y, int player) {
		super(inPlay, x, y, player);
	}
	
	@Override
	public boolean isValid(Board board, int destX, int destY) {
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
