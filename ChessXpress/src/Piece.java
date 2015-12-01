
public class Piece {
	private int x;
	private int y;
	
	public Piece(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean isValid(Board board, int currX, int currY, int destX, int destY) {
		if(destX == currX && destY == currY)
			return false;
		if(currX < 0 || currX > 7)
			return false;
		if(currY < 0 || currY > 7)
			return false;
		if(destX < 0 || destX > 7)
			return false;
		if(destY < 0 || destY > 7)
			return false;
		//TODO add a check if space is already occupied
		return true;
	}

}
