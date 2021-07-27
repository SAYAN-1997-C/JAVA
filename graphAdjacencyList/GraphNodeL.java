package graph.graphAdjacencyList;

import java.util.ArrayList;

public class GraphNodeL {

	String name;
	int index;
	boolean isVisited = false;
	GraphNodeL parent;
	
	ArrayList<GraphNodeL> neighbors = new ArrayList<GraphNodeL>();
	
	public GraphNodeL(String name , int index) {
		this.name = name;
		this.index = index;
	}
}
