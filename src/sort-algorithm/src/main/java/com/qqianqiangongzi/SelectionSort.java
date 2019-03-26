package com.qqianqiangongzi;

/**
 * 选择排序算法
 *
 * @author 谦谦公子爱编程
 */
public class SelectionSort {
	/**
	 * 选择排序
	 * 
	 * @param a
	 *            待排序的数组
	 */
	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i]; // 保存最小的值
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[k]) { // 如果出现比当前值小，则保存最小值的下标
					k = j;
				}
			}
			if (k != i) { // i为最小值，不用替换
				min = a[k];
				a[k] = a[i];
				a[i] = min;
			}
		}
	}

	public static void main(String[] args) {
		int[] arrs = { 9, 3, 6, 8, 1, 0, 7, 2, 9, 5, 3, 4 };

		selectionSort(arrs);

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}
}
