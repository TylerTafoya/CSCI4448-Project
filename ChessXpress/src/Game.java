//Import Piece class
//import Piece;

public class Game{

	public static void main(String[] args) {
		//Board X and Y are counted from top left across and down. 0,0 is top left. 0,7 is top right
		//List of player 1's pieces
		Piece[] player1 = new Piece[16];
		//List of player 1's pieces
		Piece[] player2 = new Piece[16];
		//Create rooks for player1
		player1[0] = new Rook(true,0,0);
		player1[1] = new Rook(true,0,7);

	}

}
