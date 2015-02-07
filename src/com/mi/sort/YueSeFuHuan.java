package com.mi.sort;

import java.util.Arrays;
import java.util.Scanner;

public class YueSeFuHuan {
	/** * 10个人围一桌报数问题 */
	private static int count = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入人数：");
		int n = scanner.nextInt();
		System.out.println("请输入出局号码：");
		int m = scanner.nextInt();
		sortP(n, m);
	}

	private static void sortP(int n, int m) {
		if (n == 1) {
			System.out.println(n);

		} else {
			f1(n, m);
		}
	}

	private static void f1(int n, int m) {
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				count++;
				if (j > 0) {
					measure(j, arr);

				}
				if (count > n) {
					count = 1;
					measure(j, arr);
				}
			}
			arr[j] = count;
		}
		System.out.println("出局顺序为：" + Arrays.toString(arr));
		System.out.println("最后出局人为：" + arr[n - 1]);
	}

	private static void measure(int n, int[] arr) {
		for (int s = 0; s < n; s++) {
			for (int w = 0; w < n; w++) {
				if (count == arr[w])
					count++;
			}
		}
	}
}