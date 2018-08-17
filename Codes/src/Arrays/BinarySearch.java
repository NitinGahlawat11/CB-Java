package Arrays;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int[]values=takeInp();
		System.out.println("enter the element you want to search for");
		int data=sc.nextInt();
		int res=bs(values,data);
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
public static int bs(int[]arr,int data) {
	
	int front=0;
	int end= arr.length-1;
	
	while(front<=end) {
		int mid=(front+end)/2;
 if(arr[mid]>data) {
	end=mid-1;
}
 else if(arr[mid]<data) {
	front=mid+1;
}
 else return mid;
}
	System.out.println("element not found");
	return-1;
}
}
