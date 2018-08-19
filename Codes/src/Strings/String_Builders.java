package Strings;

public class String_Builders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.length());

		sb.append("hello");
		System.out.println(sb);
		sb.insert(2, 'b');
		System.out.println(sb);
		sb.setCharAt(2, 'd');
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}

}
