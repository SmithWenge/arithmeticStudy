package ≈≈–Ú;

public class ≤Â»Î≈≈–Ú {

	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			index = i;
			while (index > 0) {
				if (arr[index - 1] > arr[index]) {
					swap(arr, index - 1, index);
					index--;
				} else {
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int[] ints = {12,11,4,2,6,8,3,9,1};
		insertionSort(ints);
		
		for(int i : ints) {
			System.out.println(i);
		}
	}
}
