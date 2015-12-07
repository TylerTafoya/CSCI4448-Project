import java.awt.*;
import java.applet.*;
import java.awt.event.MouseListener;
import java.awt.image.*;

public class Board extends Applet {
	
       public void paint(Graphics g) {
          
          int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
          //board squares
          Image bksqu = getImage(getCodeBase(), "bksq.gif");
          Image wtsqu = getImage(getCodeBase(), "wtsq.gif");
          
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
          
          final int SQUARE_SIZE = 40;
          
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
          
          g.drawImage(whitePawnReg, 0, 240, this);
          g.drawImage(whitePawnReg, 40, 240, this);
          g.drawImage(whitePawnReg, 80, 240, this);
          g.drawImage(whitePawnReg, 120, 240, this);
          g.drawImage(whitePawnReg, 160, 240, this);
          g.drawImage(whitePawnReg, 200, 240, this);
          g.drawImage(whitePawnReg, 240, 240, this);
          g.drawImage(whitePawnReg, 280, 240, this);
          g.drawImage(whiteBishopReg, 80, 280, this);
          g.drawImage(whiteBishopReg, 200, 280, this);
          g.drawImage(whiteCastleReg, 0, 280, this);
          g.drawImage(whiteCastleReg, 280, 280, this);
          g.drawImage(whiteKnightReg, 40, 280, this);
          g.drawImage(whiteKnightReg, 240, 280, this);
          g.drawImage(whiteKingReg, 160, 280, this);
          g.drawImage(whiteQueenReg, 120, 280, this);
          
          g.drawImage(blackPawnReg, 0, 40, this);
          g.drawImage(blackPawnReg, 40, 40, this);
          g.drawImage(blackPawnReg, 80, 40, this);
          g.drawImage(blackPawnReg, 120, 40, this);
          g.drawImage(blackPawnReg, 160, 40, this);
          g.drawImage(blackPawnReg, 200, 40, this);
          g.drawImage(blackPawnReg, 240, 40, this);
          g.drawImage(blackPawnReg, 280, 40, this);
          g.drawImage(blackBishopReg, 80, 0, this);
          g.drawImage(blackBishopReg, 200, 0, this);
          g.drawImage(blackCastleReg, 0, 0, this);
          g.drawImage(blackCastleReg, 280, 0, this);
          g.drawImage(blackKnightReg, 40, 0, this);
          g.drawImage(blackKnightReg, 240, 0, this);
          g.drawImage(blackKingReg, 160, 0, this);
          g.drawImage(blackQueenReg, 120, 0, this);
          
          //print player's turn
          g.drawString("Player 1's turn", 0, 340);
          
       }
 
    }