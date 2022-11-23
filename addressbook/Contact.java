/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 *
 * @author terer
 */
public class Contact {
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    
    public Contact(String f_name, String l_name, String phone_number, String email){
        this.first_name = f_name;
        this.last_name = l_name;
        this.phone_number = phone_number;
        this.email = email;
    }
    
    public String getFname(){
        return first_name;
    }
    
    public String getLname(){
        return last_name;
    }
    
    public String getNumber(){
        return phone_number;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setFname(String newName){
        first_name = newName;
    }
    
    public void setLname(String newName){
        last_name = newName;
    }
    
    public void setNumber(String newNumber){
        phone_number = newNumber;
    }
    
    public void setEmail(String newEmail){
        email = newEmail;
    }

    @Override
    public String toString() {
        return "Name: "+first_name+" "+last_name+"\nPhone number: "+phone_number+"\nEmail: "+ email+"\n"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
