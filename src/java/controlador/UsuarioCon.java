package controlador;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.UsuarioDAO;
import modelo.Usuario;
import modelo.Contacto;
import modelo.ContactoDAO;

@WebServlet(name = "UsuarioCon", urlPatterns = {"/Login"})

public class UsuarioCon extends HttpServlet {

   public static int ID;
   int r;
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String accion = request.getParameter("accion");
        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        ContactoDAO contactoDAO = new ContactoDAO();
        
        
        if (accion.equals("validar")){
            String u = request.getParameter("usuario");
            String p = request.getParameter("passw");
            System.out.println("Desde controlador " +u);
            System.out.println("Desde controlador " +p);
            usuario.setNombre(u);
            usuario.setClave(p);
            r = dao.validar(usuario);
            
            if (r==1){

                int id = dao.obteberID(u, p);
                int[] userList = new int[]{ id }; 
                ID = userList[0];
                RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
                List<Contacto> listarContactos = contactoDAO.listarContactos();
                request.setAttribute("lista", listarContactos);
                //request.setAttribute("iduser", ID);
                dis.forward(request, response);
            }
            else{
                RequestDispatcher dis = request.getRequestDispatcher("/index.jsp");
                String mensaje = "Verifica usuario y contraseña sean correctos";
                request.setAttribute("mensajeError", mensaje);
                dis.forward(request, response);
                //System.out.println("");

            }
        }else if(accion.equals("registroUser"))
                {
                    
                    System.out.println("Estoy en el else de registroUSer");
                    String u = request.getParameter("usuarioR");
                    String p = request.getParameter("passwR");
                    usuario.setNombre(u);
                    usuario.setClave(p);
                    r=dao.registoUsuario(usuario);
                    
                    if(r==1){
                        try {
                            Thread.sleep(4000);
                            request.getRequestDispatcher("index.jsp").forward(request, response);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(UsuarioCon.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
