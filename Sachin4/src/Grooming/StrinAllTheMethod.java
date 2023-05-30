package Grooming;

public class StrinAllTheMethod {
	public static void main(String[] args) {
	  String s="Channa";
	  String s1="Sheela";
	  System.out.println(s.toLowerCase());
	  System.out.println(s.toUpperCase());
	  System.out.println(s.concat(s1));
	  System.out.println(s.contains("a"));
	  System.out.println(s.indexOf("a"));
	  System.out.println(s.substring(2));
	  System.out.println(s1.indexOf("S"));
	  System.out.println(s1.substring(1, 4));
	  String s2="Channa is a bad boy";
	  byte[]c=s2.getBytes();
	 for(int i=0;i<c.length;i++) {
		 System.out.print((char)c[i]);
	 }
		 
	 }
}