package Part3Revision;

public class P7 {
	public static void main(String[] args) {
		int[]a= {20,90,30,40};
		int largest1=0;
		int largest2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest1) {
				largest2=largest1;
				largest1=a[i];
			}
			else {
				if(a[i]>largest2) {
					largest2=a[i];
				}
			}
		}
		System.out.println("Largest1: "+largest1);
		System.out.println("Largest2 :"+largest2);
	}

}
