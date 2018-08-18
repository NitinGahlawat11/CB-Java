package Arrays;

import java.util.Scanner;

public class Array2DBasicOps {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]arr=takeInp();
display(arr);
	}
	public static int[][] takeInp(){
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		int[][]arr=new int[rows][];
		for(int row=0;row<rows;row++) {
			System.out.println("Enter the no of cols for row "+ row);
			int cols=sc.nextInt();
			arr[row]=new int[cols];
			for(int col=0;col<cols;col++) {
				System.out.println("Enter the value for row"+row+"and col"+col);
				arr[row][col]=sc.nextInt();
			}
		}
		return arr;
	}
	private static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
