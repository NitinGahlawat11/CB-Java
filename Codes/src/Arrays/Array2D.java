package Arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]arr=new int[3][3];
//display(arr);
arr[0][1]=21;
arr[2][1]=68;
display(arr);
	}
	public static void display(int[][]arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
