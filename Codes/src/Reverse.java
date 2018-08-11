import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int ans=0,rem;
	while(n!=0) {
		rem=n%10;
		ans=ans*10+rem;
		n=n/10;
	}
	System.out.println(ans);
	}

}
