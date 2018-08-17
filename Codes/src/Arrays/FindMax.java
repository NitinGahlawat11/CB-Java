package Arrays;

import java.util.Scanner;

public class FindMax {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=takeInp();
int res=findMax(arr);
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
	public static int findMax(int []arr) {
		int max=Integer.MIN_VALUE; // -infinity
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
