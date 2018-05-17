MAIN class use mvn test ! t o run testing

deploy use mvn clean install

Programming   language   to   create   object   oriented   design   and
 use   test   driven   development   to   implement   classes   and   methods   
 with   appropriate   data   structure and   test   the   code   for   the   following   scenario.      Please   add   comments   describing   any   assumptions you   make:

There   are   Teachers-> object

There   are   Students-> object

                        classroom -> object
Students   are   in   classes     that   teachers   teach
classroom has
            students[]

Teacher can teach classroom
              
Teachers   can   create   multiple   quizzes   with   many   questions   (each   question   is   multiple   choice) 
Teachers   can   assign   quizzes   to   students

Teacher method:
create quizes[]
            has -> questions[]
assign quiz


Students   solve/answer   questions   to   complete   the   quiz,  
student 
               get assignned quizes[]
               answerquizes[]

 but   they   don't   have   to   complete   it   at once.   (Partial   submissions   can   be   made).

Function By teacher:

1. Quizzes   need   to   get   graded              quiz graded!

Classes -> classroom 1 -> quiz     cumulation
           classroom 2 -> quiz
2. For   each   teacher,   they   can   calculate   each   student's   total   grade   accumulated   over   a   semester for   their   classes!