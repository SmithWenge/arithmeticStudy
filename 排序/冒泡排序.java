package ����;

public class ð������ {
    public static int[] bubbleSort(int[] a, int n) {
    	
        for (int i = 0; i < n - 1; i++) {//Ҫ����n-1��
        	boolean finish = true;//ĳһ��û��������˵������������
            for (int j = 0; j < n - i - 1; j++) {//a[0...n-i-1]��ð��
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
