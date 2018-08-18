package Arrays;

import java.util.Scanner;

public class WavePattern {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]arr=takeInp();
print(arr);
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

	public static void print(int[][]arr) {
		for(int i =0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
		}
	}
	
}
