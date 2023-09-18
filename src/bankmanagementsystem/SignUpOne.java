
package bankmanagementsystem;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame{
    
    SignUpOne(){
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000 + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Ppersonal Details... " );
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: " );
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        JTextField nameTxtFld = new JTextField();
        nameTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTxtFld.setBounds(300, 140, 400, 30);
        add(nameTxtFld);
        
        
        JLabel fName = new JLabel("Father's Name: " );
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        JTextField fNameTxtFld = new JTextField();
        fNameTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        fNameTxtFld.setBounds(300, 190, 400, 30);
        add(fNameTxtFld);
        
        JLabel dob = new JLabel("Date of birth: " );
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105, 105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: " );
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email: " );
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        JTextField emailTxtFld = new JTextField();
        emailTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTxtFld.setBounds(300, 340, 400, 30);
        add(emailTxtFld);
        
        
        JLabel merital = new JLabel("Merital status: " );
        merital.setFont(new Font("Raleway", Font.BOLD, 20));
        merital.setBounds(100, 390, 200, 30);
        add(merital);
        JRadioButton marrid = new JRadioButton("Marrid");
        marrid.setBounds(300, 390, 100, 30);
        marrid.setBackground(Color.WHITE);
        add(marrid);
        JRadioButton unmarrid = new JRadioButton("Unmarid");
        unmarrid.setBounds(450, 390, 100, 30);
        unmarrid.setBackground(Color.WHITE);
        add(unmarrid);
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(marrid);
        maritalgroup.add(unmarrid);
        
        
        JLabel address = new JLabel("Address: " );
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        JTextField addressTxtFld = new JTextField();
        addressTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTxtFld.setBounds(300, 440, 400, 30);
        add(addressTxtFld);
        
        
        JLabel city = new JLabel("City: " );
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        JTextField cityTxtFld = new JTextField();
        cityTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTxtFld.setBounds(300, 490, 400, 30);
        add(cityTxtFld);
        
        
        JLabel state = new JLabel("State: " );
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        JTextField stateTxtFld = new JTextField();
        stateTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTxtFld.setBounds(300, 540, 400, 30);
        add(stateTxtFld);
        
        
        JLabel pincodde = new JLabel("Pincode: " );
        pincodde.setFont(new Font("Raleway", Font.BOLD, 20));
        pincodde.setBounds(100, 590, 200, 30);
        add(pincodde);
        JTextField pincodeTxtFld = new JTextField();
        pincodeTxtFld.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTxtFld.setBounds(300, 590, 400, 30);
        add(pincodeTxtFld);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
       
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new SignUpOne();
    }
}
