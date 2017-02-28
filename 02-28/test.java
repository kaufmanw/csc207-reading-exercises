public class test {
  public static void main(String[] args) {
	Box b = new Box("hello");
	System.out.println(b.getValue());
	b.setValue("world");
	System.out.println(b.getValue());
  }
}
