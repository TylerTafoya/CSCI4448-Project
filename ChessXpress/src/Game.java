import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Import Piece class
//import Piece;

public class Game{

	public static void main(String[] args) {
		//Board X and Y are counted from top left across and down. 0,0 is top left. 0,7 is top right
		//List of player 1's pieces
		Piece[] player1 = new Piece[16];
		//List of player 1's pieces
		Piece[] player2 = new Piece[16];
		//Player 1 piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			player1[i] = new Pawn(true,1,i);
		}
		//Create rooks for player1
		player1[8] = new Rook(true,0,0);
		player1[9] = new Rook(true,0,7);
		//Create knights for player1
		player1[10] = new Knight(true,0,1);
		player1[11] = new Knight(true,0,6);
		//Create bishops for player1
		player1[12] = new Bishop(true,0,2);
		player1[13] = new Bishop(true,0,5);
		//Create queen for player 1
		player1[14] = new Queen(true,0,4);
		//Create king for player1
		player1[15] = new King(true,0,3);
		
		
		//Player 2 piece creation
		//Create pawns for player1
		for (int i=0; i<8; i++)
		{
			player2[i] = new Pawn(true,6,i);
		}
		//Create rooks for player2
		player2[8] = new Rook(true,7,0);
		player2[9] = new Rook(true,7,7);
		//Create knights for player2
		player2[10] = new Knight(true,7,1);
		player2[11] = new Knight(true,7,6);
		//Create bishops for player2
		player2[12] = new Bishop(true,7,2);
		player2[13] = new Bishop(true,7,5);
		//Create queen for player 1
		player2[14] = new Queen(true,7,3);
		//Create king for player2
		player2[15] = new King(true,7,4);
		
		
		//Create board
		
		//Test isCheck
		system.out.println(isCheck(player1[14].getX(), player1[14].getY(), player2));

	}
	//Function that returns if the king at "kingX","kingY" is in check from player "opponent"
	//Takes in the coordinates of the king to check for check, and the list of the other players pieces
	//Returns true if king is in check, false otherwise
	private static boolean isCheck(int kingX, int kingY, Piece[] opponent){
		//List opponentInPlay = new ArrayList();
		List<Piece> opponentInPlay = new ArrayList<Piece>();
		for (int i=0; i<16; i++){
			if (opponent[i].isInPlay()){
				opponentInPlay.add(opponent[i]);
			}
		}
		for (int i=0; i<opponentInPlay.size(); i++){
			//If piece can attack the king, is in check, return true
			if (opponentInPlay[i].isValid(kingX,kingY)){
				return true;
			}
		}
		return false;
	}

}
