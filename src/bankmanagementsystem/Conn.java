
package bankmanagementsystem;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Nrr@dev1ms");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
