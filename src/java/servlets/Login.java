/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Luis
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21298/WS-Integrador/WSIntegrador.wsdl")
    private WSIntegrador_Service service;
    String tipo;
    boolean entrada;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
     
         if (entrada==true) {
            if(tipo.equalsIgnoreCase("administrador")){
                  response.sendRedirect("menuAdmin.jsp");
                  System.out.println("El usuario es administrador");
                
            }else{
                response.sendRedirect("index.jsp");
                 System.out.println("El usuario es cliente");
            }
        }else{
            
              response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    String usuario= request.getParameter("usuario");
        String password= request.getParameter("contrasena");
        
       
        try {
             tipo=encontrarTipo(usuario);
            entrada=verificarLogin(usuario,password,tipo);
            
        } catch (UnknownHostException_Exception ex) {
          System.out.println("Me cai en el login");
        }
        processRequest(request, response);
    }


       private boolean verificarLogin(String usuario, String password,String tipo) throws UnknownHostException_Exception{
        
        servlets.WSIntegrador port= service.getWSIntegradorPort();
        return port.verificarLogin(usuario, password, tipo);
    }
       
          private String encontrarTipo(String usuario) throws UnknownHostException_Exception{
        
        servlets.WSIntegrador port= service.getWSIntegradorPort();
        return port.encontrarTipo(usuario);
    }
    
    
}
