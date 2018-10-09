package graphs;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 10);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 6);
		graph.addEdge("F", "G", 4);

		graph.display();
		 System.out.println(graph.getVertex());
		 System.out.println(graph.countEdges());
		//
		 System.out.println(graph.containsEdge("A", "C"));
		 System.out.println(graph.containsEdge("E", "F"));

		 graph.removeEdge("D", "E");
		 graph.display();
		//
		 graph.removeVertex("F");
		 graph.display();
		//
		 graph.addVertex("F");
		 graph.display();
		//
		 graph.addEdge("A", "F", 10);
		 graph.display();
	}

}
