package myutil;
import java.util.*;
public class Student {
	int rollno;
	String name;
	float fee;
	Student (int rollno ,String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	public void display() {
		System.out.println(rollno+"" +name +"" +fee);
		
	}
}
class StudentMain
{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1=new Student(111,"Aung Aung",5000f);
		Student s2= new Student(112,"Hla Hla",6000f);
		s1.display();
		s2.display();
		

	}

}==