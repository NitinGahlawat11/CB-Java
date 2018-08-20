package Recursion;

public class IncreasingDecreasing {
public static void main(String[] args) {
	ID(5);
}
	public static void ID(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
	ID(n-1);
	System.out.println(n);
	} 
}

