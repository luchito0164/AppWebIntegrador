<%-- 
    Document   : menuMantener
    Created on : 26/11/2016, 01:15:30 PM
    Author     : Luis
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Clientes Administrador</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
         <HR width=100% align="left">
         <p></p>
       <h1 class="titulo">Lista de Clientes</h1>
       <HR width=100% align="left">
       <p></p>
       <br>
    
        <form action="crearCliente.jsp" method="POST">
        
             <input type="submit" value="Crear Cliente" />
         
         </form>
       <br>
       <div id="table" style="width: 60%; float:left">
             <table class="table table-striped">
                 <tr style="color:#269abc; background-color: ">
                        <th>
                        #Suministro 
                        </th>
                        <th>
                            Cliente 
                        </th>
                        <th>
                            Direccion
                        </th>
                        
                        <th>
                            Usuario
                        </th>
                        <th>
                            Contraseña
                        </th>
                        
                         <th colspan="2">
                            Gestion
                        </th>
                        
                    </tr>
                  <c:forEach var="pregunta" items="${sessionScope.lista}">
                    <tr>       
                            <td>
                            ${pregunta.numSumi}   
                            </td>
                            <td>
                                ${pregunta.nombre}
                            </td>
                            <td>
                                ${pregunta.direccion}
                            </td>
                            
                            <td>
                                ${pregunta.usuario}
                            </td>
                            
                            <td>
                                ${pregunta.password}
                            </td>
                            
                            
                             <td>
                               
                                <a href="Modificar?id=${pregunta.numSumi}" class="btn btn-info btn-xs active" >Modificar</a>
                                <a href="EliminarClienteid=${pregunta.numSumi}" class="btn btn-info btn-xs active" >Eliminar</a>
                            </td>
                            
                            
                            
                        </tr>   </c:forEach>
                 
                 
                 
                 
                 
             </table>
             
             
             
         
             
         </div>
       
    </body>
</html>
