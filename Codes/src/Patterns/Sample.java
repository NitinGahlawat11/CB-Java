package Patterns;

import java.util.Scanner;

public class Sample 

{
	static Scanner sc= new  Scanner(System.in);

public static void main(String[] args) {

	int n=sc.nextInt();
	int nr=2*n+1;
	int row=1;
	int nst=nr;
	int nsp=0;
	while(row<=nr) {
		int cst=1;
		int val=n;
		int csp=1;
		while(csp<=nsp) {
			System.out.print(" ");
			csp++;
		}
		
			while(cst<=nst) {
				if(cst<=nst/2) {
				System.out.print(val);
				cst++;
				val--;
				}
				else {
					System.out.print(val);
					cst++;
					val++;;
				}
			}
			 csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			
			
		
		System.out.println();
	if(row<=nr/2) {
		nst--;
	nsp++;
	}
	else {
		nst++;
	nsp--;
	}
		
		
		row++;
	
	
	}
}

}


   