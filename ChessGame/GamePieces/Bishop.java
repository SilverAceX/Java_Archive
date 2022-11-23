/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;

/**
 *
 * @author terer
 */
abstract public class Bishop extends GamePiece {

    public Bishop(int row, int col, String team) {
        super(row, col, team);
    }

    @Override
    public boolean canMoveTo(int newRow, int newCol) {
        int row = this.getRow();
        int col = this.getCol();
        boolean verify = false;
        if ((newRow >= 0 && newRow <= 7) && (newCol >= 0 && newCol <= 7)) { //Bishops move diagonally only
            if (newCol != col) {
                if (Math.abs((newCol - col)/(newRow - row)) == 1) { // A slope of 1  or -1 indicates that it can move to that spot.
                    verify = true;
                }
            }
        }
        return verify;
    }
}
