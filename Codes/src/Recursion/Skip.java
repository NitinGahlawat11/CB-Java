package Recursion;

public class Skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ID(5);
	}
	public static void ID(int n) {
		if(n<0) {
			return;
		}
		
		System.out.println(n);
	ID(n-2);
	System.out.println(n+1);
	} 
}
