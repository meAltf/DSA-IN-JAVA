package classesandobjects;

public class Student {
		
		//String name;
		//int rollNumber;
		
		public String name;
		private int rollNumber;
		//final private int rollNumber;
		
		double cgpa;
//final double conversionFactor = 0.95;
		public final static double CONVERSIONFACTOR = 0.95;
		//static int numStudents;
		private static int numStudents;
		
		//getter and setter are available to access private modifiers
		
		//get rollNumber
		public int getRollNumber() {
			return this.rollNumber;
		}
		
		//creating constructor
		//constructor with name and roll number value
		public Student(String name, int rollNumber) {
			this.name = name;
			this.rollNumber = rollNumber;
			numStudents++; 
		}
		
		//constructor with a name value only
		public Student(String name) {
			this.name= name;
	//rollNumber = 123;
			numStudents++;
		}
		
		//constructor with default value
		public Student() {
			name = "Robert";
			rollNumber= 123;
		}
		
		//constructor to print 
		public void print() {
			System.out.println(name + " " + rollNumber);
		}
		
		//set rollNumber
		public void setRollNumber(int num) {
			if(num <= 0) {
				return;
			}
			System.out.println("this  " + this);
			this.rollNumber = num;
		}
		
		//if we take numStudents as a private and want to getNumStudent then we create 
		public static int getNumStudent() {
			//it will give an error because when we access it through object then this do not know whose rollnumber you want to access
			//System.out.println(rollNumber);
			return numStudents;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
