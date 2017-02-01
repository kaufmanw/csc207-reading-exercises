public class Student {
  private String firstName;
  private String lastName;
  private int id;
  private int age;

  /**
	* Constructor for the Student type
	*
	* @param firstName the firstName of the student to be initialized
	* @param lastName the last name of the student to be initialized 
	* @param id the id of the student to be initialized
	* @param age the age of the student to be initialized
	*/
  public Student (String firstName, String lastName, int id, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
	this.age = age;
  }

  /**
	* @return the first name of student.
	*/
  public String getFirstName() {
	return this.firstName;
  }


  /** 
	* @return the last name of the student.
	*/
  public String getLastName() {
	return this.lastName;
  }

  /** 
	* @return the id of the student.
   */ 
  public int getId() {
	return this.id;
  }

  /**
	* @return the age of the student.
	*/
  public int getAge() {
	return this.age;
  }


  /** 
	* Sets the student's new first name 
	* @param s the string to be set as the student's first name
	*/
  public void setFirstName(String s) {
	this.firstName = s;
  }

  /**
	* Sets the student's new last name
	* @param s the string to be set as the student's last name
	*/
  public void setLastName(String s) {
	this.lastName = s;
  }

  /**
	* Sets the student's new id
	* @param n the new value for the student's id. n must be a 6 digit number (leading zeros allowed), i.e. between 0 and 999999 
	*/
  public void setId(int n) {
	if (n < 999999 && n > 0) {
	  this.id = n;
	} else {
	  throw new IllegalArgumentException();
	}
  }

  /**
	* Sets the student's new age
	* @param n the new value for the student's age. n must be a positive number and cannot exceed 1000.
	*/
  public void setAge(int n) {
	if (n > 0 && n < 1000) {
	  this.age = n;
	} else {
	  throw new IllegalArgumentException();
	}
  }
}
