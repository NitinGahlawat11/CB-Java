package Recursion;

import java.util.Scanner;

public class FindFirst {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int reso[]=TakeInp();
System.out.println("enter the start index");
int si=sc.nextInt();
System.out.println("enter the data you are looking for");
int data=sc.nextInt();
int res=findfirst(reso,si,data);
System.out.println(res);
//for(int i=0;i<inp.length;i++) {
//System.out.println(inp[i]);
//}
	}
	
	public static int[] TakeInp() {
	System.out.println("Enter the no. of elements you want in array");	
	int n= sc.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the value at location"+i);
	arr[i]=sc.nextInt();
	}
	return arr;
	
	}
	
	
	
	
	
	
public static int findfirst(int[]arr,int si,int data) {
if(si==arr.length-1) {
	return -1;
}
	if(arr[si]==data) {
		return si;
	}
	int restans= findfirst(arr,si+1,data);
	return restans;
}
}
