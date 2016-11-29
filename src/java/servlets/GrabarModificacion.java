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
@WebServlet(name = "GrabarModificacion", urlPatterns = {"/GrabarModificacion"})
public class GrabarModificacion extends HttpServlet {
     @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21298/WS-Integrador/WSIntegrador.wsdl")
    private WSIntegrador_Service service;
     
     boolean existe;
     boolean noCambio=false;

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
        response.setContentType("text/html;charset=UTF-8");
       
        
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
        String id=request.getParameter("id");
        String numSumi=request.getParameter("numSumi");
        String nombre=request.getParameter("nombre");
        String direccion=request.getParameter("direccion");
        String usuario=request.getParameter("usuario");
          String password=request.getParameter("password");
          
          
           Cliente cli= new Cliente();
          cli.setDireccion(direccion);
          cli.setNombre(nombre);
          cli.setNumSumi(numSumi);
          cli.setPassword(password);
          cli.setUsuario(usuario);
          
          noCambio=id.equals(numSumi);
          
         try {
             existe=verificarSuministro(numSumi);
         } catch (UnknownHostException_Exception ex) {
             Logger.getLogger(GrabarModificacion.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         if(existe==true &&  noCambio==false){
              response.sendRedirect("modificarCliente.jsp");
             
         }else{
             try {
             modificarCliente(id, cli);
         } catch (UnknownHostException_Exception ex) {
             Logger.getLogger(GrabarModificacion.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          
            response.sendRedirect("menuAdmin.jsp");
             
             
         }
         
          
          
          
         
        
        
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

      private void modificarCliente(String id,Cliente cliente) throws UnknownHostException_Exception{
        
        servlets.WSIntegrador port= service.getWSIntegradorPort();
        port.modificarCliente(id, cliente);
    }
      
          private boolean verificarSuministro(String numSumi) throws UnknownHostException_Exception{
        
        servlets.WSIntegrador port= service.getWSIntegradorPort();
       return port.verificarSuministro(numSumi);
    }
}
