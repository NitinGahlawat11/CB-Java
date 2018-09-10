import java.util.Scanner;

public class Fib {

	
	    public static void main(String args[]) {
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        int a=0;
	        int b=1;
	    int sum;
	    for(int i=0;i<=n;i++){
	        System.out.println(a);
	        sum=a+b;
	        a=b;
	        b=sum;
	        
	    }
	       
	    }
	}

