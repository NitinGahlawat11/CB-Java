package Arrays;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(80);
		list.add(110);
		list.add(820);
		list.add(810);
		list.add(870);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(4));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());

	}

}
