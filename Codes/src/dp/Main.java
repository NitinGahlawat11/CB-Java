package dp;

public class Main {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int[] strg = new int[n + 1];
		 startAlgo();
		 System.out.println(fib(n));
		 System.out.println("Fib Normal took time " + endAlgo() + " ms ");
		
		 startAlgo();
		 System.out.println(fibRs(n, strg));
		 System.out.println("Fib Recursive Storage took time " + endAlgo() + "ms ");
		
		 startAlgo();
		 System.out.println(fibIt(n));
		 System.out.println("Fib Iterative storage took time " + endAlgo() + "ms ");
	}
	public static int fib(int n) {
		if(n==0) {
			return n;
			
		}
		if(n==1) return n;
		int f1=fib(n-1);
		int f2=fib(n-2);
		int f=f1+f2;
return f;
	}
	public static int fibRs(int n,int[]strg) {
		if(n==0) {
			return n;
			
		}
		if(n==1) return n;
		if(strg[n]!=0)return strg[n];
		int f1=fibRs(n-1,strg);
		int f2=fibRs(n-2,strg);
		int f=f1+f2;
return strg[n]=f;
	}
	public static int fibIt(int n) {
		
		int[]strg= new int[n+1];
		strg[0]=0;
		strg[1]=1;
		for(int i=2;i<=n;i++) {
			strg[i]=strg[i-1]+strg[i-2];
		}
		
		return strg[n];
	}
	
}
