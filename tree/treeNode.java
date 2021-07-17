package tree;

import java.util.*;

public class treeNode {

	String data;
	ArrayList<treeNode> children;

	public treeNode(String data) {
		this.data = data;
		this.children = new ArrayList<treeNode>();
	}
	
	public void addChild(treeNode node) {
		this.children.add(node);
	}
	
	public String print(int level) {
		String ret;
		ret = "  ".repeat(level)+data+"\n";
		for(treeNode node : this.children) {
			ret +=node.print(level+1);
		}
		return ret;
	}
}
