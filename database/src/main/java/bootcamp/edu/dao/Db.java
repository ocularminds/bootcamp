package bootcamp.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

    final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/bootcamp"; 
    final String username = "root"; 
    final String password = "bonus@1234";

    public Connection connect(){
        Connection connection = null;
        try{
            //Register the driver
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database bootcamp");
        } catch(Exception exception){
           System.out.println("Unable to to connect to database deu to the following reasons:");
           exception.printStackTrace();
        }
        return connection;

    }

    public void disconnect(final Connection connection){
       try{
          if(connection != null) connection.close();
       }catch(Exception ex){
        System.out.println("Unable to close connection");
        ex.printStackTrace();
       }
    }
    
}
