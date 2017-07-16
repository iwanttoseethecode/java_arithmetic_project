package sort;

import java.util.Random;

/*
 * 归并排序
 * 时间复杂度 O(nlogn)
 * */

public class MergeSort {
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for(int i = 0; i<20;i++){
			a[i] = r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		mergeSort(a,0,a.length-1);
		
		for(int num : a){
			System.out.print(num+" ");
		}
		
	}

	private static void mergeSort(int[] a, int left, int right) {
		if(left<right){
			int middle = (left+right)/2;
			mergeSort(a,left,middle);
			mergeSort(a,middle+1,right);
			merge(a,left,middle,right);
		}
	}

	private static void merge(int[] a, int left, int middle, int right) {
		int[] tmpArray = new int[a.length];
		int rightStart = middle+1;
		int tmp = left;
		int third = left;
		
		while(left<=middle&&rightStart<=right){
			if(a[left]<=a[rightStart]){
				tmpArray[third++]=a[left++];
			}else{
				tmpArray[third++]=a[rightStart++];
			}
		}
		
		while(left<=middle){
			tmpArray[third++]=a[left++];
		}
		while(rightStart<=right){
			tmpArray[third++]=a[rightStart++];
		}
		while(tmp<=right){
			a[tmp] = tmpArray[tmp++];
		}
	}

//	private static void mergeSort(int[] a, int left, int right) {
//		if(left<right){
//			int middle = (left+right)/2;
//			mergeSort(a,left,middle);
//			mergeSort(a,middle+1,right);
//			merge(a,left,middle,right);
//		}
//	}
//
//	private static void merge(int[] a, int left, int middle, int right) {
//		int[] tmpArray = new int[a.length];
//		int rightStart = middle+1;
//		int tmp = left;
//		int third = left;
//		
//		while(left<=middle&&rightStart<=right){
//			if(a[left]<=a[rightStart]){
//				tmpArray[third++]=a[left++];
//			}else{
//				tmpArray[third++]=a[rightStart++];
//			}
//		}
//		
//		while(left<=middle){
//			tmpArray[third++]=a[left++];
//		}
//		while(rightStart<=right){
//			tmpArray[third++]=a[rightStart++];
//		}
//		while(tmp<=right){
//			a[tmp] = tmpArray[tmp++];
//		}
//		
//	}

//	private static void mergeSort(int[] a, int left, int right) {
//		if(left<right){
//			int middle = (left+right)/2;
//			mergeSort(a,left,middle);
//			mergeSort(a,middle+1,right);
//			merge(a,left,middle,right);
//		}
//	}
//
//	private static void merge(int[] a, int left, int middle, int right) {
//		int [] tmpArray = new int[a.length];
//		int rightStart = middle+1;
//		int tmp = left;
//		int third = left;
//		//比较两个小数组相应下标位置的数组大小，小的先放进新数组
//		while(left<=middle&&rightStart<=right){
//			if(a[left]<=a[rightStart]){
//				tmpArray[third++] = a [left++];
//			}else{
//				tmpArray[third++] = a[rightStart++];
//			}
//		}
//		//如果左边还有数据需要拷贝，把左边数组剩下的拷贝到新数组
//		while(left<=middle){
//			tmpArray[third++] = a[left++];
//		}
//		//如果右边还有数据......
//		while(rightStart<=right){
//			tmpArray[third++] = a[rightStart++];
//		}
//		while(tmp<=right){
//			a[tmp] = tmpArray[tmp++];
//		}
//	}
	
	
}
