package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int nsp=n/2;
int nst=1;
int row=1;
while(row<=n) {
int csp=1;
while(csp<=nsp) {
	System.out.print(" ");
csp++;
}
int cst=1;
while(cst<=nst) {
	System.out.print("*");
cst++;
}
csp=1;
while(csp<=nsp) {
	System.out.print(" ");
csp++;
}
System.out.println();
if(row<=n/2) {
	nst=nst+2;
	nsp--;
}
else {
	nst=nst-2;
	nsp++;
}
row++;

}
	}

}
