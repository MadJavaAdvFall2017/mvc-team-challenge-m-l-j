package java112.project3;
import java.io.Serializable;
import java.util.*;
/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author  LMims
 */

public class Question extends Object implements Serializable {
    private int number;
    private String solution;
    private String question;
    private String choiceOne;
    private String choiceTwo;
    private String choiceThree;
    private String id;
    private String guess;


    public Question() {
        number =  0;
        solution =  "default";
        question =  "default";
        choiceOne =  "default";
        choiceTwo =  "default";
        choiceThree =  "default";
        id =  "mysterious";
        guess =  "default";

    }



	/**
	 * Returns the value of number.
	 */
	public int getNumber() {
		return number;
	}


	/**
	 * Sets the value of number.
	 * @param number The value to assign number.
	 */
	public void setNumber(int number) {
		this.number = number;
	}


	/**
	 * Returns the value of solution.
	 */
	public String getSolution() {
		return solution;
	}


	/**
	 * Sets the value of Solution.
	 * @param solution The value to assign answer.
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}


	/**
	 * Returns the value of question.
	 */
	public String getQuestion() {
		return question;
	}


	/**
	 * Sets the value of question.
	 * @param question The value to assign question.
	 */
	public void setQuestion(String question) {
		this.question = question;
	}


	/**
	 * Returns the value of choiceOne.
	 */
	public String getChoiceOne() {
		return choiceOne;
	}


	/**
	 * Sets the value of choiceOne.
	 * @param choiceOne The value to assign choiceOne.
	 */
	public void setChoiceOne(String choiceOne) {
		this.choiceOne = choiceOne;
	}


	/**
	 * Returns the value of choiceTwo.
	 */
	public String getChoiceTwo() {
		return choiceTwo;
	}


	/**
	 * Sets the value of choiceTwo.
	 * @param choiceTwo The value to assign choiceTwo.
	 */
	public void setChoiceTwo(String choiceTwo) {
		this.choiceTwo = choiceTwo;
	}


	/**
	 * Returns the value of choiceThree.
	 */
	public String getChoiceThree() {
		return choiceThree;
	}


	/**
	 * Sets the value of choiceThree.
	 * @param choiceThree The value to assign choiceThree.
	 */
	public void setChoiceThree(String choiceThree) {
		this.choiceThree = choiceThree;
	}


	/**
	 * Returns the value of id.
	 */
	public String getId() {
		return id;
	}


	/**
	 * Sets the value of id.
	 * @param id The value to assign id.
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * Returns the value of guess.
	 */
	public String getGuess() {
		return guess;
	}


	/**
	 * Sets the value of guess.
	 * @param guess The value to assign guess.
	 */
	public void setGuess(String guess) {
		this.guess = guess;
	}

}
