package Grooming;

public class S {
	public static void main(String[] args) {
		String s="sos";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equals(s1)) {
			System.out.println("pallindrome");
		}
		else
			System.out.println("not a pallindrome");
	}

}
