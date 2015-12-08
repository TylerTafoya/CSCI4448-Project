import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
public class chessGame {
		//Coordinates to highlight
		private int xHi = 8; //Amount over
		private int yHi = 0; //Amount down
		//If a piece was previously selected
		private boolean selected = false;
		//Which players turn it is
		private int turn = 0;
		//If this is the first run of display
        private boolean first;
    	private Pane root;
    	//Mouse listener
    	private Mouse mouse;
    	//Game board of pieces
    	private Piece[][] gameBoard = new Piece[9][8];
    	//2D array of rectangles for board
    	private Rectangle[][] r = new Rectangle[8][8];
    	//2D array of rectangles for pieces
    	private Rectangle[][] p = new Rectangle[8][8];
    	//Text to display for players turn
    	private Text text;
    	//Height of window / number of squares
		private int square_size = (600)/8; //75
    	//board squares
        private Image bksqu = new Image("file:pic/bksq.gif");
    	private Image wtsqu = new Image("file:pic/wtsq.gif");
        private Image wtsquHL = new Image("file:pic/wtsqHi.gif");
        private Image bksquHL = new Image("file:pic/bksqHi.gif");
    	//Pieces
        //white
        private Image whitePawnReg = new Image("file:pic/wtpaw.gif");
        private Image whiteBishopReg = new Image("file:pic/wtbsh.gif");
        private Image whiteCastleReg = new Image("file:pic/wtcas.gif");
        private Image whiteKnightReg = new Image("file:pic/wtkght.gif");
        private Image whiteKingReg = new Image("file:pic/wtking.gif");
        private Image whiteQueenReg = new Image("file:pic/wtque.gif");
        //black
        private Image blackPawnReg = new Image("file:pic/bkpaw.gif");
        private Image blackBishopReg = new Image("file:pic/bkbsh.gif");
        private Image blackCastleReg = new Image("file:pic/bkcas.gif");
        private Image blackKnightReg = new Image("file:pic/bkkght.gif");
        private Image blackKingReg = new Image("file:pic/bkking.gif");
        private Image blackQueenReg = new Image("file:pic/bkque.gif");
        
