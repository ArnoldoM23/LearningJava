import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("Enter yout choice:" );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addressBook.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }




    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add item to the list");
        System.out.println("\t 3 - To modify item in the list");
        System.out.println("\t 4 - To remove item in the list");
        System.out.println("\t 5 - To search item in the list");
        System.out.println("\t 6 - To quit application");
    }


    private static  void addContact() {
        String name = scanner.nextLine();
        scanner.nextLine();
        int phone = scanner.nextInt();
        Contact newContact = new Contact(name, phone);
        addressBook.addContact(newContact);
    }

    private static void modifyContact() {
        String name = scanner.nextLine();
        scanner.nextLine();
        int phone = scanner.nextInt();
        addressBook.updateContact(name, phone);
    }

    private static void removeContact() {
        String name = scanner.nextLine();
        addressBook.removeContact(name);
    }

    private static void searchContact() {
        String name = scanner.nextLine();
        addressBook.findContact(name);
    }
}
