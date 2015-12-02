
public class Piece {
	private int x;
	private int y;
	private boolean inPlay;
	
	public Piece(boolean inPlay, int x, int y) {
		this.inPlay = inPlay;		
		this.x = x;
		this.y = y;
	}

	public boolean isInPlay() {
        return inPlay;
    }
    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
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

		return true;
	}

}
