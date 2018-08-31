package Patterns;

import java.util.Scanner;

public class Sample 

{
	static Scanner sc= new  Scanner(System.in);

    public static void main(String args[]) 
    {
    
 int n=sc.nextInt();
 int row=1;
 int nst=1;
 int nsp=2*n-2*row-1;
 while(row<=n) {
	 int cst=1;
	 while(cst<=nst) {
		 System.out.print(cst);
		 cst++;
	 }
	 int csp=1;
	 while(csp<=nsp) {
		 System.out.print(" ");
		 csp++;
	 }
	 cst = row==n?row-1:row;
	 while(cst>=1) {
		 System.out.print(cst);
		 cst--;
	 }
	 System.out.println();
	 nsp-=2;
	 nst++;
	 row++;
 }
 
    }	
}

   