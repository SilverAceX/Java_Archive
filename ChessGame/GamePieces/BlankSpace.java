/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame.GamePieces;

/**
 *
 * @author terer
 */
public class BlankSpace extends GamePiece {
    public BlankSpace(int row, int col){
        super(row, col, "Blank");
    }
    
    @Override
    public boolean canMoveTo(int row, int col){
        return false;
    }

    @Override
    public String toString() {
        return "  ";
    }
    
    
        
}
