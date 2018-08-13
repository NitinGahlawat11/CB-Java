package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int noO=1; //no of one	
int nsp=n-1;
int row=1;
while(row<=n) {
int csp=1;
while(csp<=nsp) {
	
	System.out.print(" ");
	csp++;
}
int coO=1;
while(coO<=noO) {
	System.out.print("1");
	coO++;
}
 csp=1;
while(csp<=nsp) {
	System.out.print(" ");
	csp++;
}
System.out.println();
noO=noO+2;
nsp--;
row++;
}
	}

}
