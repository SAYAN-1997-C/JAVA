package graph.DijkstraBellman;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode> {

	String name;
	int index;
	ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();
	HashMap<WeightedNode, Integer> weightMap = new HashMap<WeightedNode, Integer>();
	boolean isVisited = false;
	int distance;
	WeightedNode parent;
	
	public WeightedNode(String name, int index) {
		this.name = name;
		this.index = index;
		distance = Integer.MAX_VALUE;
		
	}
	
 	@Override
 	public String toString() {
 		return name;
 	}
 	
 	@Override
 	public int compareTo(WeightedNode x) {
 		return this.distance - x.distance;
 	}
}
