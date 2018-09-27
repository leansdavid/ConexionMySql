package conexion;

import java.sql.*;

import java.sql.DriverManager;
public class Conexion{
    public Connection conex;
    
    
     
    public  Connection conectar(){
    
        try{
        
           Class.forName("comm.mysql.idbc.Driver");
           conex = DriverManager.getConnection("jdbc:mysql://localhost/conexionmsql","root","");
           System.out.print("Conexion establecida");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return conex;
                
    }
}
