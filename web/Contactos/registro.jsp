<%-- 
    Document   : registro
    Created on : 7/04/2022, 8:17:50 a. m.
    Author     : lherrera
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Registro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="../estilos.css" rel="stylesheet" type="text/css">
        <link href="./estilos.css" rel="stylesheet" type="text/css">
        <script src="../js/js.js"></script>
        
        
    </head>
    <body id="body3">
        
        <h1 text="center" style="text-align: center;">REGISTRO USUARIOS</h1>
        <div class="container2">
            <div class="item">
            <form action="../Login?accion=registroUser" method="post" autocomplete="off" name="ingresar" id="fomulario" >

                
                <p>
                    Usuario:
                    <input type="text" name="usuarioR" id="usuario" required="required" />
                </p>
                <br>
                <p>
                    Contraseña:
                    <input name="passwR" id="passw" type="password" required="required"/>
                </p>
                <br>
                <br>
                <button id="registrar" name="accion" type="submit" class="btn btn-danger" siz="15" onclick="validarFormulario()">Registrar</button>
                
            </form>
            <br>
            
        <button id="registroUser" name="accion" type="button" class="btn btn-danger" siz="15"><a href="../index.jsp">Voler al Inicio</a></button>        
    <br>
    <br>
    
    <button type="input" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#miModal" id="btnModalabrir">
  Launch demo modal
</button>
    <div class="modal" tabindex="-1" id="miModal" data-bs-backdrop="static">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Registro Usuario</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" style="text-align:center">
        <p>Usuario registrado correctamente.</p>
                
      </div>
      <div class="modal-footer" >
        
        
      </div>
    </div>
  </div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
