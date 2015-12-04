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
          Image whiteBishopReg   = getImage(getCodeBase(), "wtbsh.gif");
          Image whiteBishopHL   = getImage(getCodeBase(), "wtbshHi.gif");
          Image whiteCastleReg   = getImage(getCodeBase(), "wtcas.gif");
          Image whiteCastleHL   = getImage(getCodeBase(), "wtcasHi.gif");
          Image whiteKingReg   = getImage(getCodeBase(), "wtking.gif");
          Image whiteKingHL   = getImage(getCodeBase(), "wtkingHi.gif");
          Image whiteQueenReg   = getImage(getCodeBase(), "wtque.gif");
          Image whiteQueenHL   = getImage(getCodeBase(), "wtkqueHi.gif");
          //black
          Image blackBishopReg   = getImage(getCodeBase(), "bkbsh.gif");
          Image blackBishopHL   = getImage(getCodeBase(), "bkbshHi.gif");
          Image blackCastleReg   = getImage(getCodeBase(), "bkcas.gif");
          Image blackCastleHL   = getImage(getCodeBase(), "bkcasHi.gif");
          Image blackKingReg   = getImage(getCodeBase(), "bkking.gif");
          Image blackKingHL   = getImage(getCodeBase(), "bkkingHi.gif");
          Image blackQueenReg   = getImage(getCodeBase(), "bkque.gif");
          Image blackQueenHL   = getImage(getCodeBase(), "bkqueHi.gif");
          
          for ( row = 0;  row < 8;  row++ ) {
        	  y = row * 40;
             for ( col = 0;  col < 8;  col++) {
                x = col * 40;
                if ( (row % 2) == (col % 2) ){
                	g.drawImage(wtsqu, x, y, this);
                    //g.setColor(new Color(0xf0f0e0));
                }
                else{
                	g.drawImage(bksqu, x, y, this);
                }
                //g.fillRect(x, y, 40, 40);
             }
          }
          //drawing default piece positions
          g.drawImage(whiteBishopReg, 80, 280, this);
          g.drawImage(whiteBishopReg, 200, 280, this);
          g.drawImage(whiteCastleReg, 0, 280, this);
          g.drawImage(whiteCastleReg, 280, 280, this);
          g.drawImage(whiteKingReg, 160, 280, this);
          g.drawImage(whiteQueenReg, 120, 280, this);
          
          g.drawImage(blackBishopReg, 80, 0, this);
          g.drawImage(blackBishopReg, 200, 0, this);
          g.drawImage(blackCastleReg, 0, 0, this);
          g.drawImage(blackCastleReg, 280, 0, this);
          g.drawImage(blackKingReg, 160, 0, this);
          g.drawImage(blackQueenReg, 120, 0, this);
          
          
       }
 
    }