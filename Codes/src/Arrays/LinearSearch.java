package Arrays;

import java.util.Scanner;

public class LinearSearch {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]values=takeInp();
System.out.println("enter the element you want to search for");
int data=sc.nextInt();
int res=ls(values,data);
	System.out.println(res);
	}
	public static int[] takeInp() {
		System.out.println("Enter the elements you want to insert");
		int n= sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value at"+ i+ "index");
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	public static int ls(int arr[],int data) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data) {
				return i;
			}
		}
		System.out.println("Element you are looking for is not available in the array");
return -1;
	}

}
