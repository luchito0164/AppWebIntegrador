<%-- 
    Document   : index
    Created on : 23/11/2016, 09:38:10 AM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="login-form" name="acceso" action="Login" method="POST" onsubmit="send_form(this);"> 
            
            
            
                              <%
                                String login_msg=(String)request.getAttribute("error");  
                                if(login_msg!=null)
                                out.println(login_msg);
               		    %>
                                 <br>
                                 <input class="form-control" type="text" name="usuario" placeholder="Usuario" />
            <br>
            <input class="form-control" type="password" name="contrasena" placeholder="Contraseña" /><br>
            
             <input  type="submit" value="Entrar" />  
            
        </form>
        
        
        
        
        
        
    </body>
</html>
