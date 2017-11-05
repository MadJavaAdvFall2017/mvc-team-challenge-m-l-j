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
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int points = 0;
        int score = 0;

        String answer1 = replaceIfMissingOrDefault(answer1, "");
        String answer2 = replaceIfMissingOrDefault(answer2, "");
        String answer3 = replaceIfMissingOrDefault(answer3, "");

        q1.setGuess(answer1);
        q2.setGuess(answer2);
        q3.setGuess(answer3);


        if (q1.getAnswer() == q1.getGuess()) {
            points += 100;
        }

        if (q2.getAnswer() == q2.getGuess()) {
            points += 100;
        }

        if (q3.getAnswer() == q3.getGuess()) {
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
