package Part3Revision;

public class D2 {
	public static void main(String[] args) {
		char[]ch= {'A','P','P','L','E'};
		String s=new String(ch);
		System.out.println(s);
		String s1=String.valueOf(ch);
		System.out.println(s1);
		String s2="";
		for(int i=0;i<ch.length;i++) {
			s2=s2+ch[i];
		}
		System.out.println(s2);
		String s3="";
		for(int i=ch.length-1;i>=0;i--) {
			s3=s3+ch[i];
		}
		System.out.println(s3);
		String s4="";
		for(int i=ch.length-1;i>ch.length/2;i--) {
			s4=ch[i]+s4;
		}
		System.out.println(s4);
		String s5="";
		for(int i=0;i<ch.length/2;i++) {
			s5=s5+ch[i];
		}
		System.out.println(s5);
	}

}
