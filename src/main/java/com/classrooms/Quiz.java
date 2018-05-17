package com.classrooms;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {

	@Override
	public String toString() {
		return "Quiz [questions=" + questions + ", quizGrade=" + quizGrade
				+ ", getQuizGrade()=" + getQuizGrade() + ", getQuestions()="
				+ getQuestions() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private  ArrayList<Question> questions;//has questions
	
	
	
	private int quizGrade;
	
	public int getQuizGrade() {
		return quizGrade;
	}

	public void setQuizGrade(int quizGrade) {
		this.quizGrade = quizGrade;
	}

	

	public ArrayList<Question> getQuestions() {
		return questions;
	}
	
    //Teachers   can   create   multiple   quizzes   with   many   questions 
	public void createQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public Quiz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
