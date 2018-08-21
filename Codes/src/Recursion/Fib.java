package Recursion;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib(80));
	}
public static int fib(int n) {
	if(n==1||n==0) return n;
	int f1=fib(n-1);
	int f2=fib(n-2);
	 int f=f1+f2;
return f;
}
}
