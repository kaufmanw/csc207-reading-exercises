public class Dog {
  public String type;
  
  public int age;
  
  public String name;

  public Dog(String type, int age, String name) {
	this.type = type;
	this.age = age;
	this.name = name;
  }

  public void Bark() {
	System.out.printf("type of dog is %s \n", type);
	System.out.printf("age of dog is %d \n", age);
	System.out.printf("name of dog is %s \n", name);
  }
}
