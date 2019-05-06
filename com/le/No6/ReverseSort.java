package com.le.No6;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = {10,12,23,36,65,58,98,85};
		ReverseSort r1 = new ReverseSort();
		r1.sort(array);

	}
	
	public void sort(int[] array) {
		System.out.println("原数组");
		showArray(array);
		
		int temp;
		int len = array.length;
		for(int i = 0;i<len/2;i++) {
			temp =  array[i];
			array[i] = array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.println("现数组");
		showArray(array);
		
	}
	
	
	
	public void showArray(int[] array) {
		for(int i:array) {
			System.out.print("\t"+i);
		}
		System.out.println();
	}

}
