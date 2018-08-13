package Patterns;

import java.util.Scanner;

public class Pattern10 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int nst=1;
	int nsp=2*n-3;
	int row=1;
	while(row<=n) {
	int cst=1;
	while(cst<=nst) {
		System.out.print("*");
	cst++;
	}
	int csp=1;
	while(csp<=nsp) {
		System.out.print(" ");
		csp++;
	}
	 cst=1;
	while(cst<=nst) {
		System.out.print("*");
	cst++;
	}
	System.out.println();
	nst++;
	nsp=nsp-2;
	row++;
	
	
	
	
	
	}
}
}
