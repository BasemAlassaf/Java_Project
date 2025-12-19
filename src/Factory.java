
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

    // اضافة خط انتاج
    public static void addProuductLine(String lineNumber, String lineName, LineStatus status, Task task) {
        productLines.add(new ProductLine(lineName, lineNumber, LineStatus.Stopped, null));
    }

    // تعديل حالة خط الانتاج
    public static void editLineStatus(ProductLine line, LineStatus lineStatus) {
        if (line == null) {
            return;
        } else {
            line.getStatus() = lineStatus;
        }
    }

}