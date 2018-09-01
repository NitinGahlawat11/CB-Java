package Patterns;

import java.util.Scanner;

public class Sample 

{
	static Scanner sc= new  Scanner(System.in);

    public static void main(String args[]) 
    {
    
System.out.println(conversion(33));
 }

    public static int conversion(int oct) {
 int bin=0;
 int power=1;
while(oct!=0) {
	int rem=oct%10;
if(rem==0) rem=000;
if(rem==1) rem=001;
if(rem==2) rem=010;
if(rem==3) rem=110;
if(rem==4) rem=100;
if(rem==5) rem=101;
if(rem==6) rem=110;
if(rem==7) rem=111;
bin+=rem*power;
	power=power*1000;
	oct=oct/10;
}
return bin;
    }
    
    }	


   