package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int nst=1;
int n=sc.nextInt();
int row=1;
	while(row<=n) {
	int cst=1;
	while(cst<=nst) {
		System.out.print("*");
		cst++;
	}
	System.out.print("\n");
	row++;
	nst++;
	
	
	}
	
	}

}
