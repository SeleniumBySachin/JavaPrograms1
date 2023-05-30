package Part3Revision;

import java.util.Scanner;

public class S8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []a= {20,10,40,50,30};
		System.out.println("Enter searching key");
		int key=s.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println(key+" :is found in array");
		}
		else
			System.out.println(key+" :is not found in array");
	}

}
