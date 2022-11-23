/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addressbook;

/**
 *
 * @author terer
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrayLength = 20;
        ContactList contacts = new ContactList();
        contacts.insert(new Contact("Talyza","Fruhbrodt","778-251-7095","7 Mount Ave"));
        contacts.insert(new Contact("Talyza","Zrskine","778-251-7095","8 Mount Ave"));
        contacts.insert(new Contact("Talyza","Bbskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Ebskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Bbskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Erskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Crskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Brskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Arskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Aaskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Daskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Saskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Fruhbrodt","778-251-7095","7 Mount Ave"));
        contacts.insert(new Contact("Talyza","Uaskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Vaskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Waskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Bbskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Cbskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Ebskine","778-251-8888","87 Mountain Ave"));
        contacts.insert(new Contact("Talyza","Erskine","778-251-8888","87 Mountain Ave"));
        contacts.printList();
        
        System.out.println("Print list has method overloading to allow filtering");
        System.out.println("Filter last names starting with the letter A");
        contacts.printList("A"); //print lists has method overloadin
        System.out.println("Filter last names starting with the letter V");
        contacts.printList("V");
    }

}
