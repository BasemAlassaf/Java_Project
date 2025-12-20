
import java.util.ArrayList;
import java.util.List;

public class Factory {

    static List<User> users = new ArrayList<>();
    static List<ProductLine> productLines = new ArrayList<>();
    static List<Product> products = new ArrayList<>();
    static List<Item> items = new ArrayList<>();
    static List<Task> tasks = new ArrayList<>();

    // register method
    public static boolean register(String userName, String password, Role role) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }
        System.out.println("Done");
        users.add(new User(userName, password, role));
        return true;
    }

    // Login method
    public static User login(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getpassword().equals(password)) {
                return user;
            }
        }
        System.out.println("True");

        return null;
    }

    //Add product line
    public static void addProuductLine(ProductLine line) {
        productLines.add(line);
    }

    // Edit product line status
    public static void editLineStatu(String lineName, String lineNumber, LineStatus newStatus) {
        boolean containDigit = false;
        for (Character i : lineName.toCharArray()) {
            if (Character.isDigit(lineName.charAt(i))) {
                containDigit = true;
                break;
            }

        }
        if (containDigit) {
            for (ProductLine line : productLines) {
                if (line.getLineName().equalsIgnoreCase(lineName)) {
                    line.setStatus(newStatus);
                }

            }
        } else {
            for (ProductLine line : productLines) {
                if (line.getLineNumber().equalsIgnoreCase(lineNumber)) {
                    line.setStatus(newStatus);
                }
            }
        }
    }

    //Add product 
    public static void addProduct(Product product) {
        products.add(product);
    }

    //Show product
    public static void showProduct(Product product) {
        for (Product prod : products) {
            String prName = prod.getProductName();
            String prId = prod.getIdProduct();
        }
    }

    //Add Item 
    public static void addItem(Item item) {
        items.add(item);
    }

    //Show item
    public static void showItem(Item item) {
        for (Item ite : items) {
            String idItem = ite.getIdItem();
            String itemName = ite.getItemname();
            String category = ite.getCategory();
            double price = ite.getPrice();
            double quantity = ite.getQuantity();
        }
    }

    //Remove item
    public static void removeProduct(Item item) {
        products.remove(item);
    }

    //Add task
    public static void addTask(Task task) {
        tasks.add(task);
    }

    //Remove task
    public static void removetask(Task task) {
        tasks.remove(task);
    }

    //Show tasks releted to the product line
    public static void showTask(ProductLine line, Task task) {
        for (Task tas : tasks) {
            ProductLine assignedLine = tas.getAssignedLine();
        }
    }

    //Show tasks releted to the product
    public static void showTaskForProduct(Product product, Task task) {
        for (Task tas : tasks) {
            String produc = tas.getProductName();
        }
    }

    //filter task
    public static ArrayList<Task> filterTasks(ArrayList<Task> tasks, TaskStatus status) {
        ArrayList<Task> result = new ArrayList<>();
        if (tasks == null || status == null) {
            return result;
        }
        for (Task tas : tasks) {
            if (tas.getStatus() == status) {
                result.add(tas);
            }
        }
        return result;
    }

    //show product lines performed specific tasks
    public static ArrayList<ProductLine> showProductLinesThatPerformedTasks(ArrayList<ProductLine> lines, String tasksName, String productName) {
        ArrayList<ProductLine> result = new ArrayList<>();
        if (lines == null || tasksName == null || productName == null) {
            return result;
        }
        for (ProductLine line : productLines) {
            if (line.getTasks() == null) {
                continue;
            }

            for (Task tas : line.getTasks()) {
                if (tas.getTaskName().equalsIgnoreCase(tasksName) && tas.getProductName() != null && tas.getProductName().equalsIgnoreCase(productName)) {
                    result.add(line);
                    break;
                }
            }
        }
        return result;
    }
}
