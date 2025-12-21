
public class Item {

    private String idItem;
    private String itemName;
    private String category;
    private double price;
    private double quantity;
    private ItemStatus status;
    private double minimumQuantity = 100;

    public Item(String idItem, String itemName, double minimumQuantity, double price, double quantity) {
        this.idItem = idItem;
        this.itemName = itemName;
        this.minimumQuantity = minimumQuantity;
        this.price = price;
        this.quantity = quantity;
    }

    Item(String idItem, String itemName, double quantity, double minimumQuantity) {
        this.idItem = idItem;
        this.itemName = itemName;
        this.quantity = quantity;
        this.minimumQuantity = minimumQuantity;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getItemname() {
        return itemName;
    }

    public void setItemname(String itemname) {
        this.itemName = itemname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(double minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    //يتم تقليل المخزون والتأكد من وجود مادة خام كافية 
    public synchronized boolean reduceQuantity(int quantityRequest) {
        if (quantityRequest <= quantity) {
            quantity -= quantityRequest;
            return true;
        }
        return false;
    }

    //فحص الحد الادنى المسموح به للمادة الخام
    public boolean isBelowMinimum() {
        return quantity < minimumQuantity;
    }

}
