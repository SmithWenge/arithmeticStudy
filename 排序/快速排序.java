package еепР;

public class ©ЛкыеепР {

	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		process(arr, 0, arr.length - 1);
	}

	public static void process(int[] arr, int left, int right) {
		if (left < right) {
			int random = left + (int) (Math.random() * (right - left + 1));
			swap(arr, random, right);
			int mid = partition(arr, left, right);
			process(arr, left, mid - 1);
			process(arr, mid + 1, right);
		}
	}

	public static int partition(int[] arr, int left, int right) {
		int pivot = left - 1;
		int index = left;
		while (index <= right) {
			if (arr[index] <= arr[right]) {
				swap(arr, ++pivot, index);
			}
			index++;
		}
		return pivot;
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int[] ints = {12,11,4,2,6,8,3,9,1};
		quickSort(ints);
		
		for(int i : ints) {
			System.out.println(i);
		}
	}

}