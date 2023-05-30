package Part3Revision;

public class D7 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Sachin");
		System.out.println(s.capacity());
		StringBuilder s1=new StringBuilder(60);
		System.out.println(s1.capacity());
		s1.append(s);
		s1.trimToSize();
		System.out.println(s1.capacity());
		System.out.println(s1.indexOf("h"));
		System.out.println(s1.reverse());
	}
}
