package proj_21_22;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class JsonSample {
    public static void main(String[] args) throws IOException, InterruptedException {

        int id;
        ItemsStore item = null;
        String data;
        boolean isGood;
        String description;

        Scanner sc = new Scanner(System.in);
        System.out.println("Select implementation method: 1- file, 2- server");
        int method = sc.nextInt();

        if (method == 1) {
            item = new File("D:/Repositories/java_proj/Java_project/src/main/java/proj_21_22/data.json");
        } else if (method == 2) {
            item = new Server();
        }

        System.out.println("Choose further function: 1-get all, 2- get, 3- add item, 4- edit item, 5- delete item");
        int function = sc.nextInt();

        while (function != 0) {
            List<Item> items = item.getAll();
            switch (function) {
                case 1: {
                    for (Object i : items) {
                        System.out.println(i);
                    }
                    break;
                }
                case 2: {
                    if (items.size() != 0) {
                        System.out.print("Item id(>0): ");
                        id = sc.nextInt();
                        if (item.get(id) != null) {
                            System.out.println("Item is with id=" + id + ": " + item.get(id));
                        } else {
                            System.out.println("Item is not found with id=" + id);
                        }
                    } else {
                        System.out.println("Items are not found");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Item id: ");
                    id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("error");
                    }
                    System.out.print("Item data: ");
                    data = sc.next();
                    System.out.print("Item isGood: ");
                    isGood = sc.nextBoolean();
                    System.out.print("Item description: ");
                    description = sc.next();
                    System.out.println("Item was added: " + item.addItem(new Item(id, data, isGood, description)));
                    break;
                }
                case 4: {
                    System.out.print("Enter item id: ");
                    int editId = sc.nextInt();
                    Item currItem = item.get(editId);
                    System.out.println(currItem);
                    System.out.print("Enter new item id: ");
                    id = sc.nextInt();
                    System.out.print("Enter new item data: ");
                    data = sc.next();
                    System.out.print("Is this item good: ");
                    isGood = sc.nextBoolean();
                    System.out.print("Enter new item description: ");
                    description = sc.next();
                    item.editItem(editId, new Item(id, data, isGood, description));
                    break;

                }
                case 5: {
                    System.out.print("Enter item id: ");
                    int deleteId = sc.nextInt();
                    if (item.get(deleteId) != null)
                        System.out.println("Item with id " + deleteId + " was deleted");
                    item.deleteItem(deleteId);
                    break;
                }
            }
            System.out.println("\nChoose further function: 1-get all, 2- get, 3- add item, 4- edit item, 5- delete item");
            function = sc.nextInt();
        }
        System.out.println("It's all");
    }
}
