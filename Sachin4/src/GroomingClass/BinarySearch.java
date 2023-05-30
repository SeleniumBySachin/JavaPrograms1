package GroomingClass;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[]a= {20,10,40,70,5,30};
		Arrays.sort(a);
		int low=0;
		int high=a.length-1;
		int count=0;
		int key=70;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==a[mid]) {
				count++;
			break;}
			else if(key>a[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(count==1)
			System.out.println("key is found");
		else
			System.out.println("key is not found");
	}

}
