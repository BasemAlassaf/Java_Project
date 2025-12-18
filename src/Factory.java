
import java.util.ArrayList;
import java.util.List;
public class Factory {
 
    
    static List <User> users = new ArrayList<>();

 
    //  register method 
    public static boolean register(String userName , String password ,Role role ){
        for (User user : users) {
           if(user.getUserName().equals(userName)){
        return false;
        }
    }
    System.out.println("Done");
    users.add(new User(userName, password, role));
    return true;
    }

    // Login method
    public static User login(String userName, String password){
        for (User  user : users) {
        if(user.getUserName().equals(userName) && user.getpassword().equals(password))    
            return user;
        }
              System.out.println("True");

        return null;
    }

}