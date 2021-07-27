package graph.graphAdjacencyMatrix;

public class GraphNode {
	String name;
	int index;
	boolean isVisited = false;
	GraphNode parent;
	
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}
}
