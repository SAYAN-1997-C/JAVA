package graph.graphAdjacencyMatrix;

import java.util.ArrayList;

import graph.graphAdjacencyList.GraphL;
import graph.graphAdjacencyList.GraphNodeL;

public class oprations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
//		nodeList.add(new GraphNode("A", 0));
//		nodeList.add(new GraphNode("B", 1));
//		nodeList.add(new GraphNode("C", 2));
//		nodeList.add(new GraphNode("D", 3));
//		nodeList.add(new GraphNode("E", 4));
//		
//		Graph g = new Graph(nodeList);
//		g.undirectedEdge(0, 1);
//		g.undirectedEdge(0, 2);
//		g.undirectedEdge(0, 3);
//		g.undirectedEdge(1, 4);
//		g.undirectedEdge(2, 3);
//		g.undirectedEdge(3, 4);
//		
//		
//		String res = g.print();
//		System.out.println(res);
//		
//		ArrayList<GraphNode> nei = new ArrayList<GraphNode>();
//		nei = g.getNeighbors(g.nodeList.get(0));
//		for(GraphNode n : nei) {
//			System.out.println(n.name);
//		}
//		g.bfs();
//		System.out.println();
//		g.dfs();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		nodeList.add(new GraphNode("F", 5));
		nodeList.add(new GraphNode("G", 6));
		nodeList.add(new GraphNode("H", 7));
		
		Graph g = new Graph(nodeList);
		g.addDirectedEdge(0, 2);
		g.addDirectedEdge(1, 2);
		g.addDirectedEdge(1, 3);
		g.addDirectedEdge(2, 4);
		g.addDirectedEdge(3, 5);
		g.addDirectedEdge(4, 5);
		g.addDirectedEdge(4, 7);
		g.addDirectedEdge(5, 7);
		g.addDirectedEdge(5, 6);
		
		g.topologicalSort();
	}

}
