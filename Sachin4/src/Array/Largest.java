package Array;

public class Largest {
	public static void main(String[] args) {
		int[]a= {20,30,40,50,10};
		int largest=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);
	}

}
