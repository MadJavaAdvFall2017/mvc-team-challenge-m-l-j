package java112.project3;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
 
/**
 * @author Eric Knapp
 * class MvcDemo
 *
 */
@WebServlet(
    name = "MLJServlet", 
    urlPatterns = { "/mlj-servlet" }
)
public class MLJServlet extends HttpServlet {
 
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 

        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");

        BeanMLJ myBean = new BeanMLJ();
 
        myBean.setAnswer1(answer1);
        myBean.setAnswer2(answer2);

 
        request.setAttribute("myCoolBean", myBean);
 
        String url = "/mlj.jsp";
 
        RequestDispatcher dispatcher 
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
 
}