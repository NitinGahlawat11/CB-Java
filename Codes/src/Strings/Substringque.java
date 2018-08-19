package Strings;

import java.util.Scanner;

public class Substringque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String skjhjh= sc.nextLine();
printSubstring(skjhjh);
	}
public static void printSubstring(String str) {
	for(int si=0;si<str.length();si++) {
		for(int ei=si+1;ei<=str.length();ei++) {
			String sr= str.substring(si, ei);
			System.out.println(sr);
		}
	}
}
}
