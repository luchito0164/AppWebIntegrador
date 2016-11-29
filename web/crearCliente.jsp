<%-- 
    Document   : crearCliente
    Created on : 23/11/2016, 11:57:16 AM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Cliente</title>
    </head>
    <body>
        <label>
            Crear Cliente          
        </label>
        <br>
         <form action="Mantener" method="POST">
             <br>
             
             
         <label>Numero de Suministro:</label> 
        
    <input type="text" id="numero"  name="numero" value="" /> 
    <br>
     <label>Nombre:</label> 
        
    <input type="text" id="nombre"  name="nombre" value="" /> 
    <br>
    <label>Direccion:</label> 
        
    <input type="text" id="direccion"  name="direccion" value="" /> 
    <br>
     <br>
    <br>
    <input type="submit" value="Guardar" />
         </form>
    </body>
</html>
