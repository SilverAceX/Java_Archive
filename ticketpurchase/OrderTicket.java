/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketpurchase;

import java.util.Scanner;

/**
 *
 * @author terer
 */
public class OrderTicket {

    TheatreGrid theatre;
    Scanner input;

    public OrderTicket() {
        theatre = new TheatreGrid();
        theatre.printGrid();
        input = new Scanner(System.in);
        order();
    }

    public void order() {
        String rowNames = "ABCDEFGHIJ";
        System.out.print("Enter your seat coordinates: ");
        String coord = input.nextLine();
        int row = rowNames.indexOf(coord.substring(0, 1).toUpperCase());
        int col = Integer.parseInt(coord.substring(1))-1;
        while (theatre.getCell(row, col) == 'X') {
            System.out.println("Seat is unavailable try again!");
            System.out.print("Enter your seat coordinates: ");
            coord = input.nextLine();
            row = rowNames.indexOf(coord.substring(0, 1).toUpperCase());
            col = Integer.parseInt(coord.substring(1))-1;
        }
        theatre.setCell(row, col);
        theatre.printGrid();
    }
}