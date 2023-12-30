package Challenge;

import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }

        return -1;
    }

    private int findContact(String string){
        for(Contact contact : myContacts){
            if(contact.getName().equals(string) || contact.getPhoneNumber().equals(string)){
                return findContact(contact);
            }
        }

        return -1;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())==-1){
            myContacts.add(contact);
            return true;
        }
        System.out.println("Contact is already on file");
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(!addNewContact(oldContact)){
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact contact){
        if(!addNewContact(contact)){
            int index = myContacts.indexOf(contact);
            myContacts.remove(index);
            return true;
        }

        return false;
    }

    public Contact queryContact(String string){

        for(Contact contact : myContacts){
            if(contact.getName().equals(string)){
                return contact;
            }
        }

        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        int index = 1;
        for(Contact contact : myContacts){
            System.out.println(index +". "+ contact.getName()+" -> "+contact.getPhoneNumber());
            index++;
        }
    }
}
