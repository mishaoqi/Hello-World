package com.mi.sort;

public class Choose {

	public static void main(String[] args) {
		int[] a = { 25, 66, 12, 58, 15, 16, 58, 47, 22, 100 };
		int max = 0;
		int tmp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			// 将最大值赋给max
			max = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[max] < a[j]) {
					max = j;
				}
				if (i != max) {
					tmp = a[i];
					a[i] = a[max];
					a[max] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i] + " ");
	}
}