package BST;

import java.util.Queue;
import java.util.LinkedList;

public class BSTtree {
	BSTnode root;
	
	BSTtree() {
		root = null;
	}
	
	public BSTnode insert(BSTnode currentNode , int value) {
		if(currentNode == null) {
			BSTnode newNode = new BSTnode();
			newNode.data = value;
			currentNode = newNode;
			return currentNode;
		} else if(value <= currentNode.data ) {
			currentNode.left = insert(currentNode.left,value);
			return currentNode;
		} else { 
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
	}
	public void insert(int value) {
		root = insert(root,value);

	}
	void inOrder(BSTnode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " -> ");
		inOrder(node.right);
	}
	void preOrder(BSTnode root) {
		if(root == null) {
			return; 
		}
		System.out.print(root.data + " -> ");
		preOrder(root.left);
		preOrder(root.right);
	}
	void postOrder(BSTnode root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " -> ");
	}
	void levelOrder() {
		if(root==null) {
			return;
		}
		Queue<BSTnode> q = new LinkedList<BSTnode>();
		q.add(root);
		while(!q.isEmpty()) {
			BSTnode pNode = q.remove();
			System.out.print(pNode.data + " -> ");
			if(pNode.left!=null) {
				q.add(pNode.left);
			}
			if(pNode.right!=null) {
				q.add(pNode.right);
			}
		}
	}
	BSTnode search(BSTnode node , int value) {
		if(node == null) {
			System.out.println(value + " value is not found!");
			return node;
		}
		if(node.data == value) {
			System.out.println(value + " is found in yhis tree.");
			return node;
		} 
		if(node.data > value) {
		    return search(node.left,value);
		}
		else {
		   return search(node.right,value);
		}
	}
	
	BSTnode minimumNode(BSTnode node) {
		if(node == null) {
			return node;
		}
		if(node.left == null) {
			return node;
		}
		else {
			return minimumNode(node.left);
		}
	}
	
	BSTnode deleteNode(BSTnode root,int value) {
		if(root == null) {
			System.out.println("value is not found!");
			return root;
		}
		if(value < root.data) {
			root.left = deleteNode(root.left , value);
		} else if (value > root.data) {
			root.right = deleteNode(root.right , value);
		}
		else {
			if(root.left != null && root.right != null) {
				BSTnode minRight = minimumNode(root.right);
				root.data = minRight.data ;
				root.right = deleteNode(root.right, minRight.data);
			} else if (root.left != null) {
				root = root.left;
			} else if (root.right != null) {
				root= root.right;
			} else {
				root = null;
			}
		}
		return root;
	}
	
	void deleteBST() {
		root = null;
		System.out.println("BST is successfully deleted!");
	}
}
