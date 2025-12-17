
import java.util.ArrayList;
public class Factory {
 
    
    ArrayList<User>users = new ArrayList<>();
   //انشاء حساب جديد والتأكد من عدم الدخول مسبقا
    public boolean register(String userName , String passWord ,Role role ){
 
        for (User user : users) {
           if(user.getUserName().equals(userName)){
        return false;
        }
    }
    users.add(new User(userName, passWord, role));
    return true;
    }
    //تسجيل دخول
    public User login(String userName, String passWord, Role role){
        for (User  user : users) {
        if(user.getUserName().equals(userName) && user.getpassWord().equals(passWord))    
            return user;
        }

        return null;
    }

}