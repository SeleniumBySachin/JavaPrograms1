package Grooming;

public class S3 {
	int a=test();
	public static void main(String[] args) {
		System.out.println("From main");
		S3 obj=new S3();
		System.out.println(obj.a);
		System.out.println(obj.test());
	}
	public int test() {
		System.out.println("From test");
		System.out.println("End test");
		return 30;
	}

}
