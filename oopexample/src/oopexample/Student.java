package oopexample;
public class Student {
	public Student() {
		//constructor-yap�c� olmas� gerekn kod bloklar�d�r
		System.out.println("��renci bu kursu ald�" );
	}
	public Student(int id,String name,int studentnumber,String detail) {
		//overloading :A��r� y�kleme birden fazla ayn� adda mettot olu�turdu�umuz i�in
	//this bu classtaki de�er demek

	this();//parametresiz olan ben bu kursu ald�m� �al��t�r�r
	//this();ile iki constructoru �al��t�rabilmek i�in
	this.id=id;
	this.name=name;
	this.studentnumber=studentnumber;
	this.detail=detail;
	//SOLID 
	//classlar 1-metot tutucu,2-i� yapan class ad�ndan anlar�z
	}
	
int id;
String name;
int studentnumber;
String detail;
}
