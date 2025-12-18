
import java.util.ArrayList;
public class Factory {
 
    
    static ArrayList<User>users = new ArrayList<>();
 
    //  register method 
    public static boolean register(String userName , String password ,Role role ){
 
        for (User user : users) {
           if(user.getUserName().equals(userName)){
        return false;
        }
    }
    users.add(new User(userName, password, role));
    return true;
    }

    // Login method
    public static Role login(String userName, String password){
        for (User  user : users) {
        if(user.getUserName().equals(userName) && user.getpassword().equals(password))    
            return user.getRole();
        }

        return null;
    }

}