    	public chessGame(Mouse mouse, Pane root) {
    		//System.out.println("init");
    		this.mouse = mouse;
    		this.root = root;
    		//Check if this is the first run of the display
    		this.first = true;
    		//Create whole board as blank pieces to be overwritten
    		for (int row=0; row<8; row++) {
    			for (int col=0; col<8; col++) {
    				this.gameBoard[row][col] = new Blank(row,col,2);
    			}
    		}
    		//Player 1 (white) piece creation
    		//Create pawns for player1
    		for (int i=0; i<8; i++)
    		{
    			this.gameBoard[1][i] = new Pawn(1,i, 0);
    		}
    		//Create rooks for player1
    		this.gameBoard[0][0] = new Rook(0,0, 0);
    		this.gameBoard[0][7] = new Rook(0,7, 0);
    		//Create knights for player1
    		this.gameBoard[0][1] = new Knight(0,1, 0);
    		this.gameBoard[0][6] = new Knight(0,6, 0);
    		//Create bishops for player1
    		this.gameBoard[0][2] = new Bishop(0,2, 0);
    		this.gameBoard[0][5] = new Bishop(0,5, 0);
    		//Create queen for player 1
    		this.gameBoard[0][4] = new Queen(0,4, 0);
    		//Create king for player1
    		this.gameBoard[0][3] = new King(0,3, 0);
    		
    		
    		//Player 2 piece creation
    		//Create pawns for player1
    		for (int i=0; i<8; i++)
    		{
    			this.gameBoard[6][i] = new Pawn(6,i, 1);
    		}
    		//Create rooks for player2
    		this.gameBoard[7][0] = new Rook(7,0, 1);
    		this.gameBoard[7][7] = new Rook(7,7, 1);
    		//Create knights for player2
    		this.gameBoard[7][1] = new Knight(7,1, 1);
    		this.gameBoard[7][6] = new Knight(7,6, 1);
    		//Create bishops for player2
    		this.gameBoard[7][2] = new Bishop(7,2, 1);
    		this.gameBoard[7][5] = new Bishop(7,5, 1);
    		//Create queen for player 1
    		this.gameBoard[7][3] = new Queen(7,3, 1);
    		//Create king for player2
    		this.gameBoard[7][4] = new King(7,4, 1);
    		
    		//Permanent Blank spot for between turns
    		this.gameBoard[8][0] = new Blank(8,0,2);
    		//Create game board rectangles
    		for (int row=0; row<8; row++) {
    			for (int col=0; col <8; col++) {
    				this.r[row][col] = new Rectangle();
    				this.r[row][col].setX(col * this.square_size);
    				this.r[row][col].setY(row * this.square_size);
    				this.r[row][col].setWidth(this.square_size);
    				this.r[row][col].setHeight(this.square_size);
    				
    			}
    		}
    		
    		//Create piece rectangles
    		for (int row=0; row<8; row++) {
    			for (int col=0; col <8; col++) {
    				this.p[row][col] = new Rectangle();
    				this.p[row][col].setX(col * this.square_size);
    				this.p[row][col].setY(row * this.square_size);
    				this.p[row][col].setWidth(this.square_size);
    				this.p[row][col].setHeight(this.square_size);
    				
    			}
    		}
    		
    		
    	}
    	public void click() {
    		//System.out.println("Clicked");
    		//if (this.started) {
    			
    			//Check if it is the current players piece
    			if (this.gameBoard[mouse.getX()][mouse.getY()].getPlayer() == turn) {
    				this.yHi = mouse.getY();
        			this.xHi = mouse.getX();
        			selected = true;
    			}
    			//Check if the player has selected a piece and a valid destination for it
    			if (selected && this.gameBoard[this.xHi][this.yHi].isValid(this.gameBoard, mouse.getX(), mouse.getY())) {
    				//Move piece to destination and switch player turn
    				this.gameBoard[mouse.getX()][mouse.getY()] = this.gameBoard[this.xHi][this.yHi];
    				//Set piece variables
    				this.gameBoard[mouse.getX()][mouse.getY()].setX(mouse.getX());
    				this.gameBoard[mouse.getX()][mouse.getY()].setY(mouse.getY());
    				//Set old space to Blank
    				this.gameBoard[this.xHi][this.yHi] = new Blank(this.xHi,this.yHi,2);
    				//Remove highlighting
    				this.yHi = 0;
    				this.xHi = 8;
    				//Change turn
    				turn = 1-turn;
    				selected = false;
    			}

    			
    			
    			//redisplay
    			display();
    		//}
    	}
    	public void start(int player) {
    		//System.out.println("started");
    		//this.started = true;
    		display();
    		this.first = false;
    	}
    	
