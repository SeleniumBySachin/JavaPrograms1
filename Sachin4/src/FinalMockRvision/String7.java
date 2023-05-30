package FinalMockRvision;
//inside string class toString() & hashCode()&equals() is overriden
public class String7 {
	public static void main(String[] args) {
	String s="Sheela";
	String s1="Sheela";
	System.out.println(s);
	System.out.println(s.equals(s1));
	System.out.println(s.hashCode()==s1.hashCode());
}

}
