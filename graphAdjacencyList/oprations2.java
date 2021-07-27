package graph.graphAdjacencyList;

import java.util.ArrayList;

public class oprations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraphNodeL> listNode = new ArrayList<GraphNodeL>();
		listNode.add(new GraphNodeL("A", 0));
		listNode.add(new GraphNodeL("B", 1));
		listNode.add(new GraphNodeL("C", 2));
		listNode.add(new GraphNodeL("D", 3));
		listNode.add(new GraphNodeL("E", 4));
		listNode.add(new GraphNodeL("F", 5));
		listNode.add(new GraphNodeL("G", 6));
		
		GraphL g = new GraphL(listNode);
		g.addUndirectedEdges(0, 1);
		g.addUndirectedEdges(0, 2);
		g.addUndirectedEdges(1, 3);
		g.addUndirectedEdges(1, 6);
		g.addUndirectedEdges(2, 3);
		g.addUndirectedEdges(2, 4);
		g.addUndirectedEdges(3, 5);
		g.addUndirectedEdges(4, 5);
		g.addUndirectedEdges(5, 6);
		
		g.BFSForSSSPP(listNode.get(0));
	}

}
