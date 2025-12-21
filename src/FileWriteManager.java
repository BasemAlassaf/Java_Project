
import java.io.*;
import java.util.List;

public class FileWriteManager {

    public static void writeItem(String filePath, List<Item> items) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("ProductandItem.csv"))) {
            for (Item item : items) {
                pw.println(item.getIdItem() + "," + item.getItemname() + "," + item.getQuantity() + "," + item.getMinimumQuantity() + ",");
            }
        } catch (IOException e) {
        }
    }

    public static void writeProduct(String filePath, List<Product> products) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("ProductandItem.csv"))) {
            for (Product pro : products) {
                pw.println(pro.getIdProduct() + "," + pro.getProductName());
            }
        } catch (IOException e) {
        }
    }
}
