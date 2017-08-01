package insertionSort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = {11,1,154,54,2,10};
		intsertionSort(nums);
	
		for(int num : nums) {
			System.out.println(num);
		}
	}
	
	public static void intsertionSort(int[] nums) {
		for(int j = 1;j < nums.length;j++) {
			int key = nums[j];
			int i = j - 1;
			
			while(i >= 0 && nums[i] > key) {
				nums[i + 1] = nums[i];
				i = i - 1;
			}
			nums[i + 1] = key;
		}
	}
}
