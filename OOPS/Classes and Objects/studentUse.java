package classesandobjects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//Scanner s = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		//System.out.println(s1);
		//System.out.println(s2);
		
		//default value of objects 
//		System.out.println(s1.name + " "+ s1.rollNumber);
//		System.out.println(s2.name + " "+ s2.rollNumber);
		
		//set properties for objects
		s1.name = "Robert";
		//s1.rollNumber= 48;
		//printing properties of object s1 of class student
		//System.out.println(s1.name + " " + s1.rollNumber);
		
		//set properties for objects
		s2.name = "Broon";
		//s2.rollNumber= 53;
		//printing properties of object s1 of class student
		//System.out.println(s2.name + " " + s2.rollNumber);
		
		//it will give error or it doesn't make any sense means names rollNumber name ka koi variable hai hi nhi hai
		//System.out.println(rollNumber);
		 
		//using setter and getter functions
		
		//s1.setRollNumber(100);
		//System.out.println(s1.name + " " + s1.getRollNumber());
		
		System.out.println("s1  " + s1);
		s1.setRollNumber(100);
		System.out.println(s1.name + " " + s1.getRollNumber());
*/
/*		
		Student s1 = new Student("robert",123);
		s1.print();
		
		Student s2 = new Student("alataf");
		s2.print();
*/
		//starting me koii object nhi hai
		System.out.println(Student.getNumStudent());
//		
//		Student s1 = new Student("alataf", 50);
//		Student s2 = new Student("robert", 60);
		//Student s3 = new Student("broon", 60);
		
		Student s1 = new Student("alataf");
		Student s2 = new Student("robert");
		
		//after creating  objects..
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
//		System.out.println(s3.numStudents);
		
		System.out.println(Student.getNumStudent());
		
		System.out.println(s1.getNumStudent());
		System.out.println(s2.getNumStudent());
	}
}
