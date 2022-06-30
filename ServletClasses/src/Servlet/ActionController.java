package Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add")

public class ActionController extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int firstFromUser = Integer.parseInt(req.getParameter("num1"));
        int secondFromUser = Integer.parseInt(req.getParameter("num2"));
        ActionModel model = new ActionModel(firstFromUser, secondFromUser);
        req.setAttribute("model", model);
        ServletContext context = getServletContext();
        var dispatcher = context.getRequestDispatcher("/view");
        dispatcher.forward(req,res);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        doPost(req, res);
    }

    public ActionController() {
    }
}
