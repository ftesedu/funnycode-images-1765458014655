package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/process"})
public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String s1 = request.getParameter("user");
    PrintWriter pw = response.getWriter();
    String s2 = request.getParameter("pass");
    if ("Admin".equals(s1) && "123".equals(s2)) {

      pw.print("Login sucessfully");
    } else {
      pw.print("Login Failed!!");
    }
  }

}
