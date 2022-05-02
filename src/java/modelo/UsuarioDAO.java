package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import config.Conexion;


public class UsuarioDAO {
    
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;
    //public int ID;
    
    public UsuarioDAO(){
    
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public int validar(Usuario user) {
        
        int cont = 0;
        
        
        String sql = "select * from usuarios where user=? and passw=?";
        
        try{
         ps = conexion.prepareStatement(sql);
         ps.setString(1, user.getNombre());
         ps.setString(2, user.getClave());
         rs = ps.executeQuery();
         
         while(rs.next()){
             cont = cont+1;
             user.setId(rs.getInt("id"));
             user.setNombre(rs.getString("user"));
             user.setClave(rs.getString("passw"));
             //System.out.println("Desde usuarioDAO " + rs.getInt("id"));
             //System.out.println("Desde usuarioDAO " + rs.getString("user"));
             //System.out.println("Desde usuarioDAO " + rs.getString("passw"));
             //ID=rs.getInt("id");
         }
         if (cont==1){
             //System.out.println("Estoy en el if del USUARIODAO");
             
             return 1;
             
         }else{
          return 0;
         }
        } 
        catch(SQLException e){
            return 0;
        }
        
    }
    
     public int obteberID(String u, String p){
    
        int ID =0;      
        
        try{
          
          ps = conexion.prepareStatement("select id,user,passw from usuarios where user=? and passw=?");
          ps.setString(1, u);
          ps.setString(2, p);
          rs = ps.executeQuery();
          
          while(rs.next()){
              int idu = rs.getInt(1);

              ID = idu;
          }
          return ID;
          
        }
        catch(SQLException e){
            System.out.println(e.toString());
            return 0;
        }
        
    }
     
     public int registoUsuario(Usuario user){

         try{
            
            ps = conexion.prepareStatement("insert into usuarios (user,passw) values (?,?)");
            ps.setString(1,user.getNombre());
            ps.setString(2,user.getClave());
            
            ps.execute();
            conexion.close();
          return 1;
          
        }
        
        catch(SQLException e){
            System.out.println(e.toString());
            return 0;
        }
        
    }
}
