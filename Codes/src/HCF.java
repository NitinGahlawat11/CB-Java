import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisior= sc.nextInt();
		int divident = sc.nextInt();
		while(divident%divisior!=0) {
			int rem=divident%divisior;
			divident=divisior;
			divisior=rem;
		}
		System.out.println(divisior);
	}

}
