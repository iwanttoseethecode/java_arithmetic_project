package sort;

import java.util.Random;

/**
 * shell排序算法 (是一种不稳定排序算法)
 * 原理 ： 将数组除2分组，从增量r开始遍历数组的元素，把元素跟之前分组内的元素比较进行插入排序，遍历完成后再以更小的增量继续前面的操作，只要r>=1就继续循环。
 * 时间复杂度 O(n^1.3)
 * */

//public class ShellSort {
//	public static void main(String[] args) {
//		int[] a = new int[100];
//		Random r = new Random();
//		System.out.print("排序前的数组为: ");
//		for (int i = 0; i < a.length; i++) {
//			a[i]=r.nextInt(100);
//			System.out.print(" "+a[i]);
//		}
//		System.out.println();
//		shellSort(a);
//	}
//	
//	public static void shellSort(int[] b){
//		int temp;
//		int x = 0;
//		for(int r = b.length/2;r>=1;r--){
//			for(int i = r;i<b.length;i++){
//				temp = b[i];
//				int j = i-r;
//				while(j>=0 && temp<b[j]){
//					b[j+r] = b[j];
//					j-=r;
//				}
//				b[j+r] = temp;
//			}
//			System.out.print("第"+(++x)+"步排序结果: ");
//			for (int h = 0; h < b.length; h++) {
//				System.out.print(" "+b[h]);
//			}
//			System.out.println();
//		}
//	}
//}

public class ShellSort{
	public static void main(String[] args){
		int[] a = new int[20];
		
		Random r =new Random();
		
		for(int i = 0;i<20;i++){
			a[i] = r.nextInt(100);
			System.out.print (a[i]+" ");
		}
		System.out.println();
		shellSort(a);
		for(int num:a){
			System.out.print(num+" ");
		}
	}

	private static void shellSort(int[] a) {
		/*int d = a.length/2;
		for(;d>=0;d--){
			for(int j=0;j<d;j++){
				int temp = 0;
				for(int n = j;n+d<a.length;n+=d){
					if(a[n]>a[n+d]){
						temp = a[n];
						a[n] = a[n+d];
						a[n+d]=temp;
					}
				}
			}
		}*/
		
		int d = a.length/2;
		for(;d>0;d--){
			for(int j = 0;j<d;j++){
				int temp = 0;
				for(int n =j;n+d<a.length;n+=d){
					if(a[n]>a[n+d]){
						temp = a[n];
						a[n] = a[n+d];
						a[n+d] = temp;
					}
				}
			}
		}
	}

//	private static void shellSort(int[] a) {
//		
//		//初始化增量
//		int d = a.length/2;
//		for(;d>=1;d--){
//			for(int j=0;j<d;j++){
//				int temp = 0;
//				for(int n = j;n+d<a.length;n+=d){
//					if(a[n]>a[n+d]){
//						temp = a[n];
//						a[n] = a[n+d];
//						a[n+d] = temp;
//					}
//				}
//			}
//		}
//		
//	}
	
//	private static void shellSort(int[] a){
//		int d = a.length/2;//初始化增量
//		
//		while(d>0){
//			
//			for(int i = 0; i<d ;i++){
//				int temp = 0;
//				for(int j = i;j+d<a.length;j+=d){
//					if(a[j]>a[j+d]){
//						temp = a[j];
//						a[j] = a[j+d];
//						a[j+d]= temp;
//					}
//				}
//			}
//			
//			d--;
//		}
//	}
}
