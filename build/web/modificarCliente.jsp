<%-- 
    Document   : modificarCliente
    Created on : 28/11/2016, 10:51:50 PM
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
       <h1 class="titulo">Cliente</h1>
       <HR width=100% align="left">
       <p></p>
       <br>
       <c:forEach var="pregunta" items="${sessionScope.lista}">
       <form action="GrabarModificacion?id=${pregunta.numSumi}" method="POST">
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
                         </tr>
                          
                    <tr>       
                            <td>
                                <input type="text" id="numSumi" name="numSumi" value="${pregunta.numSumi}" />       
                            </td>
                            <td>
                                <input type="text" id="nombre" name="nombre" value="${pregunta.nombre}" />     
                            </td>
                            <td>
                           <input type="text" id="direccion" name="direccion" value="${pregunta.direccion}" />         
                            </td>
                            
                            <td>
                           <input type="text" id="usuario" name="usuario" value="${pregunta.usuario}" />        
                            </td>
                            
                           <td>
                           <input type="text" id="password"  name="password" value="${pregunta.password}" />        
                           
                         
                           </td>
                            
                            
                            
                            
                            
                            
                        </tr>  
                       
                    
                     
                          
                          
                          </c:forEach>
                         </table>
                 
                 <br>
                 <input class="btn btn-info btn-xs active" type="submit" value="Grabar" />
          </div>
       </form>
    </body>
</html>
