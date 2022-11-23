/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetester;

import java.util.Scanner;

/**
 *
 * @author terer
 */
public class EmployeeTester {

    /**
     * @param args the command line arguments
     */
    public EmployeeTester() {
        EmployeeList newList = new EmployeeList();
        Scanner scan = new Scanner(System.in);
        String info = scan.nextLine();
        while (!info.equals("end")) {
            newList.addEmployee(info);
            info = scan.nextLine();
        }
        System.out.println("#############Sorted Order#############");
        System.out.println(newList.viewEmployees(false));
        System.out.println("#############Reverse#############");
        System.out.println(newList.viewEmployees(true));

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new EmployeeTester();
    }

}
