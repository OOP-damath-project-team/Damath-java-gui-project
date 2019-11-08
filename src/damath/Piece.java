/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damath;

/**
 *
 * @author Student
 */
public class Piece {
    //instance attributes
    private int xpos; //x-position of the piece in the board
    private int ypos; //y-position of the piece in the board
    private int value; //initial value of the piece(board modifier excluded)
    private int playerOwner; // signifies the player owner
    private boolean pieceStatus; // is piece still available?
    private boolean pieceRankedUp; // is piece already reached the enemy player base?
    
    // class constructors
    public Piece(int x, int y, int v, int p) {
        this.xpos = x;
        this.ypos = y;
        this.value = v;
        this.playerOwner = p;
        this.pieceStatus = true;
        this.pieceRankedUp = false;
    }
    //setters
    public void setX(int x) {
        this.xpos = x;
    }
    public void setY(int y) {
        this.xpos = y;
    }
    public void setVal(int v) {
        this.value = v;
    }
    public void setPlayerOwner(int p) {
        this.playerOwner = p;
    }
    public void setPieceStatus (boolean s) {
        this.pieceStatus = s;
    }
    public void setPieceRankedUp(boolean r) {
        this.pieceRankedUp = r;
    }
    //getters
    public int getXPos() {
        return this.xpos;
    }
    public int getYPos() {
        return this.ypos;
    }
    public int getValue() {
        return this.value;
    }
    public int getPlayerOwner() {
        return this.playerOwner;
    }
    public boolean getPieceStatus() {
        return this.pieceRankedUp;
    }
    
    //instance methods
    public void updateInfo(int newX, int newY, boolean s, boolean r) {
        this.setX(newX);
        this.setY(newY);
        this.setPieceStatus(s);
        this.setPieceRankedUp(r);
    }
    
}
