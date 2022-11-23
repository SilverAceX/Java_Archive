/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashcount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author terer
 */
public class HashCount {
    public HashCount() {
        String value;
        HashValue h_map = new HashValue();
        ArrayList<String> a_list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        value = scan.nextLine();
        while (!value.equals("end")) {
            a_list.add(value);
            value = scan.nextLine();

        }
        scan.close();
        h_map.addMany(a_list);
        System.out.println("Total words are: "+a_list.size());
        System.out.println("Unique words are: "+h_map.get_count());
        System.out.println("############Word Count############");
        System.out.println(h_map.toString());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HashCount();
    }

}
