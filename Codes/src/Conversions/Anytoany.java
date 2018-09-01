package Conversions;

import java.util.Scanner;

public class Anytoany {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	src=sc.nextInt();
		int sb=sc.nextInt();
		int db=sc.nextInt();
		System.out.println(result(src,sb,db));
	}
public static int result(int src,int sb,int db) {
	
	
	 
			int ans=0;
			int multiplier=1;
			while(src!=0) {
				int rem=src%10;
				 ans=ans+(rem*multiplier);
				 multiplier=multiplier*sb;
				 src=src/10;
				
			}
			src=ans;
			 ans=0;
			 multiplier=1;
			while(src!=0) {
				int rem=src%db;
				ans= ans+(rem*multiplier);
				multiplier=multiplier*10;
			src=src/db;
			}
			return ans;
		}
		}
	//int deci=Anytodeci.conversion(src, sb);
	//int any=DecitoAny.conversion(deci, db);
//return any;



