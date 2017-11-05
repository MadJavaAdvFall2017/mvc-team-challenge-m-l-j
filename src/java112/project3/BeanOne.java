package java112.project3;
import java.io.Serializable;
import java.util.*;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    midavis
 */
public class BeanOne extends Object implements Serializable {

    private  String  question;
    private  String  answer;
    private Map<String, String> questions = new HashMap<String, String>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Map<String, String> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<String, String> questions) {
        this.questions = questions;
    }

    /**
     *  Constructor for the BeanOne object

     */
    public BeanOne() {
        question = "default value";
        answer = "default value";
        questions.put("default value", "default value");
    }

}
