package graph.DijkstraBellman;

import java.util.*;

public class WeightedGraph {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public WeightedGraph(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> q = new PriorityQueue<WeightedNode>();
		node.distance = 0;
		q.addAll(nodeList);
		while (!q.isEmpty()) {
			WeightedNode currentNode = q.remove();
			for (WeightedNode neighbor : currentNode.neighbors) {
				if (q.contains(neighbor)) {
					if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
						neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
						neighbor.parent = currentNode;
						q.remove(neighbor);
						q.add(neighbor);
					}
				}
			}
		}
		for (WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node : " + nodeToCheck + " Distance : " + nodeToCheck.distance + " path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
	}

	public void pathPrint(WeightedNode node) {
		if (node.parent != null) {
			pathPrint(node.parent);
		}
		System.out.print(node.name + " ");
	}

	public void addWeightedEdge(int i, int j, int d) {
		WeightedNode first = nodeList.get(i);
		WeightedNode second = nodeList.get(j);
		first.neighbors.add(second);
		first.weightMap.put(second, d);
	}

	// Bellman Ford Algorithm

	void bellmanFord(WeightedNode sourceNode) {
		sourceNode.distance = 0;
		for (int i = 0; i < nodeList.size(); i++) {
			for (WeightedNode currentNode : nodeList) {
				for (WeightedNode neighbor : currentNode.neighbors) {
					if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
						neighbor.distance = currentNode.distance + currentNode.weightMap.get(neighbor);
						neighbor.parent = currentNode;
					}
				}
			}
		}
		System.out.println("Checking for negative cycle..");
		for (WeightedNode currentNode : nodeList) {
			for (WeightedNode neighbor : currentNode.neighbors) {
				if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
					System.out.println("Negative cycle found: \n");
					System.out.println("Vertex name: " + neighbor.name);
					System.out.println("Old cost: " + neighbor.distance);
					int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
					System.out.println("new cost: " + newDistance);
					return;
				}
			}
		}
		System.out.println("Negative Cycle not found");

		for (WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
	}
}
