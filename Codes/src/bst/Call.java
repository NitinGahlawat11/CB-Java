package bst;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {10, 20, 30, 40, 50, 60, 70,800};
BST bs=new BST(arr);
bs.display();
//System.out.println(bs.find(50));
//System.out.println(bs.max());	
bs.add(58);
bs.display();
	}

}
