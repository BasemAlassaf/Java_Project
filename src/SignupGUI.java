
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupGUI extends JFrame implements ActionListener, MouseListener {

    JTextField userEmail;
    JPasswordField userPassword;
    JButton sumbit;
    JRadioButton manager, supervisor;

    SignupGUI() {
        this.setTitle("BLS Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(false);
        this.setLocation(330, 35);
        this.setLayout(null);
        this.setVisible(true);

        JPanel mainPanel = new JPanel();
        JLabel userIconLabel = new JLabel();
        JLabel passwordIconLabel = new JLabel();
        JLabel message = new JLabel("PLease Enter The Folowing informations");
        JLabel backLabel = new JLabel();

        ImageIcon userIcon = new ImageIcon("pngs/User-Icon.png");
        ImageIcon passwordIcon = new ImageIcon("pngs/Password-Icon.png");
        ImageIcon backButtonIcon = new ImageIcon("pngs/back-button.png");

        ButtonGroup radioGroup = new ButtonGroup();

        userEmail = new JTextField();
        userPassword = new JPasswordField();
        sumbit = new JButton("Sumbit");
        manager = new JRadioButton("Manager");
        supervisor = new JRadioButton("Supervisor");

        backLabel.setIcon(backButtonIcon);
        radioGroup.add(manager);
        radioGroup.add(supervisor);
        manager.setFocusable(false);
        supervisor.setFocusable(false);

        sumbit.addActionListener(this);
        backLabel.addMouseListener(this);

        mainPanel.setLayout(null);

        userIconLabel.setIcon(userIcon);
        passwordIconLabel.setIcon(passwordIcon);

        this.add(mainPanel);
        mainPanel.add(passwordIconLabel);
        mainPanel.add(userEmail);
        mainPanel.add(userIconLabel);
        mainPanel.add(userPassword);
        mainPanel.add(message);
        mainPanel.add(sumbit);
        mainPanel.add(manager);
        mainPanel.add(supervisor);
        mainPanel.add(backLabel);

        mainPanel.setBounds(0, 0, 750, 750);
        mainPanel.setBackground(new Color(0x0396FF));
        mainPanel.setOpaque(true);
        manager.setBackground(new Color(0x0396FF));
        manager.setFont(new Font("My Font", Font.PLAIN, 15));
        supervisor.setBackground(new Color(0x0396FF));
        supervisor.setFont(new Font("My Font", Font.PLAIN, 15));

        userEmail.setBounds(240, 250, 250, 25);
        userIconLabel.setBounds(520, 240, 50, 50);
        userPassword.setBounds(240, 350, 250, 25);
        passwordIconLabel.setBounds(520, 330, 50, 50);
        message.setBounds(0, 0, 750, 150);
        message.setFont(new Font("My Font", Font.PLAIN, 35));
        message.setForeground(new Color(0xEA5455));
        message.setVerticalTextPosition(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        sumbit.setBounds(400, 500, 160, 50);
        manager.setBounds(230, 400, 100, 20);
        supervisor.setBounds(400, 400, 100, 20);
        backLabel.setBounds(250, 500, 65, 65);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumbit) {
            String password = new String(userPassword.getPassword());
            if (userEmail.getText().isEmpty() || password.isEmpty() || (!manager.isSelected() && !supervisor.isSelected())) {
                JOptionPane.showMessageDialog(null, "Please Enter all information", "There are missid information", JOptionPane.WARNING_MESSAGE, null);
                return;
            }
            if (!userEmail.getText().contains("@")) {
                JOptionPane.showMessageDialog(null, "This email is invalid please check if contain: @", "invalid email", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (manager.isSelected()) {
                if (!Factory.register(userEmail.getText(), password, Role.Manager)) {
                    JOptionPane.showMessageDialog(null, "Sorry the email has been taken", "information error", JOptionPane.WARNING_MESSAGE, null);
                } else {
                    JOptionPane.showMessageDialog(null, "The Sign Up has compleated succesfuly", "succesful Sign Up", JOptionPane.WARNING_MESSAGE, null);
                    new LoginGUI();
                }
            } else {
                if (!Factory.register(userEmail.getText(), password, Role.PRODUCTION_SUPERVISOR)) {
                    JOptionPane.showMessageDialog(null, "Sorry the email has been taken", "information error", JOptionPane.WARNING_MESSAGE, null);
                } else {
                    JOptionPane.showMessageDialog(null, "The Sign Up has compleated succesfuly", "succesful Sign Up", JOptionPane.WARNING_MESSAGE, null);
                    new LoginGUI();
                }
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.dispose();
        new LoginGUI();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
