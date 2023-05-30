package Array;

public class P3 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int sum=0;
		int avg=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
			sum=sum+a[i];}
			else
				avg=avg+a[i];
		}
		System.out.println("even: "+sum);
		System.out.println("odd: "+avg);
	}

}
