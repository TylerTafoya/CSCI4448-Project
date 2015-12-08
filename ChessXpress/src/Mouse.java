
public class Mouse {
	private double x;
	private double y;
	public Mouse() {
		this.x = 0;
		this.y = 0;
	}
	public void setPos(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Return the square coordinates
	public int getX() {
		int tempX = (int) (this.x/75);
		return tempX;
	}
	public int getY() {
		int tempY = (int) (this.y/75);
		return tempY;
	}
}
