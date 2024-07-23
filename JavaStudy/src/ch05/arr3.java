package ch05;

import java.util.Arrays;

public class arr3 {
	public static void main(String[] args) {
		int[][] arr2 = { { 10, 20, 30, 80, 90 }, { 40, 50, 60 }, { 70, 80 }, { 100, 110, 120 } }; // {0} ,{1}, {2}, {3}
		for(int[] a : arr2) {
			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			
//			for(int b : a) {
//				System.out.println(b);
//			}
		}

//		System.out.println(arr2[2][2]); // 3번째 3번 값
//
//		int[] a = arr2[0]; // 1번째 결과 도출
//		System.out.println(Arrays.toString(a));

	}

}
