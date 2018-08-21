package Recursion;

import java.util.Scanner;

public class SortedArr {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]res=takeInp();
 boolean ans=isSorted(res,0);
 System.out.println(ans);
	
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
public static boolean isSorted(int[]arr,int si) {
if(arr.length-1==si) {
	return true;
}
	if(arr[si]>arr[si+1]) {
		return false;
	}
	boolean restans=isSorted(arr,si+1);
	return restans;
}
}
