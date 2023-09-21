
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ministatement extends JFrame implements ActionListener{
    JTextField amount;
    JButton ok, back;
    String pinnumber;
    
    public Ministatement(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Ministatemnt.");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setBounds(290, 300, 400, 20);
        image.add(text);
        
        JLabel loading = new JLabel("Loading...");
        loading.setForeground(Color.WHITE);
        loading.setFont(new Font("Raleway", Font.BOLD, 22));
        loading.setBounds(280, 380, 450, 40);
        image.add(loading);
        
//        amount = new JTextField();
//        setFont(new Font("Raleway", Font.BOLD, 16));
//        amount.setBounds(170, 350, 320, 25);
//        image.add(amount);
        
        ok = new JButton("OK");
        ok.setBounds(355, 485, 150, 30);
        ok.addActionListener(this);
        image.add(ok);
        
        back = new JButton("Back");
        back.setBounds(170, 485, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == ok){
            setVisible(false);
            new Login().setVisible(true);
        }
        else if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Ministatement("");
    }
}
