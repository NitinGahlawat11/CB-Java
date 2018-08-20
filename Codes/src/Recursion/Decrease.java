package Recursion;

public class Decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
decrease(5);
	}
	public static void decrease(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
	decrease(n-1);
	} 


}
