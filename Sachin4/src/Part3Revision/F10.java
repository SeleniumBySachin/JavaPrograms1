package Part3Revision;

public class F10 {
	public static void main(String[] args) {
		 add();
		 add(10,20);
		 add(10,20,30);
		 add(10,20,30,40);
	}
	 static void add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		//System.out.println(a.length);
		System.out.println(sum);
	}

}
