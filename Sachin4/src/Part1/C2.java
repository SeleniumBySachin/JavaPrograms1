package Part1;

public class C2 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		int odd=0;
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				even=even=a[i];
			}
			else
				odd=odd+a[i];
		}
		System.out.println("odd: "+odd);
		System.out.println("even: "+even);
	}

}
