package inheritance;

public class Car extends Vehicles{
	

	int numDoors;
	//int maxSpeed;
	
	/*
	//public void printCar() {
		public void print() {
	// System.out.println("car " + "color "+ color+ " maxSpeed " + maxSpeed + "numDoors "+numDoors);
		
		System.out.println("car " + "color "+ getColor()+ " maxSpeed " + maxSpeed + " numDoors "+ numDoors);
	}
	*/
	
	public Car(int numDoors) {
		super(100);
		System.out.println("Car's Constructor");
		this.numDoors = numDoors;
	}
	
//	public Car() {
//		System.out.println("Car's Constructor");
//	}
	
	public void print() {
		super.print();
		System.out.println("car " + " numDoors "+ numDoors);
	}
	
	public void printMaxSpeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed+" "+super.maxSpeed);
	}
}
