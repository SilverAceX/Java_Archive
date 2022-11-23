/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author terer
 */
public class EmployeeList {

    private ArrayList emp_list;

    public EmployeeList() {
        this.emp_list = new ArrayList();
    }

    public void addEmployee(String lineToSplit) {
        String[] split = lineToSplit.split(",");
        Employee new_emp = new Employee(split[0], Integer.parseInt(split[1]), Double.parseDouble(split[2]));
        emp_list.add(new_emp);
    }

    public String viewEmployees(boolean reverse) {
        String output = "";
        if (reverse) {
            Collections.sort(emp_list, new NumberCompare());
            Collections.reverse(emp_list);
        } else {
            Collections.sort(emp_list, new NumberCompare());

        }
        Iterator iter = emp_list.iterator();
        while (iter.hasNext()) {
            output += iter.next().toString() + "\n";
        }
        
        return output;
    }
}
