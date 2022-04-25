import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.getWriter().println("Hello World!");
        String name = req.getParameter("name");
        if (name == null){
          res.getWriter().println("Hello World");
        } else {
            res.getWriter().println("Hello " + name);
        }
    }

}
