package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=2;
int n=5;
	int res=	power(x,n);
	System.out.println(res);
	}
public static int power(int x,int n) {
	if(n==0) {
		return 1;
	}
	return x*power(x,n-1);
}
}
