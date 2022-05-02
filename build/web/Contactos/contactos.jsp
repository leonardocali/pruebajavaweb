<%-- 
    Document   : index
    Created on : 14/03/2022, 2:26:17 p. m.
    Author     : lherrera
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Agenda</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body id="body1">
        
        <input id="id" name="iduser" type="hidden" value="<c:out value="${iduser}"/>"/>
        <h1 text="center" style="text-align: center;">LISTA DE CONTACTOS</h1>
        <br>
        <div class="container2">
        <button id="nuevoConta" type="button" class="btn btn-warning"><a href="Agenda?accion=nuevo">Nuevo Registro</a></button>
        </div>
        <br>
        <div class="container2">
        <button id="salagenda" class="btn btn-warning"><a id="textA" href="Agenda?accion=salir">Salir de Agendas</a></button>
        </div>
        <br /><br />
        <table border="1" width="80%" class="table" text="center">
            <thead>
                <tr>
                    <th>ID_Contacto</th>
                    <th>Nombre</th>
                    <th>Teléfono</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contacto" items="${lista}">
                    
                    <tr>
                        <td><c:out value="${contacto.id}"/></td>
                        <td><c:out value="${contacto.nombre}"/></td>
                        <td><c:out value="${contacto.telefono}"/></td>
                        <td><a href="Agenda?accion=modificar&id=<c:out value="${contacto.id}"/>"><img src="img/editar.png"></a></td>
                        <td><a href="Agenda?accion=eliminar&id=<c:out value="${contacto.id}"/>"><img src="img/eliminar.png"></a></td>
                    </tr>
                </c:forEach>    
                 
            </tbody>
        </table>
        
    </body>
</html>
