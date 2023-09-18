
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField crdTxtFld;
    JPasswordField pinTxtFld;
    Login(){
        setTitle("ATM");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No.: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 400, 40);
        add(cardno);
        
        crdTxtFld = new JTextField();
        crdTxtFld.setBounds(300, 150, 230, 30);
        add(crdTxtFld);
        
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 230, 30);
        add(pin);
        
        pinTxtFld = new JPasswordField();
        pinTxtFld.setBounds(300, 220, 230, 30);
        add(pinTxtFld);
        
        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("Sign Up");
        signup.setBounds(300, 380, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.WHITE);
          
        
        setLocation(300, 200);
        setSize(720, 520);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            crdTxtFld.setText("");
            pinTxtFld.setText("");
        }
        else if(ae.getSource() == login){
            
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
     public static void main(String[] args) {
        // TODO code application logic here
        new Login();
    }

    private Object getContePane() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
