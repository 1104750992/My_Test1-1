package com.le.No6;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = {56,45,89,4541,123,45,1,2,0,158};
		SelectSort s1 = new SelectSort();
		s1.stor(array);
	}
	
	public void stor(int[] array) {
		int index ;
		for (int i = 1;i<array.length;i++) {
			index = 0;
			for (int j = 1;j<array.length - i ;j++) {
				if (array[j]> array[index]) {
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index ] = temp;
		}
		showArray(array);
	}
	public void showArray(int[] array) {
		for (int i :array) {
			System.out.print(">"+ i);
		}
		System.out.println();
	}

}
