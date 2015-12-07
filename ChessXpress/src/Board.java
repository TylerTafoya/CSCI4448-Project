import java.awt.*;
import java.applet.*;
import java.awt.event.MouseListener;
import java.awt.image.*;

public class Board extends Applet {
	
       public void paint(Graphics g) {
          
          int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
          final int SQUARE_SIZE = 40;
          //board squares
          Image bksqu = getImage(getCodeBase(), "bksq.gif");
          Image wtsqu = getImage(getCodeBase(), "wtsq.gif");
          Image wtsquHL = getImage(getCodeBase(), "wtsqHi.gif");
          Image bksquHL = getImage(getCodeBase(), "bksqHi.gif");
          
          //Pieces
          //white
          Image whitePawnReg   = getImage(getCodeBase(), "wtpaw.gif");
          Image whitePawnHL   = getImage(getCodeBase(), "wtpawHi.gif");
          Image whiteBishopReg   = getImage(getCodeBase(), "wtbsh.gif");
          Image whiteBishopHL   = getImage(getCodeBase(), "wtbshHi.gif");
          Image whiteCastleReg   = getImage(getCodeBase(), "wtcas.gif");
          Image whiteCastleHL   = getImage(getCodeBase(), "wtcasHi.gif");
          Image whiteKnightReg   = getImage(getCodeBase(), "wtkght.gif");
          Image whiteKnightHL   = getImage(getCodeBase(), "wtkghtHi.gif");
          Image whiteKingReg   = getImage(getCodeBase(), "wtking.gif");
          Image whiteKingHL   = getImage(getCodeBase(), "wtkingHi.gif");
          Image whiteQueenReg   = getImage(getCodeBase(), "wtque.gif");
          Image whiteQueenHL   = getImage(getCodeBase(), "wtqueHi.gif");
          //black
          Image blackPawnReg   = getImage(getCodeBase(), "bkpaw.gif");
          Image blackPawnHL   = getImage(getCodeBase(), "bkpawHi.gif");
          Image blackBishopReg   = getImage(getCodeBase(), "bkbsh.gif");
          Image blackBishopHL   = getImage(getCodeBase(), "bkbshHi.gif");
          Image blackCastleReg   = getImage(getCodeBase(), "bkcas.gif");
          Image blackCastleHL   = getImage(getCodeBase(), "bkcasHi.gif");
          Image blackKnightReg   = getImage(getCodeBase(), "bkkght.gif");
          Image blackKnightHL   = getImage(getCodeBase(), "bkkghtHi.gif");
          Image blackKingReg   = getImage(getCodeBase(), "bkking.gif");
          Image blackKingHL   = getImage(getCodeBase(), "bkkingHi.gif");
          Image blackQueenReg   = getImage(getCodeBase(), "bkque.gif");
          Image blackQueenHL   = getImage(getCodeBase(), "bkqueHi.gif");
          
          //draw board squares
          for ( row = 0;  row < 8;  row++ ) {
        	  y = row * SQUARE_SIZE;
             for ( col = 0;  col < 8;  col++) {
                x = col * SQUARE_SIZE;
                if ( (row % 2) == (col % 2) ){
                	g.drawImage(wtsqu, x, y, this);
                }
                else{
                	g.drawImage(bksqu, x, y, this);
                }
             }
          }
          //drawing default piece positions
          /*
           * will need to take in position of piece assigned to it and
           *	multiply by square size
           */
          
          g.drawImage(whitePawnReg,   0*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   1*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   2*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   3*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   4*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   5*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   6*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whitePawnReg,   7*SQUARE_SIZE, 6*SQUARE_SIZE, this);
          g.drawImage(whiteCastleReg, 0*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteKnightReg, 1*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteBishopReg, 2*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteQueenReg,  3*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteKingReg,   4*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteBishopReg, 5*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteKnightReg, 6*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          g.drawImage(whiteCastleReg, 7*SQUARE_SIZE, 7*SQUARE_SIZE, this);
          
         
          g.drawImage(blackPawnReg,   0*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   1*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   2*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   3*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   4*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   5*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   6*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackPawnReg,   7*SQUARE_SIZE, 1*SQUARE_SIZE, this);
          g.drawImage(blackCastleReg, 0*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackKnightReg, 1*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackBishopReg, 2*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackQueenReg,  3*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackKingReg,   4*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackBishopReg, 5*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackKnightReg, 6*SQUARE_SIZE, 0*SQUARE_SIZE, this);
          g.drawImage(blackCastleReg, 7*SQUARE_SIZE, 0*SQUARE_SIZE, this);

          //print player's turn
          g.drawString("Player 1's turn", 0, 340);
          
       }
 
    }