package com.qqianqiangongzi;

/**
 * 插入排序
 *
 * @author 谦谦公子爱编程
 */
public class InsertionSort {
	/**
	 * 插入排序1
	 * 
	 * @param a
	 */
	public static void insertionSort1(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int minindex = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					break;
				}
				minindex++;
			}

			if (minindex != i) {
				int insertData = a[i];
				for (int k = i; k > minindex; k--) {
					a[k] = a[k - 1];
				}
				a[minindex] = insertData;
			}
		}
	}

	/**
	 * 插入排序2
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					// 接下来是无用功
					break;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arrs = { 9, 3, 6, 8, 1, 0, 7, 2, 9, 5, 3, 4 };

		insertionSort1(arrs);

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
	}
}
