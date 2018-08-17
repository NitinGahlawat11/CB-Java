package Patterns;

	
	import java.util.*;
	public class Sample {
	    public static void main(String args[]) {
	 
	    	
	    	Scanner sc= new Scanner(System.in);
	    	int src= sc.nextInt();
	    	int res = conversion(src);
	    	System.out.println(res);
	    	    }
	    	    public static int conversion(int src){
	    	        int ans=0;
	    	        int multiplier=1;
	    	        while(src!=0){
	    	            int rem=src%10;
	    	             ans= ans+(rem*multiplier);
	    	            multiplier=multiplier*2;
	    	            src=src/10;
	    	        }
	    	        return ans;
	    	    }
	    	
			   }
	    
	
