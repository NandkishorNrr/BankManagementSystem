
package bankmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
//    long random;
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, income, education, category, occupation;
    String formno;
    
    
    SignUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE - 2");
        
        JLabel addtionalDetails = new JLabel("Page 2: Aditional Details " );
        addtionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        addtionalDetails.setBounds(290, 80, 400, 30);
        add(addtionalDetails);
        
        JLabel name = new JLabel("Relingion: " );
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 150, 30);
        add(name);
        
        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Isai"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);       
        
        
        
        JLabel fName = new JLabel("Category: " );
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        
        String[] valCategory = {"General", "OBC", "SC", "ST", "OTHER"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300, 190, 400, 30);
        add(category);
        
        JLabel dob = new JLabel("Income: " );
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        String[] incomeCategory = {"null", "<1,50,000", "2,50,000", "5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300, 240, 400, 30);
        add(income);
        
        JLabel gender = new JLabel("Educational: " );
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        JLabel email = new JLabel("Qualification: " );
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        
        String[] educationValue = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        education = new JComboBox(educationValue);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 290, 400, 30);
        add(education);        
        
        JLabel merital = new JLabel("Occupation: " );
        merital.setFont(new Font("Raleway", Font.BOLD, 20));
        merital.setBounds(100, 390, 200, 30);
        add(merital);
        
        String[] occupationValue = {"Saleried", "Self Employee", "Business", "Student", "Other"};
        occupation = new JComboBox(occupationValue);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300, 390, 400, 30);
        add(occupation);        
        
        JLabel address = new JLabel("PAN no.     : " );
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel city = new JLabel("Aadhar no.: " );
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        
        JLabel state = new JLabel("Senior citize: " );
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup Smaritalgroup = new ButtonGroup();
        Smaritalgroup.add(syes);
        Smaritalgroup.add(sno);
        
        
        JLabel pincodde = new JLabel("Existing Account: " );
        pincodde.setFont(new Font("Raleway", Font.BOLD, 20));
        pincodde.setBounds(100, 590, 200, 30);
        add(pincodde);
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
       
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
            seniorcitizen = "Yes";
        else
            seniorcitizen = "No";
        String existingaccount = null;
        if(eyes.isSelected())
            existingaccount = "Yes";
        else if(eno.isSelected())
            existingaccount = "No";
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo VALUES('"+formno+"', '"+sreligion+"', '"+scategory+"', '" +sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            
        } catch(Exception e) {
            System.out.print(e);
        }
    }
    public static void main(String[] args){
        new SignUpTwo("");
    }
}
