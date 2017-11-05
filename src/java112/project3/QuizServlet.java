package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author LMims
 *
 */
@WebServlet(
    name = "QuizServlet",
    urlPatterns = {"/QuizServlet", "/quizservlet" }
)
public class QuizServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Question q1 = new Question();
        q1.setNumber(1);
        q1.setSolution("Squanto");
        q1.setQuestion("What is the name of the Native American known for helping the Pilgrims?");
        q1.setChoiceOne("Geronimo");
        q1.setChoiceTwo("Sequoya");
        q1.setChoiceThree("Squanto");
        q1.setId("one");
		request.setAttribute("question1", q1);

        Question q2 = new Question();
        q2.setNumber(2);
        q2.setSolution("Turkey");
        q2.setQuestion("What type of bird is usually served at Thanksgiving?");
        q2.setChoiceOne("Guinea Fowl");
        q2.setChoiceTwo("Turkey");
        q2.setChoiceThree("Squab");
        q2.setId("two");
		request.setAttribute("question2", q2);

		Question q3 = new Question();
        q3.setNumber(3);
        q3.setSolution("Squanto");
        q3.setQuestion("Where did the Pilgrims land in the New World?");
        q3.setChoiceOne("Rock Island");
        q3.setChoiceTwo("Third Rock");
        q3.setChoiceThree("Plymouth Rock");
        q3.setId("three");

		request.setAttribute("question3", q3);


        //request.setAttribute("myCoolBean", myBean);

        String url = "/quiz.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
