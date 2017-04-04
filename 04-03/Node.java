public class Node<T> { 
  public T value;
  public Node<T> left;
  public Node<T> right;
  public Node(T value, Node<T> left, Node<T> right) {
	this.value = value;
	this.left = left;
	this.right = right;
  }
  public Node(T value) { this(value, null, null); }
  public void addLeft(T value) { this.left = new Node<T>(value); }
  public void addRight(T value) { this.right = new Node<T>(value); }
}
