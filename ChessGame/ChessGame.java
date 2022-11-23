/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chessgame;
import java.util.Scanner;

/**
 *
 * @author terer
 */
public class ChessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        boolean playerOne = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("end")){ //Lets players end game early using 'end'
            if (playerOne){
                System.out.println("Player 1's Turn");
            } else {
                System.out.println("Player 2's Turn");
            }
            playerOne = (!playerOne);
            System.out.print("Enter original and new coordinate (row, col, new row, new col): ");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("end")){
                break;
            }
            String inList[] = input.split(" ");
            int newCoor[] = {Integer.parseInt(inList[0]), Integer.parseInt(inList[1]), Integer.parseInt(inList[2]), Integer.parseInt(inList[3])};  
            board.movePiece(newCoor[0], newCoor[1], newCoor[2], newCoor[3]); // Split input and turn into integers. Then pass it off to move the pieces where it validates movements.
            board.printBoard(); //Prints Updated Board
        }
    }
    
}
