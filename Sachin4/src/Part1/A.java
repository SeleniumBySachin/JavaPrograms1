package Part1;

public class A {
	public static void main(String[] args) {
		int i=1;
		test(i);
	}
	static void test(int i) {
		System.out.print("*");
		i++;
		if(i>=5) {
	   return ;
		}
		test(i);
	}

}
