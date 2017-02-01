public class StudentTest {
  public static void main(String[] args) {
	Student Willie = new Student("Willie", "Kaufman", 217791, 20);
	System.out.println(Willie.getFirstName());
	System.out.println(Willie.getLastName());
	System.out.println(Willie.getId());
	System.out.println(Willie.getAge());
	Willie.setFirstName("Peter-Michael");
	Willie.setLastName("Osera");
	Willie.setId(666666);
	Willie.setAge(947);
	System.out.println(Willie.getFirstName());
	System.out.println(Willie.getLastName());
	System.out.println(Willie.getId());
	System.out.println(Willie.getAge());
  }
}
