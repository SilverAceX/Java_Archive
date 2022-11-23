/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;
/**
 *
 * @author terer
 */
public class King extends GamePiece {
    
    public King(int row, int col, String team) {
        super(row, col, team);
    }

    @Override
    public boolean canMoveTo(int newRow, int newCol) {
        int row = this.getRow();
        int col = this.getCol();
        boolean verify = false;
        if ((newCol >= 0 && newCol <= 7) && (newRow >= 0 && newCol <= 7)) {
            if ((((row + 1) == newRow) && (col == newCol)) || (((row - 1) == newRow) && (col == newCol))){ // Verifies if the new location is one up or one down
                verify = true;
            }else if (((row == newRow) && ((col + 1) == newCol)) || ((row == newRow) && ((col - 1) == newCol))){ // Verifies if the new location is one to the left or right
                verify = true;
            }else if ((((row - 1) == newRow) && ((col + 1) == newCol)) || (((row - 1) == newRow) && ((col - 1) == newCol)) || (((row + 1) == newRow) && ((col + 1) == newCol)) || (((row + 1) == newRow) && ((col - 1) == newCol))){ //Verifies if the new location is within on space diagonally
                verify = true;
            }
        }
        return verify;
    }

}
