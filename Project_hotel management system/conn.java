package hotel.management.system;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    
    //constructor
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","tejaal");
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
