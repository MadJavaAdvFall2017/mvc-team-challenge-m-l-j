package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
/**
 * @author LMims
 *
 */
@WebServlet(
    name = "GradeServlet",
    urlPatterns = {"/GradeServlet", "/gradeservlet" }
)
public class GradeServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int points = 0;
        int score = 0;
        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");
        String answer3 = request.getParameter("answer3");

        String solution1 = request.getParameter("solution1");
        String solution2 = request.getParameter("solution2");
        String solution3 = request.getParameter("solution3");



        if (solution1 == answer1) {
            points += 100;
        }

        if (solution2 == answer2) {
            points += 100;
        }

        if (solution2 == answer3) {
            points += 100;
        }
        score = points / 300;


        request.setAttribute("score", score);




        //request.setAttribute("myCoolBean", myBean);

        String url = "/results.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


    /**
    * This init method logs time and the servlet name to log files
    *
    */


       public void init(){

       String now = new Date().toString();

       //log time
       System.out.print(now);
       System.out.println("Is time logging?" + now);
       log("Inside QuizServlet" + now);


}

}
