package com.classrooms;

import java.util.ArrayList;

public class Teacher {

	@Override
	public String toString() {
		return "Teacher [quizzes=" + quizzes + ", students=" + students
				+ ", getQuizzes()=" + getQuizzes() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	private  ArrayList<Quiz> quizzes;
	private  ArrayList<Student> students;
	
	public ArrayList<Quiz> getQuizzes() {
		return quizzes;
	}

	//Teachers   can   create   multiple   quizzes
	public void createQuizzes(ArrayList<Quiz> quiz) {
		this.quizzes = quiz;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	//Teachers   can   assign   quizzes   to   students
	public void assignQuizzes(ArrayList<Student> students) {
		for(Student student:students)
		{
			student.assignQuiz(quizzes);
		}
		
	}
	
	//Teachers   can   assign   quizzes   to   students
		public void gradeQuizzes(ArrayList<Student> students) {
			for(Student student:students)
			{
			 //grade quiz
				student.gradeQuiz(quizzes);
			}
			
		}
	
		public int calculateStudentTotalGrade(ArrayList<Student> students) {
			for(Student student:students)
			{
			 //grade quiz
				student.gradeQuiz(quizzes);
			}
			return 0;
			
		}

		
		
}
