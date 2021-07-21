package BST;

public class operationsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTtree mainTree = new BSTtree();
		mainTree.insert(70);
		mainTree.insert(50);
		mainTree.insert(90);
		mainTree.insert(30);
		mainTree.insert(60);
		mainTree.insert(80);
		mainTree.insert(100);
		mainTree.insert(20);
		mainTree.insert(40);
		mainTree.insert(35);
		
		mainTree.inOrder(mainTree.root);
		System.out.println();
		mainTree.postOrder(mainTree.root);
		System.out.println();
		mainTree.preOrder(mainTree.root);
		System.out.println();
		mainTree.levelOrder();
		System.out.println();
		mainTree.search(mainTree.root, 35);
		BSTnode minObj = mainTree.minimumNode(mainTree.root);
		System.out.println(minObj.data);
		
		mainTree.root = mainTree.deleteNode(mainTree.root, 150);
		mainTree.levelOrder();
	}

}
