package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view")

public class ActionView extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse rep) {
        ActionModel model = (ActionModel) req.getAttribute("model");
        try(var writer = rep.getWriter()){
            writer.print("<html><body>");
            writer.write("Result is " + model.getResult());
            writer.print("</html></body>");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public ActionView() {
    }
}
