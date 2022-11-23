/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketpurchase;

import java.util.Scanner;

/**
 *
 * @author terer
 */
public class TicketPurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        OrderTicket o1 = new OrderTicket();

        System.out.print("Would you like to order another ticket? (y/n): ");
        String input = scanner.next();
        while (input.equalsIgnoreCase("y")) {
            o1.order();
            System.out.print("Would you like to order another ticket? (y/n): ");
            input = scanner.next();

        }
    }

}
