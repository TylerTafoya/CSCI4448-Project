import java.awt.*;
import java.applet.*;

    public class Board extends Applet {
    
       public void paint(Graphics g) {
          
          int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
       
          for ( row = 0;  row < 8;  row++ ) {
          
             for ( col = 0;  col < 8;  col++) {
                x = col * 40;
                y = row * 40;
                if ( (row % 2) == (col % 2) )
                   g.setColor(Color.gray);
                else
                   g.setColor(Color.black);
                g.fillRect(x, y, 40, 40);
             } 
          }
       }
    }
