package oopexample;

public class Main {

	public static void main(String[] args) {
		//objelerle �al��maya ba�lamak
		Student student1=new Student(10,"Dilara Nur",23456,"c# bilgisi �ok k�t�");//�rnek olu�turma,referans olu�turma,intance olu�turma
	    /*Student student1=new Student();//�rnek olu�turma,referans olu�turma,intance olu�turma
	    student1.id=10;
	    student1.name="Dilara Nur";
	    student1.detail="c# bilgisi �ok k�t�";
	    student1.studentnumber=23456;*/
	    
	    Student student2=new Student();//�rnek olu�turma,referans olu�turma,intance olu�turma
	    student2.id=20;
	   student2.name="Ay�e";
	    student2.detail="java bilgisi laz�m";
	    student2.studentnumber=15050;
	    
	    Student student3=new Student();//�rnek olu�turma,referans olu�turma,intance olu�turma
	    student3.id=30;
	   student3.name="Fat�ma";
	    student3.detail="react laz�m projesi i�in";
	    student3.studentnumber=189560;
	    Student[]students= {student1,student2,student3};//getproduct veritaban�ndaki verileri gider okur
	for (Student student:students) {
		System.out.println(student.name);
		
	}
	System.out.println(students.length);
	Course course1=new Course();
	course1.name="c#";
	course1.id=1;

	Course course2=new Course();
	course2.name="java";
	course2.id=2;
	CourseManager CourseManager=new CourseManager();
	CourseManager.addToList(course1);
	CourseManager.addToList(course2);
	
		}
	
	}


