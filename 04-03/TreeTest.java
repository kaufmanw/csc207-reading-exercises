public class TreeTest {
  public static void main(String[] args) {
	Tree<Integer> t = new Tree();
	t.root = new Node(5);
	t.root.addLeft(2);
	t.root.left.addRight(3);
	t.root.addRight(8);
	t.root.right.addRight(10);
	t.root.right.addLeft(7);
	t.printInorder();
  }
}
