package Exception;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Student s1= new Student();

try{
	s1.setAge(-20);
}
catch(Exception e) {
	System.out.println("you are in catch block");
}
System.out.println("program executed");
System.out.println(s1.getAge());
	}
	}
