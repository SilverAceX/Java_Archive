/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;
/**
 *
 * @author terer
 */
abstract public class Rook extends GamePiece { 
    public Rook(int row, int col, String team){
        super(row, col, team);
    }
    
    @Override
    public boolean canMoveTo(int newRow, int newCol){
        int row = this.getRow();
        int col = this.getCol();
        //System.out.println(row + " " + col + " " + newRow + " " + newCol);
        boolean verify = false;
        if ((newCol >= 0 && newCol <= 7) && (newRow >= 0 && newRow <= 7)) {
            if ((newCol == col) || (newRow == row)) { // Verifies horizonatal movement if new column and old column are equal
                verify = true;
            }
        }
        return verify;
    }
}
