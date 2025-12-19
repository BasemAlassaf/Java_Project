import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class AddNewProductLineGUI extends JFrame implements ActionListener,MouseListener{

    JTextField productLineName, productLineNumber;
    JButton submit;

    AddNewProductLineGUI(){
        this.setTitle("BLS Project");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(false);
        this.setLocation(330, 35);
        this.setLayout(null);
        this.setVisible(true);
        

        JPanel panel = new JPanel();
        this.add(panel);
        
        productLineName= new JTextField();
        productLineNumber = new JTextField();
        submit = new JButton("Submit");

        JLabel nametext = new JLabel("New Product line name: ");
        JLabel numbertext = new JLabel("New Product line name: ");
        JLabel title = new JLabel("Add New Product Line");
        JLabel icon = new JLabel();

        ImageIcon backIcon = new ImageIcon("pngs/back-button.png");
        icon.setIcon(backIcon);

        panel.add(numbertext);
        panel.add(nametext);
        panel.add(productLineName);
        panel.add(productLineNumber);
        panel.add(title);
        panel.add(submit);
        panel.add(icon);
        panel.add(submit);

        panel.setBounds(0, 0, 750, 750);
        panel.setBackground(new Color(0x0396FF));
        panel.setOpaque(true);
        panel.setLayout(null);


        title.setBounds(0, 0, 750, 200);
        title.setBackground(new Color(0x0396FF));
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("My Name", Font.PLAIN, 65));
        
        nametext.setBounds(0, 200, 350,250);
        nametext.setBackground(new Color(0x0396FF));
        nametext.setOpaque(true);
        nametext.setVerticalAlignment(JLabel.CENTER);
        nametext.setHorizontalAlignment(JLabel.LEFT);
        nametext.setForeground(Color.white);
        nametext.setFont(new Font("My Font", Font.PLAIN, 30));

        productLineName.setBounds(360, 315, 200,30);

        numbertext.setBounds(0, 450, 350,100);
        numbertext.setBackground(new Color(0x0396FF));
        numbertext.setOpaque(true);
        numbertext.setVerticalAlignment(JLabel.TOP);
        numbertext.setHorizontalAlignment(JLabel.LEFT);
        numbertext.setForeground(Color.white);
        numbertext.setFont(new Font("My Font", Font.PLAIN, 30));
        
        productLineNumber.setBounds(360, 455, 200, 30);

        submit.setBounds(400, 550, 140, 50);
        submit.addActionListener(this);

        icon.setBounds(210, 550, 65, 65);
        icon.addMouseListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            if(productLineName.getText().isEmpty() || productLineNumber.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter all information", "There are missid information", JOptionPane.WARNING_MESSAGE, null);
                return;
            }
            
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        new ManagerGUI();
        this.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    
}