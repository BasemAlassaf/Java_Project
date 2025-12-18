import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ManagerGUI extends JFrame implements ActionListener {

    JButton add , edit , status;

    ManagerGUI(){
        this.setTitle("BLS Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(false);
        this.setLocation(330, 35);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x0396FF)); 

        add = new JButton("Add");
        edit = new JButton("Edit");
        status = new JButton("Status");

        this.add(add);
        this.add(edit);
        this.add(status);

        add.setFocusable(false);
        edit.setFocusable(false);
        status.setFocusable(false);
        add.setBounds(90, 350, 150, 75);
        edit.setBounds(290, 350, 150, 75);
        status.setBounds(490, 350, 150, 75);

        JLabel message = new JLabel("Welcome Manager");
    
        message.setBounds(0, 0,750, 300);
        message.setLayout(null);
        message.setVerticalAlignment(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setFont(new Font("MY Font", Font.PLAIN, 70));
        message.setForeground(new Color(0xEA5455));
        this.add(message);

        add.addActionListener(this);
        edit.addActionListener(this);
        status.addActionListener(this);        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){

        }
        if(e.getSource() == edit){
            
        }
        if(e.getSource() == status){

        }
    }
    
}
