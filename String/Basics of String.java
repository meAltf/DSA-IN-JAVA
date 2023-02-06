package string;

public class BasicOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char arr[]= {'c','o','d','i','n','g'};
//		String str = "coding";
//		String str1 = "";  //null string , size is zero;
//		String str2 = " "; //string can store space as well;
//		
//		System.out.println(str.length()); //find string length
//		
//		System.out.println(str.charAt(5));  //to find char at that index of string  at index 5 the char of array is "g".
//		
//		//System.out.println(str.charAt(6));  //StringIndexOutOfBoundException
//		
//		System.out.println(str1.length());
//		
//		System.out.println(str2.length());
		
		String m = "coding";
		String n = " is fun";
		
		String p = "coding"; //coding //zoding //aeding---try it with these string with compareTo function
		
		System.out.println(m.equals(p)); //it checks content under the both string and it returns true/false
		
		System.out.println(m.compareTo(p)); // it checks str1 and str2 and if not match at any point then it return difference of their ASCII value of their
		
		//m = m+n;
		m = m.concat(n); //both operation gives same output
		
		System.out.println(m);
		
		System.out.println(m.contains("ng")); //return true or false

	}

}
