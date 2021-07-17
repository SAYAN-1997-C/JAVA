package tree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNode Drinks = new treeNode("Drinks");
		treeNode Hot = new treeNode("Hot");
		treeNode Cold = new treeNode("Cold");
		treeNode Tea = new treeNode("Tea");
		treeNode Coffee = new treeNode("Coffee");
		treeNode Wine = new treeNode("Wine");
		treeNode Beer = new treeNode("Beer");
		Drinks.addChild(Hot);
		Drinks.addChild(Cold);
		Hot.addChild(Tea);
		Hot.addChild(Coffee);
		Cold.addChild(Wine);
		Cold.addChild(Beer);
		System.out.println(Drinks.print(0));
	}

}
