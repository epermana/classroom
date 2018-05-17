/**
 * 
 */
package com.classrooms;

import java.util.ArrayList;

/**
 * @author edwin
 *
 */
public class Classroom {

	private ArrayList<Student> students;
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	private ArrayList<Teacher> teachers;
	
	/**
	 * 
	 */
	public Classroom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
