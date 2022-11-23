/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;
/**
 *
 * @author terer
 */
abstract public class Knight extends GamePiece{
    public Knight(int row, int col, String team){
        super(row, col, team);
    }

   @Override
    public boolean canMoveTo(int newRow, int newCol) {
        int row = this.getRow();
        int col = this.getCol();
        boolean verify = false;
        if ((newCol >= 0 && newCol <= 7) && (newRow >= 0 && newRow <= 7)) {
            if (((col - 2) == newCol && (row - 1) == newRow) || ((col-1) == newCol && (row - 2) == newRow) || ((col + 1) == newCol && (row - 2) == newRow) || ((col + 2) == newCol && (row - 1) == newRow) || ((col - 2) == newCol && (row + 1) == newRow) || ((col - 1) == newCol && (row + 2) == newRow) || ((col + 1) == newCol && (row + 2) == newRow) || ((col + 2) == newCol && (row + 1) == newRow)) {
                verify = true;
            }
        } //Verifies if the new location is within two spaces in one direction and one in a perpendicular space
        return verify;
    }
}
