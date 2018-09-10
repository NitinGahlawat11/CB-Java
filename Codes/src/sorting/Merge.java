package sorting;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr1[]= {5,10,20,25,35};
//int arr2[]= {11,13,15,17,19,21,23};
//int res[]=merge(arr1,arr2);
//for( int val:res) {
//System.out.print(val +" ");	
//}
		int []arr= {5,10,1,12,3,55,14,68,51};
		int[]res=sort(arr,0,arr.length-1);
		for( int val:res) {
			System.out.print(val +" ");	
			}
	}
public static int[]merge (int[]arr1,int[]arr2){
	int[]merge= new int[arr1.length+arr2.length];
	int i=0;
	int j=0;
	int k=0;
	while(i<arr1.length&&j<arr2.length) {
		if(arr1[i]<=arr2[j]) {
			merge[k]=arr1[i];
			i++;
			k++;
		}
		else {
			merge[k]=arr2[j];
			j++;
			k++;
		}
	}
	if(i==arr1.length) {
		while(j<arr2.length) {
			merge[k]=arr2[j];
			j++;
			k++;	
			
		}
		
	}
	else {
		while(i<arr1.length) {
			merge[k]=arr1[i];
			i++;
			k++;
	}
			
	
}
	return merge;
}


public static int[] sort (int[]arr,int low,int high){
	if(low==high) {
		int[]br=new int[1];
		br[0]=arr[low];
		return br;
	}
	
	int mid=(low+high)/2;
	int fh[]=sort(arr,low,mid);
	int sh[]=sort(arr,mid+1,high);
	int[]mergeres=merge(fh,sh);
	return mergeres;
}
}

