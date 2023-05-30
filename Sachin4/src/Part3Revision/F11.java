package Part3Revision;

public class F11 {
	public static void main(String[] args) {
		int []a= {10,20};
		add(a);
	}
	static void add(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
