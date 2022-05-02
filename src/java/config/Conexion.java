package config;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexion  {
    Connection conexion;
    
    public Connection getConexion() {
    
               
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonica","root","");
            //System.out.println("Conexion ok");
            return conexion;
        }
        catch(Exception e){
            
            System.out.println(e.toString());
            return null;
        }
       
    }

    
    
}
