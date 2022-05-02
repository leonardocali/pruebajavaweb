package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Contacto;
import modelo.ContactoDAO;



@WebServlet(name="ContaCon", urlPatterns = {"/Agenda"})

public class ContaCon extends HttpServlet{
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        ContactoDAO contactoDAO = new ContactoDAO();

        String accion;
        
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            dis.forward(request, response);
            
            dis.forward(request, response);
        } 
        else if("nuevo".equals(accion)){
            
            request.getRequestDispatcher("/Contactos/nuevo.jsp").forward(request, response);
            
        } 
        else if("insertar".equals(accion)){
            
            
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            int id = UsuarioCon.ID;
            System.out.println("Valor de variable global de usuariocon e: " +id);
            Contacto contacto = new Contacto(id,nombre, telefono);
            contactoDAO.registrarContacto(contacto);
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            request.getRequestDispatcher("/Contactos/contactos.jsp").forward(request, response);
        }   
        else if("modificar".equals(accion)){
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/modificar.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            Contacto contacto = contactoDAO.mostrarContacto(id);
            request.setAttribute("contacto", contacto);
            dis.forward(request, response);
        }
        else if("actualizar".equals(accion)){
            
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            Contacto contacto = new Contacto(id,nombre,telefono);
            contactoDAO.actualizarContacto(contacto);
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            dis.forward(request, response);
        }        
        else if("regresar".equals(accion)){
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            dis.forward(request, response);
        }
        else if("salir".equals(accion)){
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
        else if("eliminar".equals(accion)){
            int id = Integer.parseInt(request.getParameter("id"));
            contactoDAO.eliminarContacto(id);
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            dis.forward(request, response);
        }else{
                   
            RequestDispatcher dis = request.getRequestDispatcher("/Contactos/contactos.jsp");
            List<Contacto> listarContactos = contactoDAO.listarContactos();
            request.setAttribute("lista", listarContactos);
            dis.forward(request, response);
            
                    }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        doGet(request,response);
    }
}
