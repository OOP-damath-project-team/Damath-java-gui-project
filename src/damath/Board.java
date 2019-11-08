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
public class Board {
    //instance attributes
    private final int boardLength = 8;
    private final int boardWidth = 8;
    private int player1PieceCount;
    private int player2PieceCount;
    
    //class constructors
    public Board() {
        this.player1PieceCount = 12;
        this.player2PieceCount = 12;
    }
    
    //class getters
    
     
    public class Cell {
        private int cellXPos;
        private int cellYpos;
        private boolean isOccupied;
        
        public Cell(int x, int y) {
            this.cellXPos = x;
            this.cellYpos = y;
            this.isOccupied = false;
        }
        
        public void changeCellState() {
            this.isOccupied = !this.isOccupied;
        }
        
        public boolean getCellState() {
            return this.isOccupied;
        }
                
    }
            
}
