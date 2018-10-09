package dp;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="nitin";
String s2="abnitcv";
		System.out.println(lcs(s1,s2));
	}
	public static int lcs(String s1,String s2) {
		if(s1.length()==0||s2.length()==0)
			return 0;
		
		String r1=s1.substring(1);
		String r2=s2.substring(1);
		int count=0;
		if(s1.charAt(0)==s2.charAt(0)) {
			 count=1+lcs(r1,r2);
		}
		else {
			int f1=lcs(s1,r2);
			int f2=lcs(r1,s2);
			 count=Math.max(f1, f2);
		}
		return count;
	}

}
