import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Import Piece class
//import Piece;

public class Game{

	public static void main(String[] args) {
		//Board X and Y are counted from top left across and down. 0,0 is top left. 0,7 is top right
		//Top is white
		//Create board
		Piece[][] game_board = new Piece[16][16];
		//Player 1 (white) piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			game_board[1][i] = new Pawn(true,1,i, 1);
		}
		//Create rooks for player1
		game_board[0][0] = new Rook(true,0,0, 1);
		game_board[0][7] = new Rook(true,0,7, 1);
		//Create knights for player1
		game_board[0][1] = new Knight(true,0,1, 1);
		game_board[0][6] = new Knight(true,0,6, 1);
		//Create bishops for player1
		game_board[0][2] = new Bishop(true,0,2, 1);
		game_board[0][5] = new Bishop(true,0,5, 1);
		//Create queen for player 1
		game_board[0][4] = new Queen(true,0,4, 1);
		//Create king for player1
		game_board[0][3] = new King(true,0,3, 1);
		
		
		//Player 2 piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			game_board[6][i] = new Pawn(true,6,i, 2);
		}
		//Create rooks for player2
		game_board[7][0] = new Rook(true,7,0, 2);
		game_board[7][7] = new Rook(true,7,7, 2);
		//Create knights for player2
		game_board[7][1] = new Knight(true,7,1, 2);
		game_board[7][6] = new Knight(true,7,6, 2);
		//Create bishops for player2
		game_board[7][2] = new Bishop(true,7,2, 2);
		game_board[7][5] = new Bishop(true,7,5, 2);
		//Create queen for player 1
		game_board[7][3] = new Queen(true,7,3, 2);
		//Create king for player2
		game_board[7][4] = new King(true,7,4, 2);
		
		
		
		//Find player 1s king
		Piece player1King;
		for (int i=0; i<16; i++) {
			for (int j=0; j<16; j++) {
				
			}
		}
		//Find player 2s king
		

	}
	//Function that returns if the king at "kingX","kingY" is in check from player "opponent"
	//Takes in the coordinates of the king to check for check, and the list of the other players pieces
	//Returns true if king is in check, false otherwise
	private static boolean isCheck(int kingX, int kingY, Piece[][] board){
		//List opponentInPlay = new ArrayList();
		List<Piece> opponentInPlay = new ArrayList<Piece>();
		for (int i=0; i<16; i++){
			if (opponent[i].isInPlay()){
				opponentInPlay.add(opponent[i]);
			}
		}
		for (int i=0; i<opponentInPlay.size(); i++){
			//If piece can attack the king, is in check, return true
			if (opponent[i].isValid(kingX,kingY)){
				return true;
			}
		}
		return false;
	}

}
