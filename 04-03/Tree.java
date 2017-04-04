public class Tree<T> {
  
  public Node<T> root;
  public Tree() { root = null; }

/*  public Node<T> getRoot() {
	return this.root;
  }

 */

  public static int size(Node cur) {
	if (cur == null) {
	  return 0;
	} else {
	  return 1 + size(cur.left) + size(cur.right);
	}
  }

  public void printInorder() {
	printHelper(root);
  }

  public void printHelper(Node<T> node) {
	if (node == null) {
	  return ;
	}
	printHelper(node.left);
	System.out.println(node.value);
	printHelper(node.right);
  }
}

