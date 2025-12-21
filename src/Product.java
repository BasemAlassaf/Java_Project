
import java.util.HashMap;

public class Product {

    private String idProduct;
    private String productName;
    private ProductLine productLine;
    private HashMap<Item, Integer> item = new HashMap<>();

    public Product(String idProduct, String productName) {
        this.idProduct = idProduct;
        this.productName = productName;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public HashMap<Item, Integer> getItem() {
        return item;
    }

    public void setItem(HashMap<Item, Integer> item) {
        this.item = item;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

}
