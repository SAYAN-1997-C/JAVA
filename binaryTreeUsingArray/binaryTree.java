package binaryTreeUsingArray;

public class binaryTree {

	String arr[];
	int lastUsedIndex;

	binaryTree(int size) {
		arr = new String[size + 1];
		lastUsedIndex = 0;
		System.out.println("Balnk tree of the " + size + " has been created.");
	}

	boolean isFull(String arr[]) {
		if (lastUsedIndex == arr.length - 1) {
			return true;
		}
		return false;
	}

	void insert(String data) {
		if (isFull(arr)) {
			System.out.println("Tree is already full!");
			return;
		}
		arr[++lastUsedIndex] = data;
		System.out.println("Inserted Successfully : " + data);
		return;
	}

	void preOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		System.out.print(arr[index] + " -> ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}

	void inOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		inOrder(index * 2);
		System.out.print(arr[index] + " -> ");
		inOrder((index * 2) + 1);
	}

	void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		}
		postOrder(index * 2);
		postOrder(index * 2 + 1);
		System.out.print(arr[index] + " -> ");
	}

	void levelOrder() {
		for (String data : arr) {
			if (data != null)
				System.out.print(data + " -> ");
		}
	}

	int search(String data) {
		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i] == data) {
				System.out.println("Value present at index : " + i);
				return i;
			}
		}
		return -1;
	}

	void deleteNode(String data) {
		int pos = search(data);
		if (pos == -1) {
			System.out.println("Value is not present!");
			return;
		}
		arr[pos] = arr[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("Deleted successfully!");
		return;
	}

	public void deleteBT() {
		try {
			arr = null;
			System.out.println("The BT has been successfully deleted");

		} catch (Exception e) {
			System.out.println("There was an error deleting the tree");
		}
	}
}
