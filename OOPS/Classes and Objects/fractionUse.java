package classesandobjects;

public class FractionUse {
  
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(4,6);
		//f1.print();
		//f1.setNumerator(12);
		//f1.getNumerator();
		//f1.increment();
		f1.print();
		
		Fraction f2 = new Fraction(4,8);
		//return the ans in f1 updated value not by third variable
//		f1.add(f2);
//		f1.print();

		//return the fraction ans in newly created third variable
		Fraction f3 = Fraction.add(f1,f2);
		f3.print();
	}

}
