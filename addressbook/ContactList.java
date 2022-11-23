/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook;

/**
 *
 * @author terer
 */
public class ContactList {

    private Contact[] contacts;
    private int arrayLength = 20;

    public ContactList() {
        contacts = new Contact[arrayLength];
    }

    public Contact[] getList() {
        return contacts;
    }

    public void insert(Contact newContact) {
        if (contacts[0] == null) {
            contacts[0] = newContact;
        } else if (contacts[arrayLength - 1] != null) {
            System.out.println("Contact list has reached max capacity");
        } else {
            Contact[] copyList = new Contact[arrayLength];
            for (int c = 0; c < contacts.length; c++) {
                if (contacts[c] == null) {
                    break;
                }
                copyList[c] = contacts[c];
            }

            for (int i = 0; i < contacts.length; i++) {
                if (newContact.getLname().compareTo(contacts[0].getLname()) < 0) {
                    contacts[0] = newContact;
                    for (int d = 0; d < contacts.length; d++) {
                        if (contacts[d] == null) {
                            break;
                        }
                        contacts[d + 1] = copyList[d];
                    }
                    break;
                } else if (contacts[i + 1] == null) {
                    if (newContact.getLname().compareTo(contacts[i].getLname()) > 0) {
                        contacts[i + 1] = newContact;
                    } else {
                        Contact temp = contacts[i];
                        contacts[i] = newContact;
                        contacts[i + 1] = temp;
                    }

                    break;
                } else if ((newContact.getLname().compareTo(contacts[i].getLname()) > 0 && newContact.getLname().compareTo(contacts[i + 1].getLname()) < 0) || (newContact.getLname().compareTo(contacts[i].getLname()) == 0)) {
                    contacts[i + 1] = newContact;
                    for (int e = i + 1; e < contacts.length; e++) {
                        if (e != arrayLength - 1) {
                            contacts[e + 1] = copyList[e];
                        }
                    }
                    break;
                }
            }
        }
        //this.printList();
    }

    public void printList() {
        for (Contact contact : contacts) {
            if (contact != null) {
                System.out.println(contact.toString());
            }
        }
    }

    public void printList(String filter) {
        for (Contact contact : contacts) {
            if (contact != null) {
                if (contact.getLname().startsWith(filter)) {
                    System.out.println(contact.toString());
                }
            }
        }
    }
}
