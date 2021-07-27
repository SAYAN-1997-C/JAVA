package graph.graphAdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphL {

	ArrayList<GraphNodeL> listNode = new ArrayList<GraphNodeL>();

	public GraphL(ArrayList<GraphNodeL> listNode) {
		this.listNode = listNode;
	}

	public void addUndirectedEdges(int i, int j) {
		GraphNodeL first = listNode.get(i);
		GraphNodeL second = listNode.get(j);
		first.neighbors.add(second);
		second.neighbors.add(first);
	}

	public String print() {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < listNode.size(); i++) {
			s.append(listNode.get(i).name + ": ");
			for (GraphNodeL node : listNode.get(i).neighbors) {
				s.append(node.name + "-->");
			}
			s.append("\n");
		}
		return s.toString();
	}

	void bfsVisit(GraphNodeL node) {
		Queue<GraphNodeL> q = new LinkedList<GraphNodeL>();
		q.add(node);
		while (!q.isEmpty()) {
			GraphNodeL currentNode = q.remove();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			for (GraphNodeL neighbor : currentNode.neighbors) {
				if (!neighbor.isVisited) {
					neighbor.isVisited = true;
					q.add(neighbor);
				}
			}
		}
	}

	void bfs() {
		for (GraphNodeL node : listNode) {
			if (!node.isVisited) {
				bfsVisit(node);
			}
		}
	}

	// Topological Sort
	void addDirectedEdge(int i, int j) {
		GraphNodeL first = listNode.get(i);
		GraphNodeL second = listNode.get(j);
		first.neighbors.add(second);
	}

	void topologicalVisit(GraphNodeL node, Stack<GraphNodeL> stk) {
		for (GraphNodeL neighbor : node.neighbors) {
			if (!neighbor.isVisited) {
				topologicalVisit(neighbor, stk);
			}
		}
		node.isVisited = true;
		stk.push(node);
	}

	void topologicalSort() {
		Stack<GraphNodeL> stk = new Stack<GraphNodeL>();
		for (GraphNodeL node : listNode) {
			if (!node.isVisited) {
				topologicalVisit(node, stk);
			}
		}
		while (!stk.isEmpty()) {
			System.out.print(stk.pop().name + "  ");
		}
	}

	void pathPrint(GraphNodeL node) {
		if(node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + "  ");
	}
	
	void BFSForSSSPP(GraphNodeL node) {
		Queue<GraphNodeL> q = new LinkedList<GraphNodeL>();
		q.add(node);
		while(!q.isEmpty()) {
			GraphNodeL currentNode = q.remove();
			currentNode.isVisited = true;
			System.out.print("printing apth for Node "+currentNode.name + ": ");
			pathPrint(currentNode);
			System.out.println();
			ArrayList<GraphNodeL> neighbors = new ArrayList<GraphNodeL>();
			for(GraphNodeL neighbor : currentNode.neighbors) {
				if(!neighbor.isVisited) {
					q.add(neighbor);
					neighbor.isVisited = true;
					neighbor.parent = currentNode;
				}
			}
		}
	}

}
