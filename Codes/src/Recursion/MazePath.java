package Recursion;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
path(0,0,2,2,"");
	}
	public static void path(int sr,int sc,int er,int ec,String ans) {
		if(sr==er&&sc==ec) {
			System.out.println(ans);
			return;
		}
		if(sr>er||sc>ec) {
			
			return;
		}
		
		path(sr,sc+1,er,ec,ans+"H");
		path(sr+1,sc,er,ec,ans+"V");
	}

}
