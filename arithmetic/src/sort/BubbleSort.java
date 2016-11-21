package sort;

/**
 * 冒泡排序(原理是循环的将两个相邻的数进行比较，根据排序规律将数字交换，数字最大的将会排到数组的一端)
 * */

public class BubbleSort {
	
	private static int[] a = {57,21,4,6,8,12,5,36,1,33};
	
	public static void main(String[] args) {
		for (int i = 0; i < a.length-1; i++) {
			for(int j = 0; j<a.length-1-i;j++){
				int temp;
				if (a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.print("第"+(i+1)+"步排序结果：");
			for(int k=0;k<a.length;k++){
				System.out.print(" "+a[k]);
			}
			System.out.println();
		}
		
		for(int i = 0; i <a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
}
