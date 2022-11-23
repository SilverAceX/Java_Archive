/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PizzaClasses;

/**
 *
 * @author terer
 */
public class PizzaOrder {

    private String size;
    private int quantity;
    private String toppings;

    public PizzaOrder(String size, int quantity, String toppings) {
        this.size = size;
        this.quantity = quantity;
        this.toppings = toppings;
    }

    public double calculateCost() {
        double cost = 0;
        String p_size = this.size.toLowerCase();
        if (p_size.equals("small")) {
            cost = 5.75;
        } else if (p_size.equals("medium")) {
            cost = 7.50;
        } else if (p_size.equals("large")) {
            cost = 12;
        } else if (p_size.equals("x-large")) {
            cost = 14.50;
        }
        return cost*this.quantity;
    }

    @Override
    public String toString() {
        if(!this.toppings.equals("")) {
            return "Pizza size: "+ size + "\nToppings: " + "\n" + this.toppings +"Total Cost: " + this.calculateCost()+"\n" ;
        }
        return "Pizza size: "+ size +"\nTotal Cost: " + this.calculateCost()+"\n" ;
    }
    
    

}
