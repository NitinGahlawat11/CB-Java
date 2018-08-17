package Arrays;

import java.util.Scanner;

public class Basicops {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []res=takeInp();
displayresult(res);
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
	public static void displayresult(int[]arr) {
		System.out.println("You have entered: ");
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
