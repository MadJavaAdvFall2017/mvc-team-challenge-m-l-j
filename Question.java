package java112.project3;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author  LMims
 */




public class Question extends Object {    
    private String answer;
    private String question;
    private String choiceOne;
    private String choiceTwo;
    private String choiceThree;
    private String id;
    private String guess;
    private int number;
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
	 * Returns the value of answer.
	 */
	public String getAnswer() {
		return answer;
	}


	/**
	 * Sets the value of answer.
	 * @param answer The value to assign answer.
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
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

String[] one = {"Squanto",
            "What is the name of the Native American who helped the Pilgrims",
            "Geronimo",
            "Sequoya" ,
            "Squanto"};
