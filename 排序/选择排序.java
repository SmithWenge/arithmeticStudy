package ≈≈–Ú;


public class —°‘Ò≈≈–Ú {

	public static void selectSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int mini = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				mini = arr[mini] > arr[j] ? j : mini;
			}
			swap(arr, i, mini);
		}
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	public static void main(String[] args) {
		int[] ints = {12,11,4,2,6,8,3,9,1};
		selectSort(ints);
		
		for(int i : ints) {
			System.out.println(i);
		}
		
	}
}