
public class Blank extends Piece {
	public Blank(int x, int y, int player) {
		super(x, y, player, PieceType.BLANK);
	}
	@Override
	public boolean isValid(Piece[][] board, int destX, int destY) {
		return false;
	}
}
