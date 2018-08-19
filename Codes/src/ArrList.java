import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list = new ArrayList<>();

list.add(50);
list.add(80);
list.add(60);
list.add(880);
list.add(840);
list.add(820);
System.out.println(list.size());
System.out.println(list);
System.out.println("***************");
System.out.println(list.get(2));
System.out.println(list.size());
System.out.println(list);
list.remove(5);

System.out.println(list.size());
System.out.println(list);
	}

}
