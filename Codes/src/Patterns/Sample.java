package Patterns;

import java.util.Scanner;

public class Sample 

{
	static Scanner sc= new  Scanner(System.in);

    public static void main(String args[]) 
    {
    	int[]values=	takeInp();
    int[]res=	allindices(values,0,5,0);
    for(int i=0;i<res.length;i++) {
    	System.out.println(res[i]);
    }	
    }

    public static int[] takeInp() {
    	System.out.println("enter the elements you want inside yoour array");
    	int n= sc.nextInt();
    	int[]arr=new int[n];
    	for(int i=0;i<arr.length;i++) {
    	System.out.println("enter the value at "+i+"index");
    	arr[i]=sc.nextInt();
    	
    	}
    	return arr;
    	}
    
    
    public static int[] allindices(int []arr,int si,int data, int count) {
    	
    	if(si==arr.length) {
    	int[]base= new int[count];
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
    
    // [5,1,5,22,5,5,1] ,1 =>[1,6]
    
    
    }

