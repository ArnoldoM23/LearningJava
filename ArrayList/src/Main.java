import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter yout choice:" );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add item to the list");
        System.out.println("\t 3 - To modify item in the list");
        System.out.println("\t 4 - To remove item in the list");
        System.out.println("\t 5 - To search item in the list");
        System.out.println("\t 6 - To quit application");
    }

    public static void addItem() {
        System.out.println("Please enter and item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.println("Enter item you want to remove");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNumber -1);
    }

    public static void modifyItem() {
        System.out.println("Enter item you want to replace");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new item");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void searchForItem() {
        System.out.println("Enter item you want to search");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("item found " + searchItem);
        } else {
            System.out.println("Item is not in the list");
        }

    }

}
