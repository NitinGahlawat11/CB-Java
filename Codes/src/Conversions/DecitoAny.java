package Conversions;

import java.util.Scanner;

public class DecitoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int src=sc.nextInt();
int db=sc.nextInt();
int res= conversion(src,db);
System.out.println(res);
	}

	public static int conversion(int src,int db) {
		int ans=0;
		int multiplier=1;
		while(src!=0) {
			int rem=src%db;
			ans= ans+(rem*multiplier);
			multiplier=multiplier*10;
		src=src/db;
		}
		return ans;
	}
	
}
