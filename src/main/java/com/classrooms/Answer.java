package com.classrooms;



public class Answer {

	private  String answer;//multiple choice
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answer [answer=" + answer + ", getAnswer()=" + getAnswer()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
