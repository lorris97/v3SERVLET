/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVLET;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
@WebServlet("/MyExampleSERVLET")
public class MyExampleSERVLET extends HttpServlet {
 public static final String VUE = "/MyExampleJSP.jsp";
 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
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
        
           ArrayList<String> liste = new ArrayList<String>();
        liste.add(request.getAuthType());
        liste.add(request.getContextPath());
        liste.add(request.getPathInfo());
        liste.add(request.getAuthType());
        liste.add(request.getLocalName());
        liste.add(request.getLocalAddr());
        liste.add(request.getQueryString());
        liste.add(request.getServerName());
        liste.add(request.getServletPath());
        liste.add(request.getPathTranslated());
        liste.add(request.getRequestURI());
        liste.add(request.getRemoteUser());
         request.setAttribute("liste", liste);
         
         this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }


}
