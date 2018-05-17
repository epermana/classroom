package com.classrooms;

import java.util.ArrayList;

public class Student {
  
	private  ArrayList<Quiz> quizzes;
	private int total_grade=0; //for calculating total_grade
	


public int getTotal_grade() {
		return total_grade;
	}

	public void setTotal_grade(int total_grade) {
		this.total_grade = total_grade;
	}

	//set answer to a Question in a Quiz may be  (Question, Answer)
	public void setAnswersToAquiz(Answer answer) {
		//loop quizzes , 
		
		
	}

	//get the assign Quiz FOR answering
	public ArrayList<Quiz> getAssignQuiz() {
		return quizzes;
	}

   //Teachers   can   assign   quizzes   to   students
	public void assignQuiz(ArrayList<Quiz> quizzes) {
		this.quizzes = quizzes;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void gradeQuiz(ArrayList<Quiz> quizzes) {
		// grade the quiz
		for (Quiz quiz:quizzes){
			 for(Question eachIndividualQuestion :quiz.getQuestions())
			 {
				 if(eachIndividualQuestion.isCorrectAnswer())//correct answer get grade
					 total_grade=total_grade+1;
			 }
		}
	}

	@Override
	public String toString() {
		return "Student [quizzes=" + quizzes + ", total_grade=" + total_grade
				+ ", getTotal_grade()=" + getTotal_grade() + ", getQuiz()="
				+ getAssignQuiz() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
}
