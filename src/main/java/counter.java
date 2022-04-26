import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class counter extends HttpServlet {
    public int num = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        num += 1;
        if (req.getParameter("reset") != null){
            num =1;
        }
        resp.getWriter().println("number of people that have seen this page: "+ num);
    }
}
