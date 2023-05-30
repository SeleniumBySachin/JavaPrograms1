package GroomingClass;

public class CharArray {
	public static void main(String[] args) {
		char[]ch= {'a','b','c','d'};
		String s="";
		for(int i=0;i<ch.length;i++) {
			s=ch[i]+s;
		}
		System.out.println(s);
	}

}
