
import java.util.ArrayList;
import java.util.List;

public class Factory {

    static List<User> users = new ArrayList<>();
    static List<ProductLine> productLines = new ArrayList<>();
    private static LineStatus status;

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
            if (user.getUserName().equals(userName) && user.getpassword().equals(password))
                return user;
        }
        System.out.println("True");

        return null;
    }

    //Add product line
    public static void addProuductLine(ProductLine line) {
        productLines.add(line);
    }

    // Edit product line status
    public static boolean  editLineStatu(String lineName , LineStatus newStatus) {
        for(ProductLine line : productLines){
            if(line.getLineName().equalsIgnoreCase(lineName)){
                line.setStatus(newStatus);
                return true;
            }  
        }
        return false;
    }

}