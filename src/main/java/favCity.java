import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favCity")
public class favCity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Enter Favorite City</h1>");
        String html = "<form method='POST'>";
        html += "<label>City</label>";
        html+= "<input name='place' id='place' placeholder='enter search term'>";
        html+= "<br>";
        html += "<button>Submit</button>";
        html += "</form>";
        resp.getWriter().println(html);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String City = req.getParameter("place");
        System.out.println(City);
        resp.sendRedirect("/favCity/favCityResults?place="+City);
    }
}
//@Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    // in line 14 this we are going to make a form for the user to interact with
//    resp.getWriter().println("<h1>Hello World</h1>");
//    String html = "<form method='POST'>";
//    html += "<label>Search</label>";
//    html+= "<input name='search' id='search' placeholder='enter search term'>";
//    html+= "<br>";
//    html += "<button>Search</button>";
//    html += "</form>";
//    resp.getWriter().println(html);
//}
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String searchTerm = req.getParameter("search");
//        System.out.println(searchTerm);
//        //redirect user to search result servlet
//        resp.sendRedirect("/search/results?search="+searchTerm);
//    }
//
//}