/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashcount;

/**
 *
 * @author terer
 */
public class Counter {
    private int count;
    public Counter(){
        this.count = 1;
    }
    
    public void increment(){
        count += 1;
    }

    @Override
    public String toString() {
        return ""+count;
    }
}
