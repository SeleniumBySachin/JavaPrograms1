package Array;

public class S2 {
	public static void main(String[] args) {
		char[]ch= {'a','b','c','d'};
		String s=new String(ch);
		System.out.println(s);
		String s1=String.valueOf(ch);
		System.out.println(s1);
		String s2="";
		for (int i = 0; i < ch.length; i++) {
			s2=s2+ch[i];
		}
		System.out.println(s2);
	}

}
