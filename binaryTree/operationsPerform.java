package binaryTree;

public class operationsPerform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeLL mainTree = new binaryTreeLL();
		binaryNode N1 = new binaryNode();
		N1.data="36";
		binaryNode N2 = new binaryNode();
		N2.data="23";
		binaryNode N3 = new binaryNode();
		N3.data="56";
		binaryNode N4 = new binaryNode();
		N4.data="27";
		binaryNode N5 = new binaryNode();
		N5.data="29";
		binaryNode N6 = new binaryNode();
		N6.data="47";
		binaryNode N7 = new binaryNode();
		N7.data="64";
		binaryNode N8 = new binaryNode();
		N8.data="17";
		binaryNode N9 = new binaryNode();
		N9.data="20";
		
		mainTree.root=N1;
		N1.left = N2;
		N1.right = N3;
		N2.left = N4;
		N2.right = N5;
		N3.left = N6;
		N3.right = N7;
		N4.left = N8;
		N4.right = N9;
		
		mainTree.insertNode("78");
		System.out.println();
		mainTree.preOrder(mainTree.root);
		System.out.println();
		mainTree.inOrder(N1);
		System.out.println();
		mainTree.postOrder(N1);
		System.out.println();
		mainTree.levelOrder();
		System.out.println();
		mainTree.search("20");
		System.out.println();
		binaryNode deep = mainTree.getDeepestNode();
		System.out.println(deep.data);
		binaryNode dNode = mainTree.deleteDeepestNode();
		System.out.println(dNode.data);
		mainTree.deleteNode("17");
	}
}
