
package java112.demos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.demos.*;
import java.util.*;

/**
 *  Demo of using httpServletRequest and attributes
 *
 *@author  LMims
 */
@WebServlet(
    name = "attributeDemo",
    urlPatterns = { "/quiz", "/game" }
)
public class Game extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Treemap <Integer, Array> quiz = new TreeMap <String, Array>;
        int score = 0;
        // Answer, question, 3 choices
        String[] one = {"Squanto",
            "What is the name of the Native American who helped the Pilgrims",
            "Geronimo",
            "Sequoya" ,
            "Squanto"};

            quiz.put(1, one);


        String[] two = {"Turkey",
            "What bird native to the Americas is usually served at Thanksgiving",
            "Turkey",
            "Squab" ,
            "Guineafowl"};

            quiz.put(2, two);


            //more questions here

        //test here
        public void test () {

            while (this.quiz.hasNext()){

            request.setAttribute("QuestionNumber", "");
            request.setAttribute("Question", "");
            request.setAttribute("answer1", "");
            request.setAttribute("answer2", "");
            request.setAttribute("answer3", "");
            }

        }


        public void checkAnswer (String realAnswer) {
            if (request.getAttribute("answer") == realAnswer ){
            this.addPoints();
            }
        }

        public void addpoints() {
            this.score =+ 10;
        }

        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);



}


}
