package FinalMockRvision;
//conversion of ch[] into String
public class String3 {
	public static void main(String[] args) {
		char[]ch= {'A','p','p','l','e'};
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
