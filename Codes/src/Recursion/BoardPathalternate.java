package Recursion;

public class BoardPathalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boardpath(0,10,"");
	}
public static void boardpath(int start,int end,String ans) {
if(start==end) {
	System.out.println(ans);
	return;
}
if(start>end) {
	return;
}
	for(int dice=1;dice<=6;dice++) {
		boardpath(start+dice,end,ans+dice);
	}
}
}
