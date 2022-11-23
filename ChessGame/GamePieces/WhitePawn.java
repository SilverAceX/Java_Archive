/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;

/**
 *
 * @author terer
 */
public class WhitePawn extends GamePiece {
    protected boolean firstMove;

    public WhitePawn(int row, int col) {
        super(row, col, "White");
        this.firstMove = true;
    }

    @Override
    public boolean canMoveTo(int newRow, int newCol) {
        int row = this.getRow();
        int col = this.getCol();
        boolean verify = false;
        System.out.println(row + " " + col + " " + newRow + " " + newCol);

        if ((newCol >= 0 && newCol <= 7) && (newRow >= 0 && newRow <= 7)) {
            if ((newCol == col) && newRow == (row - 2) && firstMove) {
                verify = true;
                firstMove = false;
            } else if (((newCol == col) && newRow == (row - 1))) {
                verify = true;
                firstMove = false;
            }
        }
        return verify;
    }

    @Override
    public String toString() {
        return "WP";
    }

}
