import java.util.ArrayList;

public class GroceryList {
    private int[] myNumber = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item in your list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("item " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeItem(int position) {
        groceryList.remove(position);
    }

    public String findItem(String item) {
        return groceryList.get(groceryList.indexOf(item));
    }
}
