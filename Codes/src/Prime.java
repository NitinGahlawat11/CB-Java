import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	boolean flag=true;
int divisor=2;
	while(divisor<=n-1) {
		if(n%divisor==0) {
			flag=false;
		}
		divisor++;
	}
	
	if(flag==false) {
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
	
}
}
