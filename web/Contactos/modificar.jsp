<%-- 
    Document   : modificar
    Created on : 14/03/2022, 2:26:48 p. m.
    Author     : lherrera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type">
        <title>Agenda_Modificar</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        
        <h2>CONTACTO MODIFICAR REGISTRO</h2>
        
        <br/>
        <div id="container4">
            <div class="item">
        <form action="Agenda?accion=actualizar" method="post" autocomplete="off">
            
            <input id="id" name="id" type="hidden" value="<c:out value="${contacto.id}"/>"/>
            <p>
                Nómbre:
                <input type="text" name="nombre" id="nombre" value="<c:out value="${contacto.nombre}"/>"/>
            </p>
            <br>
            <p>
                Teléfono:
                <input type="text" name="telefono" id="telefono" value="<c:out value="${contacto.telefono}"/>"/>
            </p>
            
            <br>
            <button id="guardar" name="guardar" type="submit" type="button" class="btn btn-danger">Actualizar</button>
        </form
        <br>
        <br>
        <br>
        <button id="iniguar" type="button" class="btn btn-warning"><a href="Agenda?accion=regresar">Voler al inicio</a></button>
            </div>
         </div>
    </body>
</html>
