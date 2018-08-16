package Patterns;

	
	import java.util.*;
	public class Sample {
	    public static void main(String args[]) {
	 
			      int  max;
			      int step;
			      int lcm = 0;
			      Scanner sc = new Scanner(System.in);
			      
			     int  a = sc.nextInt();
			      
			       int b = sc.nextInt();

			      if(a > b){
			         max = step = a;
			      }
			      else{
			         max = step = b;
			      }

			      while(a!= 0) {
			         if(max % a == 0 && max % b == 0) {
			            lcm = max;
			            break;
			         }
			         max += step;
			      }
			      System.out.println(lcm);
			   }
	    }
	
