package com.qqianqiangongzi;

/**
 * 快速排序
 *
 * @author 谦谦公子爱编程
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] arrs = { 9, 3, 6, 8, 1, 0, 7, 2, 9, 5, 3, 4 };

		quickSort(arrs, 0, arrs.length - 1);

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}

	/**
	 * 快速排序
	 *
	 * @param a
	 *            待排序的数组
	 * @param l
	 *            数组的左边界(例如，从起始位置开始排序，则l=0)
	 * @param r
	 *            数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
	 */
	private static void quickSort(int[] a, int l, int r) {
		if (l > r) {
			return;
		}

		int i = l;
		int j = r;
		int x = a[i]; // 占用的一个空间
		while (i < j) {
			while (i < j && a[j] > x) {
				j--;// 从右向左找第一个小于x的数
			}
			if (i < j) {
				a[i++] = a[j];
			}
			while (i < j && a[i] < x) {
				i++;// 从左向右找第一个大于x的数
			}
			if (i < j) {
				a[j--] = a[i];
			}
		}

		a[i] = x;
		quickSort(a, l, i - 1);
		quickSort(a, i + 1, r);

	}
}