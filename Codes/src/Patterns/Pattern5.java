package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n =  sc.nextInt();
int nsp=n-1;
int nst=1;
int row=1;
while(row<=n) {
	
	int csp=1;
	while(nsp>=csp) {
		System.out.print(" ");
		csp++;
	}
	int cst=1;
	while(nst>=cst) {
		System.out.print("*");
		cst++;
	}
	System.out.print("\n");
	nst++;
	nsp--;
	row++;
	
}
		
	}

}
