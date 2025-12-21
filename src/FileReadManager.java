
import java.io.*;
import java.util.*;

public class FileReadManager {

    public FileReadManager() {

    }

    public static List<Item> readItem(String filePath) {
        List<Item> items = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(("ProductandItem.csv"))))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(",");
                String idItem = data[0];
                String itemName = data[1];
                double quantity = Double.parseDouble(data[2]);
                double minimumQuantity = Double.parseDouble(data[3]);
                items.add(new Item(idItem, itemName, quantity, minimumQuantity));
            }
        } catch (IOException e) {
        }
        return items;
    }

    public static List<Product> readProduct(String filePath) {
        List<Product> Products = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("ProductandItem.csv")))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(",");
                String idProduct = data[0];
                String productName = data[1];
                Products.add(new Product(idProduct, productName));
            }
        } catch (IOException e) {
        }
        return Products;
    }

}
