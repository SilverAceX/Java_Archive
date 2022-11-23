/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetester;

/**
 *
 * @author terer
 */
public class Employee {
    private int emp_num;
    private String emp_name;
    private double emp_salary;
    
    public Employee( String n_name, int n_num, double n_salary){
        this.emp_num = n_num;
        this.emp_name = n_name;
        this.emp_salary = n_salary;
    }
    
    public int get_num(){
        return this.emp_num;
    }

    @Override
    public String toString() {
        return emp_name + "(" + emp_num + ") gets $" + emp_salary + " annually";
    }
    
}
