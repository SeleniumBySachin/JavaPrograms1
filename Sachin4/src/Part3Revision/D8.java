package Part3Revision;

public class D8 {
	public static void main(String[] args) {
		String s="TRIRT";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s);
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
