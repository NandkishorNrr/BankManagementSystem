
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit, withdrow, fastcash, ministatement, pinchange, balanceinquiry, exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Please select your transection.");
        text.setBounds(210, 300, 700, 35);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.setFont(new Font("Raleway", Font.BOLD, 16));
        deposit.setForeground(Color.BLACK);
        deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrow = new JButton("Withdrow");
        withdrow.setBounds(355, 415, 150, 30);
        withdrow.setFont(new Font("Raleway", Font.BOLD, 16));
        withdrow.setForeground(Color.BLACK);
        withdrow.setBackground(Color.WHITE);
        withdrow.addActionListener(this);
        image.add(withdrow);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.setFont(new Font("Raleway", Font.BOLD, 16));
        fastcash.setForeground(Color.BLACK);
        fastcash.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.setFont(new Font("Raleway", Font.BOLD, 16));
        ministatement.setForeground(Color.BLACK);
        ministatement.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.setFont(new Font("Raleway", Font.BOLD, 16));
        pinchange.setForeground(Color.BLACK);
        pinchange.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceinquiry = new JButton("Balance Inquiry");
        balanceinquiry.setBounds(355, 485, 150, 30);
        balanceinquiry.setFont(new Font("Raleway", Font.BOLD, 16));
        balanceinquiry.setForeground(Color.BLACK);
        balanceinquiry.setBackground(Color.WHITE);
        balanceinquiry.addActionListener(this);
        image.add(balanceinquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.setFont(new Font("Raleway", Font.BOLD, 16));
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);        
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit)
            System.exit(0);
        else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrow){
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Transactions("");
    }
}
