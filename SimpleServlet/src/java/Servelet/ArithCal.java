/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author minho
 */
public class ArithCal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithCalculator.jsp")
                .forward(request,response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        
        request.setAttribute("firstName", firstname);
        request.setAttribute("lastName", lastname);
                
        if( firstname == null || firstname.equals("")
                || lastname == null || lastname.equals("")) {
            
            request.setAttribute("message", "Invalid Request");
            
            getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp")
                .forward(request, response);
            return;
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp")
                .forward(request, response);        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    * 
    * */

}