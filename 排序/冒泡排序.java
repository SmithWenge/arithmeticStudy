package 排序;

public class 冒泡排序 {
    public static int[] bubbleSort(int[] a, int n) {
    	
        for (int i = 0; i < n - 1; i++) {//要进行n-1次
        	boolean finish = true;//某一次没做交换，说明已整体有序
            for (int j = 0; j < n - i - 1; j++) {//a[0...n-i-1]做冒泡
                if (a[j] > a[j+1]) {
                	finish = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if (finish) {
            	break;
            }
        }
        
        return a;
    }
    
    public static void main(String[] args) {
    	int[] ints = {2,5,3,6,1,9,18,11,7};
		bubbleSort(ints, 9);
		
		for(int i : ints) {
			System.out.println(i);
		}
	}
}
