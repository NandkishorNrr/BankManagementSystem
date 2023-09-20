
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignUpThree extends JFrame implements ActionListener{
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submmit, cancel;
    String formno;
    public SignUpThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1); 
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Ralwaye", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 40);
        add(type);
        
        r1 = new JRadioButton("Saving Account:");
        r1.setFont(new Font("Ralwaye", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180,150, 20);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Ralwaye", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180,250, 20);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Ralwaye", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220,250, 20);
        add(r3);
        r4 = new JRadioButton("Reccurring Deposit Account2");
        r4.setFont(new Font("Ralwaye", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220,250, 20);
        add(r4);
        ButtonGroup groupbutton = new ButtonGroup();
        groupbutton.add(r1);
        groupbutton.add(r2);
        groupbutton.add(r3);
        groupbutton.add(r4);
        
        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Ralwaye", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 40);
        add(card);
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4554");
        number.setFont(new Font("Ralwaye", Font.BOLD, 22));
        number.setBounds(300, 300, 300, 40);
        add(number);
        JLabel carddtails = new JLabel("(Your card details)");
        carddtails.setFont(new Font("Ralwaye", Font.BOLD, 12));
        carddtails.setBounds(100, 330, 300, 40);
        add(carddtails);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Ralwaye", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 40);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Ralwaye", Font.BOLD, 22));
        pnumber.setBounds(300, 370, 300, 40);
        add(pnumber);
        JLabel pindetails = new JLabel("(Your 4 digits Password)");
        pindetails.setFont(new Font("Ralwaye", Font.BOLD, 12));
        pindetails.setBounds(100, 400, 300, 20);
        add(pindetails);
        
        JLabel Services = new JLabel("Services reqired: ");
        Services.setFont(new Font("Ralwaye", Font.BOLD, 22));
        Services.setBounds(100, 450, 200, 40);
        add(Services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(340, 500, 200, 30);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);  
        c4 = new JCheckBox("Email & SMS alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(340, 550, 200, 30);
        add(c4); 
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);  
        c6 = new JCheckBox("E-Stetment");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(340, 600, 200, 30);
        add(c6);  
        c7 = new JCheckBox("I here declare that the above details are correct to best of knowleg.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        c7.setBounds(100, 680, 510, 30);
        add(c7);
        
        submmit = new JButton("Submmit");
        submmit.setFont(new Font("Relwaye", Font.BOLD, 20));
        submmit.setBackground(Color.BLACK);
        submmit.setForeground(Color.WHITE);
        submmit.setBounds(220, 730, 150, 40);
        submmit.addActionListener(this);
        add(submmit);
                
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Relwaye", Font.BOLD, 20));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420, 730, 150, 40);
        cancel.addActionListener(this);
        add(cancel);
        
        
        setSize(850, 820);
        setLocation(350, 0);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submmit){
            String accountType = null;
            if(r1.isSelected())
                accountType = "Saving Account";
            else if(r2.isSelected())
                accountType = "Fixed Deposit";
            else if(r3.isSelected())
                accountType = "Current Account";
            else if(r4.isSelected())
                accountType = "Reccurring Deposit Account";
            
            Random random = new Random();
            String cardnumber = ""  + Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L ) + 1000L);
            
            String facility = "";
            if(c1.isSelected())
                facility += "ATM Card";
            if(c2.isSelected())
                facility += " Internet Banking";
            if(c3.isSelected())
                facility += " Mobile Banking";
            if (c4.isSelected())
                facility += "Email & SMS Alert";
            if(c5.isSelected())
                facility += "Cheque Book";
            if(c6.isSelected())
                facility += "E-Stetment";
            
            try{
                if(accountType == "")
                    JOptionPane.showMessageDialog(null, "Account Typoe is Reqired");
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    conn.s.execute(query1);
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.execute(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card No.: " + cardnumber + "\nPin: " + pinnumber);
                }
            }
            catch(Exception e){
                System.out.print(e);
            }
        } 
        else if(ae.getSource() == cancel){
            
        }
    }
    public static void main(String[] args){
        new SignUpThree("");
    }
}
