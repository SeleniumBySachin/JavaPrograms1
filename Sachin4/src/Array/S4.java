package Array;

public class S4 {
	public static void main(String[] args) {
		String s="Sheela";
		char[]ch=new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s.charAt(i);
		}
		System.out.println(ch);
		System.out.println(s.equalsIgnoreCase("sheela"));
	}

}
