package FinalRevision;

public class P {
	public static void main(String[] args) {
		System.out.println(test()>print()?test():print());
	}
	static int test() {
		return 10;
	}
	static int print() {
		return 20;
	}
}