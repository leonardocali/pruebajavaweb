<%-- 
    Document   : nuevo
    Created on : 14/03/2022, 2:26:39 p. m.
    Author     : lherrera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agenda_Nuevo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h2>CONTACTO NUEVO REGISTRO</h2>
        
        <br/>
        <div id="container3">
            <div class="item">
            <form action="Agenda?accion=insertar" method="POST" autocomplete="off">
                <p>
                    Nómbre:
                    <input type="text" name="nombre" id="nombre"/>
                </p>
                <p>
                    Teléfono:
                    <input type="text" name="telefono" id="telefono"/>
                </p>
                <br>
                <br>
                <button id="guardar" name="guardar" type="submit" type="button" class="btn btn-danger">Guardar</button>
            </form>
                <br>
                <br>
            <button id="ininuereg" type="button" class="btn btn-warning"><a href="Agenda?accion=regresar">Voler al inicio</a></button>
            </div>
        </div>
    </body>
</html>
