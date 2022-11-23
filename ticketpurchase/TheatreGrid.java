/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketpurchase;

/**
 *
 * @author terer
 * Student Number: n01471548
 */
public class TheatreGrid {
    private char[][] grid;
    public TheatreGrid(){
        grid = new char[10][20];
        initializeGrid();
    }
    
    public void initializeGrid(){
        for (int row=0; row < 10; row++) {
            for (int col=0; col < 20; col++){
                grid[row][col] = '-';
            }
        }
    }
    public char getCell(int row, int col){
        return grid[row][col];
    }
    public void setCell(int row, int col){
        grid[row][col] = 'X';
    }
    
    public void printGrid() {
        System.out.println("  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");
        for (int row=0; row < 10; row++) {
            System.out.print((char)(65+row)+ " ");
            for (int col=0; col < 20; col++){
                System.out.print(grid[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
