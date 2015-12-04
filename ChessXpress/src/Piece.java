
public class Piece {
	private int x;
	private int y;
	private boolean inPlay;
	private int player;
	private PieceType type;
	
	public Piece(boolean inPlay, int x, int y, int player, PieceType type) {
		this.inPlay = inPlay;		
		this.x = x;
		this.y = y;
		this.player = player;
		this.type = type;
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
    public int getPlayer() {
    	return this.player;
    }
    public PieceType getType() {
    	return this.type;
    }
    
	public boolean isValid(Piece[][] board, int destX, int destY) {
		if(destX == this.x && destY == this.y)
			return false;
		if(this.x < 0 || this.x > 7)
			return false;
		if(this.y < 0 || this.y > 7)
			return false;
		if(destX < 0 || destX > 7)
			return false;
		if(destY < 0 || destY > 7)
			return false;

		return true;
	}

}
