import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginGUI extends JFrame implements ActionListener {

    JButton signIn,signUp;
    JTextField userEmail;
    JPasswordField password;

    LoginGUI(){
        this.setTitle("BLS Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(false);
        this.setLocation(330, 35);
        this.setLayout(null);
        this.setVisible(true);
        
        signIn = new JButton("Sign in");
        signUp = new JButton("Sign up");
        

        ImageIcon userIcon = new ImageIcon("pngs/User-Icon.png");
        ImageIcon passwordIcon = new ImageIcon("pngs/Password-Icon.png");

        userEmail = new JTextField("User Email");
        password  = new JPasswordField("User Password");

        JLabel userLabel = new JLabel();
        JLabel passwordLabel = new JLabel();
        JLabel titlelabel = new JLabel("BLS PROJECT");

        JPanel userPanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel buttonpanel = new JPanel();

        userPanel.setLayout(null);
        passwordPanel.setLayout(null);
        buttonpanel.setLayout(null);
        titlelabel.setLayout(new FlowLayout());

        this.add(userPanel);
        this.add(passwordPanel);
        this.add(buttonpanel);
        this.add(titlelabel);

        userPanel.add(userLabel);
        userPanel.add(userEmail);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);
        buttonpanel.add(signIn);
        buttonpanel.add(signUp);

        userLabel.setIcon(userIcon);
        passwordLabel.setIcon(passwordIcon);


        userLabel.setBounds(520, 140,50,50  );
        userEmail.setBounds(260, 150, 250, 25);
        userPanel.setBounds(0, 150, 750,200);


        passwordPanel.setBounds(0, 350, 750, 200);
        password.setBounds(260,40,250,25);
        passwordLabel.setBounds(520, 20, 50, 50);


        buttonpanel.setBounds(0, 550, 750, 200);
        signIn.setBounds(130, 10,210, 60);
        signUp.setBounds(400, 10, 210, 60);

        titlelabel.setBounds(0, 0, 750, 200);
        titlelabel.setVerticalTextPosition(JLabel.CENTER);
        titlelabel.setHorizontalAlignment(JLabel.CENTER);
        titlelabel.setFont(new Font("MY Font" , Font.PLAIN,70));
        titlelabel.setForeground(new Color(0xEA5455));

        userPanel.setBackground(new Color(0x0396FF));
        userPanel.setOpaque(true);
        passwordPanel.setBackground(new Color(0x0396FF));
        passwordPanel.setOpaque(true);
        buttonpanel.setBackground(new Color(0x0396FF));
        buttonpanel.setOpaque(true);
        titlelabel.setBackground(new Color(0x0396FF));
        titlelabel.setOpaque(true);

        signIn.addActionListener(this);
        signUp.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signIn ){
            switch (Factory.login(userEmail.getSelectedText(), password.getSelectedText())) {
                case null:
                    String [] respones ={"Try Again" , "Sign Up"};

                    int response = JOptionPane.showOptionDialog(null,
                    "There is no User with this infomation please try again", 
                    "Log in Warring",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE , 
                    null ,
                    respones ,
                    0);
                    
                    
                    if(response == 1){
                        new SignupGUI();
                    this.dispose();}
                    break;
                case Manager:
                    new ManagerGUI();
                case PRODUCTION_SUPERVISOR:
                    new SupervisorGUI();
                default:
                    break;
            }
        }
        if(e.getSource() == signUp){
            new SignupGUI();
            this.dispose();
        }
        
        
    }

    
    
}