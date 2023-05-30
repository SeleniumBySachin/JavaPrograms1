package Part3Revision;

public class P6 {
	public static void main(String[] args) {
		int[]a= {20,90,30,40};
		int largest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("Largest no is: "+largest);
	}

}
