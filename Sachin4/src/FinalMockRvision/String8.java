package FinalMockRvision;
//inside stringbuilder only toString() is overriden
public class String8 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Sheela");
		StringBuilder s1=new StringBuilder("Sheela");
		System.out.println(s);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		//StringBuilder s2="Sheela";there is no relationship
		
	}

}
