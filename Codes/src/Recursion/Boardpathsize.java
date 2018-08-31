package Recursion;

public class Boardpathsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(size(0,10));
	}
public static int size(int start,int end) 
{
	if(start==end) {
		return 1;
	}
	if(start>end) {
		return 0;
	}
	int count=0;
	for (int dice=1;dice<=6;dice++) {
		count+=size(start+dice,end);
	}
	return count;
	}
}
