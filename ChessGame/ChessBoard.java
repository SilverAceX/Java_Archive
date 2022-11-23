/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chessgame;

import chessgame.GamePieces.GamePiece;
import chessgame.GamePieces.BlankSpace;
import chessgame.GamePieces.BlackBishop;
import chessgame.GamePieces.BlackKing;
import chessgame.GamePieces.BlackKnight;
import chessgame.GamePieces.BlackPawn;
import chessgame.GamePieces.BlackQueen;
import chessgame.GamePieces.BlackRook;
import chessgame.GamePieces.WhiteBishop;
import chessgame.GamePieces.WhiteKing;
import chessgame.GamePieces.WhiteKnight;
import chessgame.GamePieces.WhitePawn;
import chessgame.GamePieces.WhiteQueen;
import chessgame.GamePieces.WhiteRook;
import java.util.Scanner;

/**
 *
 * @author terer
 */
public class ChessBoard {

    private final GamePiece[][] board;

    public ChessBoard() {
        board = new GamePiece[8][8];
        fillBoard();
        printBoard();
    }

    public void fillBoard() {
        GamePiece BlackRow[] = {new BlackRook(0, 0), new BlackKnight(0, 1), new BlackBishop(0, 2), new BlackKing(0, 3), new BlackQueen(0, 4), new BlackBishop(0, 5), new BlackKnight(0, 6), new BlackRook(0, 7)};
        GamePiece WhiteRow[] = {new WhiteRook(7, 0), new WhiteKnight(7, 1), new WhiteBishop(7, 2), new WhiteKing(7, 3), new WhiteQueen(7, 4), new WhiteBishop(7, 5), new WhiteKnight(7, 6), new WhiteRook(7, 7)};

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == 0) {
                    board[row][col] = BlackRow[col];
                } else if (row == 1) {
                    board[row][col] = new BlackPawn(row, col);
                } else if (row == 6) {
                    board[row][col] = new WhitePawn(row, col);
                } else if (row == 7) {
                    board[row][col] = WhiteRow[col];
                } else {
                    board[row][col] = new BlankSpace(row, col);
                }
            }
        }
    }

    public void movePiece(int row, int col, int newRow, int newCol) {
        GamePiece current = board[row][col];
        GamePiece next = board[newRow][newCol];
        Scanner scan = new Scanner(System.in);
        String input = "";
        //System.out.println(current.toString() +" " +current.canMoveTo(newRow, newCol));
        if (current.canMoveTo(newRow, newCol)) { //&& (current.getTeam().equals(next.getTeam()) == false)
            if (current.getTeam().equalsIgnoreCase(next.getTeam()) == false) {
                board[newRow][newCol] = current;
                current.moveTo(newRow, newCol);
                board[row][col] = new BlankSpace(row, col);
            } else {
                while (current.canMoveTo(newRow, newCol) && current.getTeam().equalsIgnoreCase(next.getTeam())) {
                    System.out.print("You can't move on your own piece re enter new coordinate (row, col): ");
                    input = scan.nextLine();
                    String inList[] = input.split(" ");
                    int newCoor[] = {Integer.parseInt(inList[0]), Integer.parseInt(inList[1])};
                    newRow = newCoor[0];
                    newCol = newCoor[1];
                    next = board[newRow][newCol];
                }
                board[newRow][newCol] = current;
                current.moveTo(newRow, newCol);
                board[row][col] = new BlankSpace(row, col);
            }
        } else {
            while (!current.canMoveTo(newRow, newCol) && current.getTeam().equalsIgnoreCase(next.getTeam())) {
                System.out.print("You can't move here re enter new coordinate (row, col): ");
                input = scan.nextLine();
                String inList[] = input.split(" ");
                int newCoor[] = {Integer.parseInt(inList[0]), Integer.parseInt(inList[1])};
                newRow = newCoor[0];
                newCol = newCoor[1];
                next = board[newRow][newCol];
            }
            board[newRow][newCol] = current;
            current.moveTo(newRow, newCol);
            board[row][col] = new BlankSpace(row, col);
        }
    }

    public void printBoard() {
        for (int row = 0; row < 8; row++) {
            System.out.printf(" %s | %s | %s | %s | %s | %s | %s | %s \n", board[row][0].toString(), board[row][1].toString(), board[row][2].toString(), board[row][3].toString(), board[row][4].toString(), board[row][5].toString(), board[row][6].toString(), board[row][7].toString());
            if (row != 7) {
                System.out.println("---------------------------------------");
            } else {
                System.out.println();
            }
        }
    }

}
