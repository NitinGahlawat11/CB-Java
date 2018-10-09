package graphs;
import java.util.*;
public class Graph {
private class Vertex{
	HashMap<String,Integer> nbrs=new HashMap<>();
}
HashMap<String,Vertex> vtcs= new HashMap<>();

public int getVertex() {
	return this.vtcs.size();
}
public boolean containsVertex(String vname) {
	return this.vtcs.containsKey(vname);
}
public void addVertex(String vname) {
	Vertex vx= new Vertex();
	vtcs.put(vname, vx);
}
public void removeVertex(String vname) {}

public int countEdges() {
int count=0;
ArrayList<String> keys=new ArrayList<>(vtcs.keySet());
for(String key:keys) {
	Vertex vtx=vtcs.get(key);
	count=count+vtx.nbrs.size();
}
return count/2;
}
public boolean containsEdge(String v1,String v2) {
	Vertex vx1=vtcs.get(v1);
	Vertex vx2=vtcs.get(v2);
	if(vx1==null||vx2==null||!vx1.nbrs.containsKey(v2)) {
		return false;
	}
	return true;
	
}
public void addEdge(String v1,String v2,int cost) {
	
	Vertex vx1=vtcs.get(v1);
	Vertex vx2=vtcs.get(v2);
	if(vx1==null||vx2==null||vx1.nbrs.containsKey(v2)) {
		return ;
	}
	vx1.nbrs.put(v2, cost);
	vx2.nbrs.put(v1, cost);

}
public void removeEdge(String v1,String v2) {
	Vertex vx1=vtcs.get(v1);
	Vertex vx2=vtcs.get(v2);
	if(vx1==null||vx2==null||!vx1.nbrs.containsKey(v2)) {
		return ;
	}
	vx1.nbrs.remove(v2);
	vx2.nbrs.remove(v1);
}
public void display() {

	System.out.println("------------------");
	ArrayList<String> vnames = new ArrayList<>(vtcs.keySet());

	for (String vname : vnames) {

		String str = vname + " => ";

		Vertex vtx = vtcs.get(vname);
		str += vtx.nbrs;

		System.out.println(str);
	}
	System.out.println("------------------");

}
}