    	private void display() {
    		//System.out.println("display");
    		//Remove all pieces from root pane after first iteration
    		//System.out.println(this.mouse.getX());
    		//System.out.println(this.mouse.getY());
    		
    		if (first == false) {
	    		for (int row=0; row<8; row++) {
	    			for (int col=0; col<8; col++) {
	    				this.root.getChildren().remove(this.p[row][col]);
	    				this.root.getChildren().remove(this.r[row][col]);
	    			}
	    		}
	    		this.root.getChildren().remove(text);
    		}
    		Rectangle playerTurn = new Rectangle(200,100);
    		playerTurn.setX(600);
    		playerTurn.setY(0);
    		playerTurn.setFill(Color.TRANSPARENT);
    		text = new Text("Player " + (turn+1) + "'s turn");
    		text.setFont(text.getFont().font(28));
            text.setFill(Color.WHITE);
            text.setTranslateX(610);
            text.setTranslateY(50);
    		this.root.getChildren().addAll(playerTurn,text);
    		
    		for (int row=0; row<8; row++) {
    			for (int col=0; col<8; col++) {
    				//White square
                    if ( (row % 2) == (col % 2) ){
                    	//Check if this square is valid or selected, if so highlight
                    	if (((row == this.xHi) && (col == this.yHi)) || (this.gameBoard[this.xHi][this.yHi].isValid(this.gameBoard, row, col))){
                    		this.r[row][col].setFill(new ImagePattern(this.wtsquHL, 0, 0, 1, 1, true));
                    	}
                    	//Otherwise square is normal
                    	else {
	                    	//Fill rectangle with background white pattern
	                    	this.r[row][col].setFill(new ImagePattern(this.wtsqu, 0, 0, 1, 1, true));
                    	}
                    }
                    //Black square
                    else{
                    	//Check if this square is valid or selected, if so highlight
                    	if (((row == this.xHi) && (col == this.yHi)) || this.gameBoard[this.xHi][this.yHi].isValid(this.gameBoard, row, col)){
                    		this.r[row][col].setFill(new ImagePattern(this.bksquHL, 0, 0, 1, 1, true));
                    	}
                    	//Otherwise square is normal
                    	else {
                    		//Fill rectangle with background black pattern
                    		this.r[row][col].setFill(new ImagePattern(this.bksqu, 0, 0, 1, 1, true));
                    	}
                    }
                    //Add this square to the root pane
                    this.root.getChildren().add(this.r[row][col]);
    			}
    		}
    		
    		//Now run though board again and add pieces
    		for (int row=0; row<8; row++) {
    			for (int col=0; col<8; col++) {
    				//Now check and map the pieces on gameBoard
                    //Check player for color
                    //White
                    if (gameBoard[row][col].getPlayer() == 0) {
                    	//Change image for each piece
                        switch (gameBoard[row][col].getType()) {
    	                    case BISHOP:
    	        				this.p[row][col].setFill(new ImagePattern(this.whiteBishopReg, 0, 0, 1, 1, true));
    	                    	this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case KING:
                                this.p[row][col].setFill(new ImagePattern(this.whiteKingReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case KNIGHT:
                                this.p[row][col].setFill(new ImagePattern(this.whiteKnightReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case PAWN:
                                this.p[row][col].setFill(new ImagePattern(this.whitePawnReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case ROOK:   
                                this.p[row][col].setFill(new ImagePattern(this.whiteCastleReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case QUEEN: 
                                this.p[row][col].setFill(new ImagePattern(this.whiteQueenReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
    	                    	break;
    	                    case BLANK:
    	                    	this.p[row][col].setFill(Color.TRANSPARENT);
    	                    	this.root.getChildren().add(this.p[row][col]);
    	                    	break;
                        }
                    }
                    //Otherwise black piece
                    else if (gameBoard[row][col].getPlayer() == 1){
                        //Change image for each piece
                        switch (gameBoard[row][col].getType()) {
                            case BISHOP:
                                this.p[row][col].setFill(new ImagePattern(this.blackBishopReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case KING:
                                this.p[row][col].setFill(new ImagePattern(this.blackKingReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case KNIGHT:
                                this.p[row][col].setFill(new ImagePattern(this.blackKnightReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case PAWN:
                                this.p[row][col].setFill(new ImagePattern(this.blackPawnReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case ROOK:   
                                this.p[row][col].setFill(new ImagePattern(this.blackCastleReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case QUEEN: 
                                this.p[row][col].setFill(new ImagePattern(this.blackQueenReg, 0, 0, 1, 1, true));
                                this.root.getChildren().add(this.p[row][col]);
                                break;
                            case BLANK:
                            	this.p[row][col].setFill(Color.TRANSPARENT);
                            	this.root.getChildren().add(this.p[row][col]);
                            	break;
                    
                        }
                    }
                    
                    //Otherwise it is a blank space
                    else {
                    	this.p[row][col].setFill(Color.TRANSPARENT);
                    	this.root.getChildren().add(this.p[row][col]);
                    }
                    
    			}
    		}
    	}
    }