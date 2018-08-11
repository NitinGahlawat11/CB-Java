package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int i=1;i<=n;i++) { // work to be done in each row
				System.out.print("*");
			} 
			System.out.print("\n"); // preparation for new line
		}
	}

}
