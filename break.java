import java.util.Scanner;

public class ProductSearch {
    public static void main(String[] args) {
        String[] inventory = {"Pen", "Pencil", "Notebook", "Eraser", "Marker", "Scale"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product to search: ");
        String searchItem = scanner.nextLine();

        boolean found = false;

        for (String item : inventory) {
            if (item.equalsIgnoreCase(searchItem)) {
                found = true;
                System.out.println(searchItem + " found in inventory.");
                break;  // exits loop when item is found
            }
        }

        if (!found) {
            System.out.println(searchItem + " not found in inventory.");
        }

        scanner.close();
    }
}
