package sorting;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {55,44,31,15,74};
int ans[]=bub(arr);
	for(int i=0;i<ans.length;i++) {
		System.out.println(ans[i]);
	}
	}
public static  int[] bub(int[]arr) {
	for(int counter=0;counter<arr.length-1;counter++) {
		
		for(int j=0;j<arr.length-1-counter;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		
	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	return arr;
}

}
