package FinalMockRvision;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[]a= {20,30,10,50,40};
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int key=100;
		int count=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==a[mid]) {
				count++;
				break;
			}else if(key>=a[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(count==1) {
			System.out.println("Key is found");
		}else
			System.out.println("Key is not found");

	}

}
