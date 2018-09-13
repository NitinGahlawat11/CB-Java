package linkedlist;

public class Linkedlist {

	private class Node{
		private int data;
		private Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		Node temp=this.head;
	while(temp!=null) {
System.out.print(temp.data+" ,");
temp=temp.next;
	}
	}
	
	public void addLast(int item) {
	//create node
		Node nn= new Node();
		nn.data=item;
		nn.next=null;
		
		//attach node
		if(size>=1) {
			this.tail.next=nn;
		}
		
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			this.tail=nn;
			this.size++;
		}
		
	}
	
public void addFirst(int item) {
	Node nn=new Node();
	nn.data=item;
	nn.next=null;
 if(size>=1) {
	 nn.next=head;
 }
 if(size==0) {
	 this.head=nn;
	 this.tail=nn;
	 this.size++;
 }
 else {
	 this.head=nn;
	 this.size++;
 }

}



public int getFirst() throws Exception {
if(size==0) {
	throw new Exception("list is empty");
}	
return this.head.data;
}

public int getLast() throws Exception {
	if(size==0) {
		throw new Exception("list is again empty");
	}
	return this.tail.data;
}

public int getAt(int id) throws Exception {
	if(size==0) {
		throw new Exception("list is empty");
	}
	if(id<0||id>size) {
		throw new Exception("invalid index");
	}
	Node temp=head;
	for(int i=1;i<=id;i++) {
		temp=temp.next;
	}
	return temp.data;
	
}


private Node getNodeAt(int id) throws Exception {
	if(size==0) {
		throw new Exception("list is empty");
	}
	if(id<0||id>size) {
		throw new Exception("invalid index");
	}
	Node temp=head;
	for(int i=1;i<=id;i++) {
		temp=temp.next;
	}
	return temp;
}

public void addAt(int id,int item ) throws Exception {
	if(size==0) {
		throw new Exception("list is empty");
	}
	if(id<0||id>size) {
		throw new Exception("invalid index");
	}
	if(id==0) {
		addFirst(item);
	}
	if(id==size) {
		addLast(item);
	}
	
	Node nn= new Node();
	nn.next=null;
	nn.data=item;
	
	Node np=getNodeAt(id-1);
	Node nnn=np.next;
	np.next=nn;
	nn.next=nnn;
	
	this.size++;
}

public void reverseData() throws Exception {
	int l=0;
	int r=size-1;
while(l<r) {
	Node left=getNodeAt(l);
	Node right=getNodeAt(r);
	int temp=left.data;
	left.data=right.data;
	right.data=temp;

l++;
r--;
}

}

public void reversePointer() {
	Node prev=head;
	Node curr=prev.next;
	while(curr!=null) {
		Node ahead=curr.next;
	curr.next=prev;
	
	prev=curr;
	curr=ahead;
	
	}
	Node temp=head;
	head=tail;
	tail=temp;

	tail.next=null;

}


public int mid() {
Node slow=head;
Node fast=head;

while(fast.next!=null&&fast.next.next!=null) {
	slow=slow.next;
	fast=fast.next.next;
}
return slow.data;
}
}