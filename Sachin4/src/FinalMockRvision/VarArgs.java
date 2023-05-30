package FinalMockRvision;

public class VarArgs {
	public static void main(String[] args) {
		System.out.println(varArgs(10,20));
		System.out.println(varArgs(10,20,30));
		System.out.println(varArgs(10,20,30,40));
	}
	public static int varArgs(int...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
