package Recursion;

import java.util.Scanner;

public class AllIndices {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]values=takeInp();
int[]res=allindices(values,0,33,0);
for(int i=0;i<res.length;i++) {
System.out.println(res[i]);
}
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
	public static int[] allindices(int arr[],int si,int data,int count) {
		
		if(si==arr.length) {
			int[]base=new int[count];
		return base;
		}
		
		int[]indices=null;
		if(arr[si]==data) {
			indices=allindices(arr,si+1,data,count+1);
		}
		else {
			indices=allindices(arr,si+1,data,count);
		}
	
	if(arr[si]==data) {
		indices[count]=si;
	}
	return indices;
	}
	

}