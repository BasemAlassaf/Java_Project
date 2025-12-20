
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SupervisorGUI extends JFrame implements ActionListener {

    JButton storageManagement, productLineManagement;

    SupervisorGUI() {
        this.setTitle("BLS Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(false);
        this.setLocation(330, 35);
        this.setLayout(null);
        this.setVisible(true);

        JLabel mainlabel = new JLabel("Welcome Supervisor");
        this.add(mainlabel);

        storageManagement = new JButton("Storage Management");
        productLineManagement = new JButton("Product Line Management");

        mainlabel.setBounds(0, 0, 750, 750);
        mainlabel.setBackground(new Color(0x0396FF));
        mainlabel.setOpaque(true);

        mainlabel.add(storageManagement);
        mainlabel.add(productLineManagement);

        mainlabel.setVerticalAlignment(JLabel.TOP);;
        mainlabel.setHorizontalAlignment(JLabel.CENTER);
        mainlabel.setFont(new Font("My Font", Font.PLAIN, 70));
        mainlabel.setForeground(new Color(0xEA5455));

        storageManagement.setBounds(120, 340, 200, 80);
        productLineManagement.setBounds(420, 340, 200, 80);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
