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
		Piece[][] gameBoard = new Piece[16][16];
		//Player 1 (white) piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			gameBoard[1][i] = new Pawn(1,i, 0);
		}
		//Create rooks for player1
		gameBoard[0][0] = new Rook(0,0, 0);
		gameBoard[0][7] = new Rook(0,7, 0);
		//Create knights for player1
		gameBoard[0][1] = new Knight(0,1, 0);
		gameBoard[0][6] = new Knight(0,6, 0);
		//Create bishops for player1
		gameBoard[0][2] = new Bishop(0,2, 0);
		gameBoard[0][5] = new Bishop(0,5, 0);
		//Create queen for player 1
		gameBoard[0][4] = new Queen(0,4, 0);
		//Create king for player1
		gameBoard[0][3] = new King(0,3, 0);
		
		
		//Player 2 piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			gameBoard[6][i] = new Pawn(6,i, 1);
		}
		//Create rooks for player2
		gameBoard[7][0] = new Rook(7,0, 1);
		gameBoard[7][7] = new Rook(7,7, 1);
		//Create knights for player2
		gameBoard[7][1] = new Knight(7,1, 1);
		gameBoard[7][6] = new Knight(7,6, 1);
		//Create bishops for player2
		gameBoard[7][2] = new Bishop(7,2, 1);
		gameBoard[7][5] = new Bishop(7,5, 1);
		//Create queen for player 1
		gameBoard[7][3] = new Queen(7,3, 1);
		//Create king for player2
		gameBoard[7][4] = new King(7,4, 1);
		
		
		
		//Find player 1s king
		Piece player1King;
		for (int i=0; i<16; i++) {
			for (int j=0; j<16; j++) {
				if ((gameBoard[i][j].getType() == PieceType.KING) && (gameBoard[i][j].getPlayer() == 0)) {
					player1King = gameBoard[i][j];
				}
			}
		}
		//Find player 2s king
		Piece player2King;
		for (int i=0; i<16; i++) {
			for (int j=0; j<16; j++) {
				if ((gameBoard[i][j].getType() == PieceType.KING) && (gameBoard[i][j].getPlayer() == 1)) {
					player2King = gameBoard[i][j];
				}
			}
		}
		//Test isCheck

	}
	//Function that returns if the king at "kingX","kingY" is in check from player "opponent"
	//Takes in the coordinates of the king to check for check, and the list of the other players pieces
	//Returns true if king is in check, false otherwise
	private static boolean isCheck(Piece king, Piece[][] board){
		//List opponentInPlay = new ArrayList();
		//Create ArrayList that is variables size to hold opponents pieces that are still in play
		List<Piece> opponent = new ArrayList<Piece>();
		//Store king to checks coordinates and player to save time in loops
		int kingX = king.getX();
		int kingY = king.getY();
		int kingPlayer = king.getPlayer();
		//Iterate through whole game board and build list of opponents pieces
		for (int i=0; i<16; i++){
			for (int j=0; j<16; j++) {
				//Check if piece is opponents
				if (board[i][j].getPlayer() == 1-kingPlayer){
					opponent.add(board[i][j]);
				}
			}
		}
		for (int i=0; i<opponent.size(); i++){
			//If piece can attack the king, is in check, return true
			if (opponent.get(i).isValid(board,kingX,kingY)){
				return true;
			}
		}
		return false;
	}
}
