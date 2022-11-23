/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;
/**
 *
 * @author terer
 */
abstract public class Queen extends GamePiece{
    public Queen(int row, int col, String team) {
        super(row, col, team);
    }

    @Override
    public boolean canMoveTo(int newRow, int newCol){
        int row = this.getRow();
        int col = this.getCol();
        boolean verify = false;
        if ((newCol >= 0 && newCol <= 7) && (newRow >= 0 && newRow <= 7)) {
            if (newCol == col) {
                verify = true;
            }else if ((Math.abs((newRow - row)/(newCol - col)) == 1) || (Math.abs((newRow - row)/(newCol - col)) == 0)){ // Verifies horizontal movement with a slope of 0, diagonal with a slope of 0 and vertical when the current column and new column are equal
                verify = true;
            }
        }
        return verify;
    }
}
