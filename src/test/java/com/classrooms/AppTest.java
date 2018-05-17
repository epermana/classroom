package com.classrooms;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	  @Test
		public void testClassroom(){
			/**
			 * MAIN use case test
			 * 
Teacher method:
create quizes[]
            has -> questions[]
assign quizes to students
---------------
Students   solve/answer   questions   to   complete   the   quiz,   
               get assignned quizes[]
               answerquizes

Function By teacher:

1. Quizz quiz graded!
2. For   each   teacher,they   can   calculate   each   student's   total   grade   accumulated   over   a   semester for   their   classes!
			 * 
			 * 
			 */
		 
		
		  //create quiz
		@SuppressWarnings("unused")
		Quiz quiz =new Quiz();  
		  //which has questions
		 //create question q1 for quiz
		  Question q1 =new Question();
		  ArrayList<String> choicesQ1 =new ArrayList();
		  
		  q1.setTheQuestion("what is nodejs");   		
		  choicesQ1.add("A nodejs is single threaded event based application");
		  choicesQ1.add("B nodejs is distributed consensus");
		  Answer aQ1=new Answer();
		  aQ1.setAnswer("A");
		  q1.setCorrectAnswer(aQ1);
		  System.out.println(q1.toString());
		  
		  //create question for quiz
		  Question q2 =new Question();
		  ArrayList<String> choicesQ2 =new ArrayList(); 
		  q2.setTheQuestion("what is zookeeper");   		
		  choicesQ1.add("A zookeeper is single threaded event based application");
		  choicesQ1.add("B zookeeper is distributed consensus");
		  Answer aQ2=new Answer();
		  aQ2.setAnswer("B");
		  q2.setCorrectAnswer(aQ2);
		  System.out.println(q2.toString());
		  
		  //now add questions and set Quiz
		  ArrayList<Question> questions=new ArrayList();
		  questions.add(q1);
		  questions.add(q2);
		  
		  Quiz quiz1 =new Quiz();
		  quiz1.createQuestions(questions);
		  System.out.println(quiz1.toString());
		  
		  //Teacher multiple quizzes
		  ArrayList<Quiz> quizzes =new ArrayList();
		  quizzes.add(quiz1);
		  
		  //Teacher create quizzes
		  Teacher teacher =new Teacher();
		  teacher.createQuizzes(quizzes);
		  System.out.println("teacher state create quiz\n"+ teacher );
		  //Teacher assign quizzes
		  Student student =new Student();
		  ArrayList<Student> students = new ArrayList<Student> ();
		  students.add(student);
		  teacher.assignQuizzes(students );
		  System.out.println("teacher state assign quiz\n"+ teacher );
		  //Students   solve/answer   questions   to   complete   the   quiz,  
          //get assignned quizes[]		  
		  ArrayList<Quiz> assignment= student.getAssignQuiz();
		  
		  // Student answerquizes[]
		  for (Quiz aQuiz:assignment)
		  {
			  ArrayList<Question> questionS=aQuiz.getQuestions();
			  
			  		Question question1=   questionS.get(0);
			  		question1.setAnswer(aQ1);
			  
			  		Question question2=   questionS.get(1);
			  		question2.setAnswer(aQ2);
		  }
		  // Quizzes   need   to   get   graded  quiz graded!
		  teacher.gradeQuizzes(students);
		  System.out.println("teacher state grade quiz\n"+ teacher );
		  //print each students individualgrade
		  for (Student Astudent:students){
			  System.out.println("student grade quiz "+ Astudent.getTotal_grade() +"\n");
		  }
		  
		  
		  //For   each   teacher,   they   can   calculate   each   student's   total   grade   accumulated   over   a   semester for   their  
		  teacher.calculateStudentTotalGrade(students);
		  System.out.println("teacher state total grade\n"+ teacher );
		  
			
		  
		}
}
