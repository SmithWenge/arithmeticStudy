package ÅÅĞò;

public class Ï£¶ûÅÅĞò {

	public static void shellSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int feet = arr.length / 2;
		int index = 0;
		while (feet > 0) {
			for (int i = feet; i < arr.length; i++) {
				index = i;
				while (index >= feet) {
					if (arr[index - feet] > arr[index]) {
						swap(arr, index - feet, index);
						index -= feet;
					} else {
						break;
					}
				}
			}
			feet /= 2;
		}
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int[] ints = {12,11,4,2,6,8,3,9,1};
		shellSort(ints);
		
		for(int i : ints) {
			System.out.println(i);
		}
	}
}
