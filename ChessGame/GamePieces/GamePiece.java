/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;

/**
 *
 * @author terer
 */
abstract public class GamePiece {
    private int row;
    protected int col;
    protected String team;
    public GamePiece(int new_row, int new_col, String team){
        this.row = new_row;
        this.col = new_col;
        this.team = team;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getCol() {
        return col;
    }
    
    public String getTeam(){
        return team;
    }
    
    public void moveTo(int newRow, int newCol){ //Set's the game piece's relative position on the board
        this.row = newRow;
        this.col = newCol;
    }
    
    abstract public boolean canMoveTo(int row, int col);

}
