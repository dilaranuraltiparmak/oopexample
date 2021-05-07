package oopexample;
public class Student {
	public Student() {
		//constructor-yapýcý olmasý gerekn kod bloklarýdýr
		System.out.println("Öðrenci bu kursu aldý" );
	}
	public Student(int id,String name,int studentnumber,String detail) {
		//overloading :Aþýrý yükleme birden fazla ayný adda mettot oluþturduðumuz için
	//this bu classtaki deðer demek

	this();//parametresiz olan ben bu kursu aldýmý çalýþtýrýr
	//this();ile iki constructoru çalýþtýrabilmek için
	this.id=id;
	this.name=name;
	this.studentnumber=studentnumber;
	this.detail=detail;
	//SOLID 
	//classlar 1-metot tutucu,2-iþ yapan class adýndan anlarýz
	}
	
int id;
String name;
int studentnumber;
String detail;
}
