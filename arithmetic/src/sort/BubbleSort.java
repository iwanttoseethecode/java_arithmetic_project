package sort;

import java.util.Random;

/**
 * 冒泡排序(原理是循环的将两个相邻的数进行比较，根据排序规律将数字交换，数字最大的将会排到数组的一端)  时间复杂度你 O(n^2)
 * */

//public class BubbleSort {
//	
//	private static int[] a = {57,21,4,6,8,12,5,36,1,33};
//	
//	public static void main(String[] args) {
//		for (int i = 0; i < a.length-1; i++) {
//			for(int j = 0; j<a.length-1-i;j++){
//				int temp;
//				if (a[j]>a[j+1]) {
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//			System.out.print("第"+(i+1)+"步排序结果：");
//			for(int k=0;k<a.length;k++){
//				System.out.print(" "+a[k]);
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i <a.length;i++){
//			System.out.print(" "+a[i]);
//		}
//	}
//}


//public class BubbleSort{
//	
//	private static int[] a = {57,21,4,6,8,12,5,36,1,33};
//	
//	public static void main(String[] args){
//		for(int i=0;i<a.length-1;i++){
//			int temp = 0;
//			for(int j=0;j<a.length-1-i;j++){
//				if(a[j]>a[j+1]){
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//		
//		for(int i =0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//	}
//}

//public class BubbleSort{
//	public static void main(String[] args) {
//		int[] a = new int[20];
//		Random r = new Random();
//		
//		for(int i = 0 ; i<20;i++){
//			a[i] = r.nextInt(100);
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println();
//		
//		bubbleSort(a);
//		for(int num : a){
//			System.out.print(num+" ");
//		}
//	}
//	
//	private static void bubbleSort(int[] a){
//		for(int i=0;i<a.length;i++){
//			int temp = 0;
//			for(int j = 0;j<a.length-i-1;j++){
//				if(a[j]>a[j+1]){
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//	}
//}

public class BubbleSort{
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for(int i=0;i<20;i++){
			a[i]=r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		bubbleSort(a);
		for(int num : a){
			System.out.print(num+" ");
		}
	}
	
	public static void bubbleSort(int[] a){
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				int temp =0;
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}*/
		for(int i = 0; i<a.length-1; i++){
			for(int j=0;j<a.length-1-i;j++){
				int temp = 0;
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}