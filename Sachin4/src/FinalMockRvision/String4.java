package FinalMockRvision;
//conversion of string into char[]  
public class String4 {
	public static void main(String[] args) {
		String s="Sheela";
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("==========");
		String s1=new String("Leela");
		System.out.println(s1.length());
		char[]ch1=new char[s1.length()];
		for (int i = 0; i < ch1.length; i++) {
			ch1[i]=s1.charAt(i);
		}
		System.out.println(ch1);
	}

}
