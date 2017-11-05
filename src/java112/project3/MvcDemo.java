package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 * @author midavis
 * class MvcDemo
 *
 */
@WebServlet(
    name = "mvc",
    urlPatterns = { "/mvc" }
)
public class MvcDemo extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BeanOne myBean = new BeanOne();
        Map<String, String> questions = new HashMap<String, String>();

        questions.put("What type of key cannot open a door?", "A turkey");
        questions.put("What did the turkey say to the computer?", "Google, Google, Google");
        questions.put("What is a turkey\'s favorite dessert?", "Peach gobbler");
        questions.put("Why did the turkey cross the road?", "It was Thanksgiving Day, and he wanted people to think he was a chicken!");
        questions.put("Why did the cranberries turn red?", "Because they saw the turkey dressing!");
        questions.put("Why do pilgrims\' pants always fall down?", "Because they wear their belt buckles on their hats!");
        questions.put("What do you get when you cross a turkey with a centipede?", " Drumsticks for everyone on Thanksgiving Day!");
        questions.put("What did the turkey say to the turkey hunter on Thanksgiving Day?", "Quack! Quack!");
        questions.put("Why did the farmer have to separate the chicken and the turkey?", "He sensed fowl play.");
        questions.put("What sound does a limping turkey make?", "Wobble, wobble!");
        questions.put("What kind of music did the Pilgrims listen to at the first Thanksgiving feast?", "Plymouth Rock!");
        questions.put("What\'s the difference between a pirate and a cranberry farmer?", "A pirate buries his treasure, but a cranberry farmer treasures his berries.");
        questions.put("Which November holiday is Dracula\'s favorite?", "Fangs-giving!");
        questions.put("If pilgrims were alive today, what would they be known for?", "Their age!");
        questions.put("What do you call a turkey on the day after Thanksgiving?", "Lucky.");
        questions.put("Can a turkey jump higher than the Empire State Building?", "Yes, of course! A building can\'t jump at all.");

        myBean.setQuestions(questions);

        Random       random    = new Random();
        List<String> keys      = new ArrayList<String>(myBean.getQuestions().keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        String       value     = myBean.getQuestions().get(randomKey);

        myBean.setQuestion(randomKey);
        myBean.setAnswer(value);

        request.setAttribute("myCoolBean", myBean);

        String url = "/index.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}
