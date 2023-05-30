package FinalMockRvision;

public class String5 {
	public static void main(String[] args) {
		String s="   Sheela";
		System.out.println(s.toCharArray());
		System.out.println(s.charAt(5));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.contains("ee"));
		System.out.println(s.indexOf(0));
		System.out.println(s.indexOf("a"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(2,5));
		System.out.println(s.compareTo("Leela"));
		System.out.println(s.hashCode());
		System.out.println(s.equals("Leela"));
		System.out.println(s.getBytes());
		System.out.println(s.trim());
		System.out.println(s.startsWith("S"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.split("e"));
	}

}
