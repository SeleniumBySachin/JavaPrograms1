
public class S {
	int a=test();
	public static void main(String[] args) {
		System.out.println("MB");
		S obj=new S();
		obj.test();
	}
	public int test() {
		System.out.println("TB");
		System.out.println(this);
		System.out.println(a);
		System.out.println("TE");
		return 30;
	}
}
