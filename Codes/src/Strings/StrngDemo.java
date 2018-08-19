package Strings;

import java.util.Scanner;

public class StrngDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String s1= "hello";
String s2= "hello";
String s3= new String("hello");
System.out.println(s1==s2);
System.out.println((s1==s3) + ","+ s1.equals(s3));
	}

}
