package Part1;

public class P1 {
	static int a;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(P1.a);
		P1.a=10+P1.a;
		System.out.println(a);
		
	}

}
