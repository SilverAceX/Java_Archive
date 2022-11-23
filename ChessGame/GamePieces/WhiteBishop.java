/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;

/**
 *
 * @author terer
 */
public class WhiteBishop extends Bishop{
    public WhiteBishop(int row, int col) {
        super(row, col, "White");
    }

    @Override
    public String toString() {
        return "WB";
    }
    
    
}
