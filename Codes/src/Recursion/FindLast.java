package Recursion;

import java.util.Scanner;

public class FindLast {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reso[]=TakeInp();
		System.out.println("enter the start index");
		int si=sc.nextInt();
		System.out.println("enter the data you are looking for");
		int data=sc.nextInt();
		int res=findlast(reso,si,data);
		System.out.println(res);
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


public static int findlast(int[]arr,int si,int data) {
	if(si==arr.length) {
		return -1;
	}
	int index= findlast(arr,si+1,data);
	if(index==-1) {
		if(arr[si]==data) {
			return si;
		}
		else {
			return -1;
		}
	}
	else {
		return index;
	}
}


}
