package binaryTreeUsingArray;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTree bt = new binaryTree(5);
		bt.insert("1");
		bt.insert("2");
		bt.insert("3");
		bt.insert("4");
		bt.insert("5");
		bt.insert("6");
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.levelOrder();
		System.out.println();
		int x = bt.search("5");
		System.out.println(x);
		bt.deleteNode("8");
		
		
	}
	
}
