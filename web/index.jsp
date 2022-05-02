<%-- 
    Document   : index
    Created on : 14/03/2022, 2:26:17 p. m.
    Author     : lherrera
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body id="body2">
        <h1 text="center" style="text-align: center;">SERVICIO DE AGENDA</h1>
        <br>
        
        <div class="container2">
            <div class="item">
            <form action="Login?accion=validar" method="post" autocomplete="off" name="ingresar" >

                <input id="id" name="id" type="hidden">
                <p>
                    Usuario:
                    <input type="text" name="usuario" id="usuario" required="required" />
                </p>
                <br>
                <p>
                    Contraseña:
                    <input name="passw" id="passw" type="password" required="required"/>
                </p>
                <br>
                <br>
                <button id="registrar" name="accion" type="submit" type="button" class="btn btn-danger" siz="15">Ingresar</button>
                <br><br>
                <button id="registroUser" name="accion" type="button" class="btn btn-danger" siz="15"><a href="Contactos/registro.jsp">Registrarse</a></button>
                
            </form
            
            <br>
            <br>
            
            </div>
        </div>    
        <div>
                <p id="perror" style="text-align: center">
                    <%
                        String resultado = (String)request.getAttribute("mensajeError");
                        String mensaje = "";
                        if (resultado !=null){
                            mensaje = resultado;
                        }
                    %>
                    <%=mensaje %>
                </p>
         </div>
    </body>
</html>
