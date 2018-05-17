package com.classrooms;

import java.util.ArrayList;

public class Question {

	private String theQuestion="";
	
	public String getTheQuestion() {
		return theQuestion;
	}
	public void setTheQuestion(String theQuestion) {
		this.theQuestion = theQuestion;
	}

	private ArrayList<String> choices;//multiple choice
	private Answer answer;
	
	private Answer correctAnswer;
	
	public boolean isCorrectAnswer() {
		
		if(answer.getAnswer().equalsIgnoreCase(correctAnswer.getAnswer()))
		return true;
		else return false;
		
	}
	
	public Answer getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	private int questionId =this.hashCode();
	
	
	public int getQuestionId() {
		return questionId;
	}
	public Answer getAnswer() {
		return answer;
	}
    // one question has answer 
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public ArrayList<String> getChoices() {
		return choices;
	}

	public void setChoices(ArrayList<String> choices) {
		this.choices = choices;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [theQuestion=" + theQuestion + ", choices=" + choices
				+ ", answer=" + answer + ", correctAnswer=" + correctAnswer
				+ ", questionId=" + questionId + ", getTheQuestion()="
				+ getTheQuestion() + ", getCorrectAnswer()="
				+ getCorrectAnswer() + ", getQuestionId()=" + getQuestionId()
				+ ", getAnswer()=" + getAnswer() + ", getChoices()="
				+ getChoices() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
