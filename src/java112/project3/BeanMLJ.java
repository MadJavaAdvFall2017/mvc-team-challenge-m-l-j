package java112.project3;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    jeliceiri
 */
public class BeanMLJ extends Object {

    private  String  answer1;
    private  String  answer2;

    public static final String ANS1 = "turkey";
    public static final String ANS2 = "google,google,google";

    private Boolean ans1;
    private Boolean ans2;


    /**
     *  Constructor for the BeanMLJ object
     */
    public BeanMLJ() {
        answer1  = "default value";
        answer2  = "default value";

        ans1 = false; 
        ans2 = false;    
    }


    /**
     *  Gets the answer1 attribute of the BeanMLJ object
     *
     *@return    The answer1 value
     */
    public String getAnswer1() {
        return answer1;
    }
    public String getAnswer2() {
        return answer2;
    }
    public Boolean getAns1() {
        return ans1;
    }
    public Boolean getAns2() {
        return ans2;
    }
    public String getANS1() {
        return ANS1;
    }
    public String getANS2() {
        return ANS2;
    }


    /**
     *  Sets the answer attribute of the BeanMLJ object
     *
     *@param  answer1  The new answer1 value
     */
    public void setAnswer1(String answer1) {
        if (answer1.equals(ANS1)){
            ans1 = true; 
        }

        this.answer1 = answer1;
    }
    public void setAnswer2(String answer2) {
        if (answer2.equals(ANS2)){
            ans2 = true;        
        }

        this.answer2 = answer2;
    }


}
