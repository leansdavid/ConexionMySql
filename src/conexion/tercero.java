package conexion;

import java.sql.*;
import terceros.terceroPOA;


public class tercero extends terceroPOA{
     Conexion objConec = new Conexion();

    @Override
    public boolean insertartercero(String nombre, String apellido, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizartercero(int id, String nombre, String apellido, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminartercero(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultartercero(int id) {
        
          String resultado = "";
             try {
                 String sqlConsultar= "Select * from tercero where id="+id;
                 objConec.conectar();
                 Statement st = objConec.conex.createStatement();
                 ResultSet rs = st.executeQuery(sglConsultar);
                 while (rs.next()) {
                    resultado+=rs.getString(2)+"-"
                            +rs.getString(3)+"-"
                           + rs.getString(4);
                     
                 }
        } catch (Exception e) {
            System.out.print("Erro:"+e.getMessage());
        }
          return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
