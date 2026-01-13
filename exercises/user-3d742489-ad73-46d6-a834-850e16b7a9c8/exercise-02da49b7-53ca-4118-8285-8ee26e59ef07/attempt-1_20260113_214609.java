/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "MainController", urlPatterns = {"/process"})
public class MainController extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String txtUsername = request.getParameter("txtUsername");
            String txtPassword = request.getParameter("txtPassword");
            if(txtUsername.equalsIgnoreCase("admin")
                && txtPassword.equals("123")){
                 request.getRequestDispatcher("a.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("b.jsp").forward(request, response);
            }
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
