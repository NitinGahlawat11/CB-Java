import java.util.Scanner;

public class sample {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	print();
	}
public static void print() {
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int ans=0;
	for(int i=1;i<=n1;i++) {
		
		
		ans=3*i+2;
if(ans%n2!=0) {
		System.out.println(ans);
}
else {
	n1++;
}
}
		}

}

