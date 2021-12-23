package task44;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> contacts;

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = contacts;
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null) {
            return false;
        }
        boolean returnedValue = contacts.contains(contact) ? false : true;
        if (returnedValue) {
        }
        contacts.add(contact);
        return returnedValue;
    }

    public void printContacts(){
        for (Contact contact: contacts){
            System.out.println(contact.getName() + " -> "  +contact.getPhoneNumber());
        }
    }


    public Contact queryContact(String name) {
        Contact returnedValue = null;
        for (Contact contact : contacts){
            if(contact.getName().equals(name)){
                returnedValue = contact;
            }
        }
        return  returnedValue;
    }

    public int findContact(Contact contact) {
        int returnedValue = 0;
        if (contact == null || !contacts.contains(contact)) {
            returnedValue = -1;
        } else {
            for (Contact c : contacts) {
                returnedValue++;
                if (c.equals(contact)) {
                    return returnedValue;
                }
            }
        }
        return returnedValue;
    }

    public boolean removeContact(Contact contact) {
        if (contact == null) {
            return false;
        }
        boolean returnedValue = contacts.contains(contact) ? true : false;
        if (returnedValue) {
            contacts.remove(contact);
        }
        return returnedValue;
    }

    public boolean updateContact(Contact contactOld, Contact contactNew) {
        if (contactOld == null || contactNew == null) {
            return false;
        }
        boolean returnedValue = contacts.contains(contactOld) ? false : true;
        return returnedValue;
    }

}
