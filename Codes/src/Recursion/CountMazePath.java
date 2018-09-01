package Recursion;

public class CountMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(size(0,0,2,2));
	}
	public static int size(int sr,int sc,int er,int ec) {
		if(sr==er&&sc==ec) {
			
			return 1;
		}
		if(sr>er||sc>ec) {
			
			return 0;
		}
		
	int ch=	size(sr,sc+1,er,ec);
	int cv=	size(sr+1,sc,er,ec);
	return ch+cv;
	}
}
