
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class connection { 
Connection conn = null;
    public static Connection dbcon(){
          try{
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");

System.out.printf("Connected");
return conn;
} catch(Exception e){
System.out.printf("khalad");
    return null;
}
    }
}