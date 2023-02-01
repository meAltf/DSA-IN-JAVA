import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int x = s.nextInt();

        int power =1;

        for( int i=1;i<=x;i++){
                power = power*n;
          }
          System.out.println(power);
        }
        
    }
