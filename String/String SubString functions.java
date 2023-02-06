package string;

public class StringSubStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "coding";
		
		System.out.println(str1.substring(2)); //print a substring index 2 onwards means [2 to str1.length().]
		
		System.out.println(str1.substring(0)); //print entire string
		
		System.out.println(str1.substring(6)); //print a substring from index 6 onwards means here it gives an empty string
		
		String substr1 = str1.substring(6);
		System.out.println(substr1.length()); //length of substring1
		
		String substr2 = str1.substring(0,5);
		System.out.println(substr2); //(startIndex, endIndex) in which startIndex in inclusive and endIndex is exclusive
		
		String substr3 = str1.substring(0,7); //it gives StringIndexOutOfBoundException
		System.out.println(substr3);

	}

}
