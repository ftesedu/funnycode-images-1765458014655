package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "calculate", urlPatterns = {"/calculate"})
public class calculate extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1_raw = request.getParameter("num1");
        String num2_raw = request.getParameter("num2");
        String pheptinh = request.getParameter("pheptinh");
        
        try {
            double n1 = Double.parseDouble(num1_raw);
            double n2 = Double.parseDouble(num2_raw);
            double result = 0;
            String error = "";
            switch (pheptinh) {
                case "+":
                    result = n1 + n2;
                     request.setAttribute("result", result);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "-":
                    result = n1 - n2;
                     request.setAttribute("result", result);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "*":
                    result = n1 * n2;
                     request.setAttribute("result", result);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                case "/":
                    if (n2 != 0) {
                        result = n1 / n2;
                         request.setAttribute("result", result);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    } else {
                        error = "mẫu phải khác 0";
                        request.setAttribute("error", error);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                
            }
        } catch (Exception E) {
            String msg = "chỉ được nhập số !!";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
    }
    
}
