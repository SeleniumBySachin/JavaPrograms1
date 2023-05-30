package Grooming;

public class S1 {
	public static void main(String[] args) {
		String s="Sheela";
		String s1=s;
		s=s+"Leela";
		System.out.println(s==s1);//false
		System.out.println(s);
		System.out.println(s1);  
		System.out.println("==========");
		
		StringBuilder sb=new StringBuilder("Sheela");
		StringBuilder sb1=sb;
		System.out.println(sb);
		System.out.println(sb1);
		sb.append("Leela");
		System.out.println(sb==sb1);//true
		System.out.println(sb);
		System.out.println(sb1);
	}

}
