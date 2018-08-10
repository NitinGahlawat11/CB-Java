import java.util.Scanner;

public class Si {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal");
		int p = sc.nextInt();
		System.out.println("enter rate");
		int r = sc.nextInt();
		System.out.println("enter time");
		int t = sc.nextInt();
		int si = (p * r * t) / 100;
		System.out.println("YOur simple interest is" + si);
	}

}
