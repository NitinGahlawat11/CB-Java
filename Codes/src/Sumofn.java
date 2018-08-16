

    	import java.util.*;
    	public class Sumofn {
    	    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	int n= sc.nextInt();
    	int nst=1;
    	int noz=-1;
    	int row=1;
    	int val;
    	while(row<=n){
    	    val=row;
    	    if(row==1) {
    	    	System.out.print(val);
    	    }
    	    else if(row<=n/2) {
    	    	System.out.print(val);
    	    	System.out.print("\t");
    	    	System.out.print(val);
    	    }
    	    else {
    	    	System.out.print(val);
    	    	System.out.print("\t");
    	    	int coz=1;
    	    	while(coz<=noz) {
    	    		System.out.print("0");
    	    		System.out.print("\t");
    	    		coz++;
    	    	}
    	    	System.out.print(val);
    	    	
    	    }
    	    System.out.println();
    	    row++;
    	    noz++;
    	    
    	   
    	        
    	}
    	    }
    	}