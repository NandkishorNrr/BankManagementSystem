
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FastCash extends JFrame implements ActionListener{
    JButton rs200, rs500, rs1000, rs2000, rs5000, rs10000, back;
    String pinnumber;
    
        FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select amount you want to withdraw.");
        text.setBounds(210, 300, 700, 35);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        rs200 = new JButton("Rs. 200");
        rs200.setBounds(170, 415, 150, 30);
        rs200.setFont(new Font("Raleway", Font.BOLD, 16));
        rs200.setForeground(Color.BLACK);
        rs200.setBackground(Color.WHITE);
        rs200.addActionListener(this);
        image.add(rs200);
        
        rs500 = new JButton("Rs. 500");
        rs500.setBounds(355, 415, 150, 30);
        rs500.setFont(new Font("Raleway", Font.BOLD, 16));
        rs500.setForeground(Color.BLACK);
        rs500.setBackground(Color.WHITE);
        rs500.addActionListener(this);
        image.add(rs500);
        
        rs1000 = new JButton("Rs. 1000");
        rs1000.setBounds(170, 450, 150, 30);
        rs1000.setFont(new Font("Raleway", Font.BOLD, 16));
        rs1000.setForeground(Color.BLACK);
        rs1000.setBackground(Color.WHITE);
        rs1000.addActionListener(this);
        image.add(rs1000);
        
        rs2000 = new JButton("Rs. 2000");
        rs2000.setBounds(355, 450, 150, 30);
        rs2000.setFont(new Font("Raleway", Font.BOLD, 16));
        rs2000.setForeground(Color.BLACK);
        rs2000.setBackground(Color.WHITE);
        rs2000.addActionListener(this);
        image.add(rs2000);
        
        rs5000 = new JButton("Rs. 5000");
        rs5000.setBounds(170, 485, 150, 30);
        rs5000.setFont(new Font("Raleway", Font.BOLD, 16));
        rs5000.setForeground(Color.BLACK);
        rs5000.setBackground(Color.WHITE);
        rs5000.addActionListener(this);
        image.add(rs5000);
        
        rs10000 = new JButton("Rs. 10000");
        rs10000.setBounds(355, 485, 150, 30);
        rs10000.setFont(new Font("Raleway", Font.BOLD, 16));
        rs10000.setForeground(Color.BLACK);
        rs10000.setBackground(Color.WHITE);
        rs10000.addActionListener(this);
        image.add(rs10000);
        
        back = new JButton("Back");
        back.setBounds(170, 520, 150, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 16));
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);        
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber);
        }else if(ae.getSource() == rs200){
            JOptionPane.showMessageDialog(null, "Rs. 200 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource() == rs500){
            JOptionPane.showMessageDialog(null, "Rs. 500 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource() == rs1000){
            JOptionPane.showMessageDialog(null, "Rs. 1000 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource() == rs2000){
            JOptionPane.showMessageDialog(null, "Rs. 2000 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource() == rs5000){
            JOptionPane.showMessageDialog(null, "Rs. 5000 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource() == rs1000){
            JOptionPane.showMessageDialog(null, "Rs. 1000 Withdraw successfuly");
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new FastCash("");
    }
}
