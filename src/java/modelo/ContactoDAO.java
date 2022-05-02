package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import config.Conexion;
import controlador.UsuarioCon;

public class ContactoDAO {
    
    Connection conect;
    PreparedStatement ps;
    ResultSet rs;
    
    public ContactoDAO(){
        Conexion con = new Conexion();
        conect = con.getConexion();
    }
           
    public List<Contacto> listarContactos(){
    
        
        List<Contacto> lista = new ArrayList<>();
        
        
        try{ 
           
            ps = conect.prepareStatement("select id,nombre,telefono from agenda where id_usuario = ? order by 1");
            //System.out.println("Dentro de ContactoDAO validando conexion");
          ps.setInt(1, UsuarioCon.ID);
          rs = ps.executeQuery();
          //int count = 1;
          while(rs.next()){
              int id = rs.getInt(1);
              String nombre = rs.getString(2);
              String telefono = rs.getString(3);
              Contacto contacto = new Contacto(id,nombre,telefono);
              lista.add(contacto);
              
          }
          
          return lista;
          
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
    public Contacto mostrarContacto(int id){
    
        
        Contacto contacto = null;
        
        try{
          
          ps = conect.prepareStatement("select id,nombre,telefono from agenda where id =?");
          ps.setInt(1, id);
          rs = ps.executeQuery();
          
          while(rs.next()){
              int idu = rs.getInt(1);
              String nombre = rs.getString(2);
              String telefono = rs.getString(3);
              
              contacto = new Contacto(idu,nombre,telefono);
              
          }
          
          return contacto;
          
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
  
    public boolean registrarContacto(Contacto contacto){
    
        
        
        try{
            
            
            ps = conect.prepareStatement("insert into agenda (id_usuario,nombre,telefono) values (?,?,?)");
            ps.setInt(1,contacto.getId());
            ps.setString(2,contacto.getNombre());
            ps.setString(3,contacto.getTelefono());
            
            ps.execute();
            
          return true;
          
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }

    public boolean modificarContacto(Contacto contacto){
    
                      
        
        try{
          
          ps = conect.prepareStatement("update agenda set nombre=?,telefono=? where id=?");
          ps.setString(1,contacto.getNombre());
          ps.setString(2,contacto.getTelefono());
          ps.setInt(3,contacto.getId());
          ps.execute();
          
          return true;
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
    
    public boolean eliminarContacto(int _id){
    
                       
        
        try{
            
          ps = conect.prepareStatement("delete from agenda where id=?");
          ps.setInt(1,_id);
          ps.execute();
          
          return true;
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
    
    public boolean actualizarContacto(Contacto contacto){
    
        try{
          
          ps = conect.prepareStatement("update agenda set nombre=?,telefono=? where id=?");
          
          ps.setString(1,contacto.getNombre());
            System.out.println("Nombre: " + contacto.getNombre());
          ps.setString(2,contacto.getTelefono());
            System.out.println("Telefono: " + contacto.getTelefono());
          ps.setInt(3,contacto.getId());
            System.out.println("ID: " + contacto.getId());
          ps.execute();
            //System.out.println("Estoy antes del true de actualizarContacto");
          return true;
          
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }

        
}
