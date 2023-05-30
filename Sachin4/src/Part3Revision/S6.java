package Part3Revision;

public class S6 {
	public static void main(String[] args) {
		int[]a= {20,30,40,10};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
