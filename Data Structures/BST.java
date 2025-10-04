package Blank_Class;

class TreeNode {
	int key;
	TreeNode left, right;

	public TreeNode(int item) {
		key = item;
		left = right = null;
	}
}

public class BST {
	TreeNode root;

	public BST() {
		root = null;
	}

	public boolean max(TreeNode node, int key) {
		if (node == null)
			return false;

		if (node.key == key)
			return true;

		if (key > node.key)
			return max(node.right, key);
		else
			return max(node.left, key);
	}

	public boolean max(int key) {
		return max(root, key);
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.root = new TreeNode(50);
		bst.root.left = new TreeNode(30);
		bst.root.right = new TreeNode(70);
		bst.root.left.left = new TreeNode(20);
		bst.root.left.right = new TreeNode(40);
		bst.root.right.left = new TreeNode(60);
		bst.root.right.right = new TreeNode(80);

		int searchKey = 40;
		if (bst.max(searchKey)) {
			System.out.println(searchKey + " exists");
		} else {
			System.out.println(searchKey + " Does not exist");
		}
	}
}