package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeLL {

	binaryNode root;

	binaryTreeLL() {
		this.root = null;
	}

	void preOrder(binaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " -> ");
		preOrder(node.left);
		preOrder(node.right);
	}

	void inOrder(binaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " -> ");
		inOrder(node.right);
	}

	void postOrder(binaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " -> ");
	}

	void levelOrder() {
		if (root == null) {
			return;
		}
		Queue<binaryNode> queue = new LinkedList<binaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			binaryNode presentNode = queue.remove();
			System.out.print(presentNode.data + " -> ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}

	void search(String value) {
		if (root == null) {
			return;
		}
		Queue<binaryNode> q = new LinkedList<binaryNode>();
		q.add(root);
		while (!q.isEmpty()) {
			binaryNode pNode = q.remove();
			if (pNode.data.equals(value)) {
				System.out.println(value + " is found in this tree!");
				return;
			}
			if (pNode.left != null) {
				q.add(pNode.left);
			}
			if (pNode.right != null) {
				q.add(pNode.right);
			}
		}
		System.out.println("Not found!");
	}

	void insertNode(String value) {
		binaryNode nw = new binaryNode();
		nw.data = value;
		if (root == null) {
			root = nw;
			System.out.println("Inserted Successfully");
			return;
		}
		Queue<binaryNode> q = new LinkedList<binaryNode>();
		q.add(root);
		while (!q.isEmpty()) {
			binaryNode pNode = q.remove();
			if (pNode.left == null) {
				pNode.left = nw;
				System.out.println("Inserted Successfully!");
				return;
			}
			else if(pNode.right == null) {
				pNode.right=nw;
				System.out.println("Inserted Successfully!");
				return;
			} else {
				q.add(pNode.left);
				q.add(pNode.right);
			}
		}
	}
	binaryNode getDeepestNode() {
		binaryNode pNode = null;
		if(root==null) {
			return pNode;
		}
		Queue<binaryNode> q = new LinkedList<binaryNode>();
		q.add(root);
		while(!q.isEmpty()) {
			pNode = q.remove();
			if(pNode.left!=null) {
				q.add(pNode.left);
			}
			if(pNode.right!=null) {
				q.add(pNode.right);
			}
		}
		return pNode;
	}
	binaryNode deleteDeepestNode() {
		binaryNode prevNode=null,pNode=null,x = null;
		if(root==null) {
			return x;
		}
		Queue<binaryNode> q = new LinkedList<binaryNode>();
		q.add(root);
		while(!q.isEmpty()) {
			prevNode = pNode;
			pNode = q.remove();
			if(pNode.left==null) {
				x = prevNode.right;
				prevNode.right =null;
				break;
			}
			if(pNode.right==null) {
				x = pNode.left;
				pNode.left=null;
				break;
			}
			q.add(pNode.left);
			q.add(pNode.right);
		}
		return x;
	}
	void deleteNode(String value) {
		if(root==null) {
			return;
		}
		Queue<binaryNode> q = new LinkedList<binaryNode>();
		q.add(root);
		while(!q.isEmpty()) {
			binaryNode pNode = q.remove();
			if(pNode.data.equals(value)) {
				binaryNode lastNode = getDeepestNode();
				pNode.data = lastNode.data;
				deleteDeepestNode();
				System.out.println("Deleted Successfully");
				return ;
			}
			if(pNode.left!=null) {
				q.add(pNode.left);
			}
			if(pNode.right!=null) {
				q.add(pNode.right);
			}
		}
		System.out.println("Value is not present!");
		return;
 	}
	void deleteBT() {
		root=null;
		System.out.println("Tree is deleted!");
	}
}
