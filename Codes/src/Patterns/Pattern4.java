package Patterns;

import java.util.Scanner;

public class Pattern4{
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int nst=n;
	int row=1;
	while(row<=n) {
		int cst=1;
		while(cst<=nst) {
			System.out.print("*");
			cst++;
		}
		System.out.println();
		row++;
		nst--;
	}
	
	}
	
}