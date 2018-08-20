package Recursion;

public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
increase(5);
	}
	public static void increase(int n) {
		if(n==0) {
			return;
		}
		increase(n-1);
		System.out.println(n);
	} 

}
