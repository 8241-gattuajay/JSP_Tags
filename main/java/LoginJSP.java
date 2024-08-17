import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginJSP extends HttpServlet {
    private static final long serialVersionUID =1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");

        if(isLoggedIn == null){
            isLoggedIn=false;
        }
        request.setAttribute("isLoggedIn",isLoggedIn);
        request.getRequestDispatcher("welcome.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("username".equals(username)&&"password".equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("isLoggedIn",true);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("isLogggedIn",false);
        }
        response.sendRedirect("login");
    }
}