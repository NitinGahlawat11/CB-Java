package Conversions;

import java.util.Scanner;

public class Anytodeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int src=sc.nextInt();
int sb=sc.nextInt();
 int res=conversion(src,sb);
 System.out.println(res);
		
	}
	
	public static int conversion(int src,int sb) {
		int ans=0;
		int multiplier=1;
		while(src!=0) {
			int rem=src%10;
			 ans=ans+(rem*multiplier);
			 multiplier=multiplier*sb;
			 src=src/10;
			
		}
		return ans;
	}

}
