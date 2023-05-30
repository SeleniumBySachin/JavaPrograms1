package Part3Revision;

public class S7 {
	public static void main(String[] args) {
		int []a= {20,10,40,30,60,50};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			int pos=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[pos]>a[j]) {
					pos=j;
				}
			}
			if(a[i]!=pos) {
				int tem=a[i];
				a[i]=a[pos];
				a[pos]=tem;
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
