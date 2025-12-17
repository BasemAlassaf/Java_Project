public class User {
    
    private String userName;
    private String passWord;
    private Role role;

    public User( String userName ,String passWord, Role role) {
        this.passWord=passWord;
        this.userName = userName;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }

    
    
   


}
