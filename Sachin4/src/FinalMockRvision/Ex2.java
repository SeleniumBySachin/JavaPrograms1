package FinalMockRvision;
//Exception object propagation
public class Ex2 {
	public static void main(String[] args)throws Exception {
		System.out.println("Main");
		test(10,0);
		System.out.println("End");
	}
	public static void test(int a,int b) throws Exception{
		System.out.println("Hi");
		print(a,b);
		System.out.println("***");
	}
	public static void print(int a, int b)throws Exception {
		System.out.println("Bye");
		System.out.println(a/b);
		System.out.println("$$$$$");
	}

}
