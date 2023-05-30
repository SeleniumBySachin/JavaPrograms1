package Part1;

public class A5 {
	static {
		System.out.println("hi");
	}
	static int a=test(10,20);
	{
		System.out.println("########");
	}
	static int b=10+test(20,40)+a;
	static int test(int a,int b) {
      System.out.println("*******");
      int res=a+b;
      return 50+res;
	}
	public static void main(String[] args) {
		System.out.println("MB");
		System.out.println(test(90,10));
		System.out.println(a);
		System.out.println(b);
		System.out.println("ME");
	}
	static {
		System.out.println("Bye");
	}
}
