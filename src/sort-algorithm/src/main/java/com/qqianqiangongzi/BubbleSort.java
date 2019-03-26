package com.qqianqiangongzi;

/**
 * 冒泡排序
 *
 * @author 谦谦公子爱编程
 */
public class BubbleSort {
	/**
	 * 冒泡排序1 直接排序
	 * 
	 * @param a
	 *            待排序的数组
	 */
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					int t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arrs = { 9, 3, 6, 8, 1, 0, 7, 2, 9, 5, 3, 4 };

		bubbleSort(arrs);

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}
}
