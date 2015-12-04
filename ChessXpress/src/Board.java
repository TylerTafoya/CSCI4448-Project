import java.awt.*;
import java.applet.*;
import java.awt.image.*;

public class Board extends Applet {
    
       public void paint(Graphics g) {
          
          int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
          Image bksqu   = getImage(getCodeBase(), "bksq.gif");
          Image wtsqu   = getImage(getCodeBase(), "wtsq.gif");
       
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
       }
       
       
       
       
       
       
    }
