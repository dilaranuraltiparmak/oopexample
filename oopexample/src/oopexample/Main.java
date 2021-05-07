package oopexample;

public class Main {

	public static void main(String[] args) {
		//objelerle çalışmaya başlamak
		Student student1=new Student(10,"Dilara Nur",23456,"c# bilgisi çok kötü");//örnek oluşturma,referans oluşturma,intance oluşturma
	    /*Student student1=new Student();//örnek oluşturma,referans oluşturma,intance oluşturma
	    student1.id=10;
	    student1.name="Dilara Nur";
	    student1.detail="c# bilgisi çok kötü";
	    student1.studentnumber=23456;*/
	    
	    Student student2=new Student();//örnek oluşturma,referans oluşturma,intance oluşturma
	    student2.id=20;
	   student2.name="Ayşe";
	    student2.detail="java bilgisi lazım";
	    student2.studentnumber=15050;
	    
	    Student student3=new Student();//örnek oluşturma,referans oluşturma,intance oluşturma
	    student3.id=30;
	   student3.name="Fatıma";
	    student3.detail="react lazım projesi için";
	    student3.studentnumber=189560;
	    Student[]students= {student1,student2,student3};//getproduct veritabanındaki verileri gider okur
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


