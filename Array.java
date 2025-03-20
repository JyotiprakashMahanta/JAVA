package Revision;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int nums[]= {3,43,23,0,-5,02};
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(nums));
		
		int nums1[][]= {
				{2,3,4,-1},
				{33,44,22,-234,43}
		};
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums1[i].length; j++) {
				System.out.print(nums1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
