package FinalMockRvision;

public class Wrap5 {
	public static void main(String[] args) {
		test('A');
	}
	static void test(char a) {
		System.out.println("char");
	}
	static void test(Character a) {
		System.out.println("Character");
	}
	static void test(int a) {
		System.out.println("int");
	}
	  static void test(Object a) {
		System.out.println("Object");
	}

}
