package Part1;

public class C5 {
	public static void main(String[] args) {
		int[]a= {50,30,10,20,40};
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
