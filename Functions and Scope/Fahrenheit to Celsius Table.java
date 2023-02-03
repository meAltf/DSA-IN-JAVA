package Function_Scope;

import java.util.Scanner;

public class fahrenheitCelsiusTable {
	
	    public static void printFahrenheitTable(int start, int end, int step)
	    {
	        for(int i=start;i<=end;i=i+step)
	        {
	            int cel=(int)((5.0/9)*(i-32));
	            System.out.println(i +"\t"+ cel);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		// function k liye input lena hai
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		
		//function call karna hai
		printFahrenheitTable(start,end,step);
		
		

	}

}
