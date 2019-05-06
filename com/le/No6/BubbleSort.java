package com.le.No6;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 64, 5, 6, 9, 54, 465, 156, 1 };
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);

	}

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		showArray(array);
	}

	public void showArray(int[] array) {
		for (int i : array) {
			System.out.print(">" + i);
		}
		System.out.println();

	}
}
