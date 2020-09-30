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
public class AgeCal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCaculator.jsp")
                .forward(request,response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String getAge = request.getParameter("age");
        
        if(getAge == null || getAge == "") {
            request.setAttribute("message", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCaculator.jsp")
                .forward(request, response);
            return;
        }
        
        int age = 0;
        try {
            age = Integer.parseInt(getAge);
            request.setAttribute("age", age);            
        } catch (NumberFormatException e) {
            request.setAttribute("message", "You must enter a number");
            
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCaculator.jsp")
                .forward(request, response);
            return;
        }
                
        String calAge = "";
        calAge = String.format("%d", age+1);
        
        request.setAttribute("message", "Your next age will be "+calAge);
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCaculator.jsp")
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
