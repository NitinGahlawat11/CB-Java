package Patterns;

import java.util.Scanner;

public class Sample 

{
	static Scanner sc= new  Scanner(System.in);

    public static void main(String args[]) 
    {
    	int n =sc.nextInt();
    	int nr=(2*n)-1;
    	int nst=1;
    	int row=1;
    	int val;
    	while(row<=nr) {
    		if(row<=nr/2) {
    			val=row;
    		}
    		else {
    			val=nr-row+1;
    		}
    		int cst=1;
    		while(cst<=nst) {
    			if(cst%2==0) {
    				System.out.print("*");
    			}
    			else {
    				System.out.print(val);
    			}
    		cst++;
    		}
    		System.out.println();
    		if(row<=nr/2) {
    			nst+=2;
    		}
    		else {
    			nst-=2;
    		}
    		row++;
    		
    	}
    	
    }
}
