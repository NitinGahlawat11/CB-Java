package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int nst=n/2;
int nsp=1;
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
	if(row<=n/2) {
		nst--;
		nsp=nsp+2;
	}
	else {
		nst++;
		nsp=nsp-2;
	}
	
	
	row++;
}
	}

}
