/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Luis
 */
@WebServlet(name = "Modificar", urlPatterns = {"/Modificar"})
public class Modificar extends HttpServlet {

     @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21298/WS-Integrador/WSIntegrador.wsdl")
    private WSIntegrador_Service service;
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
           String id= request.getParameter("id");
        List<Cliente> listita= new ArrayList<>();
        
         try {
             listita=buscarCliente(id);
         } catch (UnknownHostException_Exception ex) {
             Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
         }
       
         
            for(Cliente cli:listita){
                System.out.println(cli.getDireccion());
                System.out.println(cli.getNombre());
                System.out.println(cli.getNumSumi());
                System.out.println(cli.getPassword());
                System.out.println(cli.getUsuario());
            }
        
        
          HttpSession ses= request.getSession(true);         
                
         ses.setAttribute("lista", listita);        
        
         
         String pag = "/modificarCliente.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(pag);
        rd.forward(request, response);
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
   private List<Cliente> buscarCliente(String numSumi) throws UnknownHostException_Exception{
        
        servlets.WSIntegrador port= service.getWSIntegradorPort();
        return port.buscarCliente(numSumi);
    }
}
