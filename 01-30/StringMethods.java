public class StringMethods {
  public static void main(String[] args) {
	System.out.println(endsWithRep("foobarbar", "bar", 2));
	System.out.println(endsWithRep("foobarbar", "baz", 1));
  }
  
  public static boolean endsWithRep(String s1, String s2, int n) {
	String s3 = s2;
	for (int i = 1; i < n; i++) {
	  s3 += s2;
	} return s1.endsWith(s3);
  }
}

