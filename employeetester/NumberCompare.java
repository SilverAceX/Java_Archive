/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetester;

import java.util.Comparator;

/**
 *
 * @author terer
 */
public class NumberCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.get_num() < e2.get_num() ? -1 : e1.get_num() == e2.get_num() ? 0 : 1;
    }
    
}
