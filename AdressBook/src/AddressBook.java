import java.util.ArrayList;

public class AddressBook {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();


    public int findContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public int findContact(Contact contact) {
        return contactList.indexOf(contact);
    }

    public void removeContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            contactList.remove(position);
            System.out.println("Deleted " + name + " from contacts");
        } else {
            System.out.println("contact does not exist");
        }
    }

    public void removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            contactList.remove(position);
            System.out.println("Deleted " + contact.getName() + " from contacts");
        } else {
            System.out.println("contact does not exist");
        }
    }

    public void addContact(Contact contact) {

        if(findContact(contact) >= 0){
            System.out.println("Contact already exist");
        } else {
            contactList.add(contact);
            System.out.println("Contact has been added");
        }
    }

    public void updateContact(String name, int phoneNumber) {
        int position = findContact(name);
        if (position >= 0) {
            contactList.get(position).setName(name);
            contactList.get(position).setPhoneNumber(phoneNumber);
        } else {
            System.out.println("contact does not exist");
        }
    }

    public void printContactList() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i).getName());
        }
    }
}
