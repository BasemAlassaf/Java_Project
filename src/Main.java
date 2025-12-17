public class Main {
    public static void main(String[] args) {
       // new LoginGUI();
       
        Factory f = new Factory();
        f.register("Stevan", "8888", Role.Admain);

        f.login("Stevan", "8888", Role.Admain);

       System.out.println(f.toString());
    }
}
