package graph.graphAdjacencyMatrix;

import java.util.*;

public class Graph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int adjacencyMatrix[][];

	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void undirectedEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}

	public String print() {
		StringBuilder s = new StringBuilder();
		s.append("   ");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
		}
		s.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + ": ");
			for (int j : adjacencyMatrix[i]) {
				s.append((j) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	ArrayList<GraphNode> getNeighbors(GraphNode node) {
		ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
		int nodeIndex = node.index;
		for (int i = 0; i < nodeList.size(); i++) {
			if (adjacencyMatrix[nodeIndex][i] == 1) {
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}

	void bfsVisit(GraphNode node) {
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		q.add(node);
		while (!q.isEmpty()) {
			GraphNode currentNode = q.remove();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for (GraphNode neighbor : neighbors) {
				if (!neighbor.isVisited) {
					neighbor.isVisited = true;
					q.add(neighbor);
				}
			}
		}
	}

	void bfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				bfsVisit(node);
			}
		}
	}

	void dfsVisit(GraphNode node) {
		Stack<GraphNode> stk = new Stack<GraphNode>();
		stk.push(node);
		while (!stk.isEmpty()) {
			GraphNode currentNode = stk.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + "  ");
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for (GraphNode neighbor : neighbors) {
				if (!neighbor.isVisited) {
					stk.push(neighbor);
					neighbor.isVisited = true;
				}
			}
		}
	}

	void dfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				dfsVisit(node);
			}
		}
	}

	// Topological Sort

	void addDirectedEdge(int i, int j) {
		adjacencyMatrix[i][j] = 1;
	}

	void topologicalVisit(GraphNode node, Stack<GraphNode> stk) {
		ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
		for (GraphNode neighbor : neighbors) {
			if (!neighbor.isVisited) {
				topologicalVisit(neighbor, stk);
			}
		}
		node.isVisited = true;
		stk.push(node);
	}

	void topologicalSort() {
		Stack<GraphNode> stk = new Stack<GraphNode>();
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				topologicalVisit(node, stk);
			}
		}
		while (!stk.isEmpty()) {
			System.out.print(stk.pop().name + " ");
		}
	}

	public static void pathPrint(GraphNode node) {
		if (node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}

	public void BFSForSSSPP(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.print("Printing path for node " + currentNode.name + ": ");
			pathPrint(currentNode);
			System.out.println();
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			for (GraphNode neighbor : neighbors) {
				if (!neighbor.isVisited) {
					queue.add(neighbor);
					neighbor.isVisited = true;
					neighbor.parent = currentNode;
				}
			}

		}
	}
}
