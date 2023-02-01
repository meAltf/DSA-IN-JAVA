import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int basic=s.nextInt();

        String str = s.next();
        char grade = str.charAt(0);
         
        int allow =0;
       
        double hra, da, pf;

       hra = 0.2 * basic;
       da = 0.5 * basic;
       pf = 0.11 * basic;

        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        
       double totalSalary=basic+hra+da+allow-pf;
       
        System.out.println(Math.round(totalSalary));

	}
}

