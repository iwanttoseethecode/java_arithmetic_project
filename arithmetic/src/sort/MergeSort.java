package sort;

import java.util.Random;

/*
 * �鲢����
 * ʱ�临�Ӷ� O(nlogn)
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
//		//�Ƚ�����С������Ӧ�±�λ�õ������С��С���ȷŽ�������
//		while(left<=middle&&rightStart<=right){
//			if(a[left]<=a[rightStart]){
//				tmpArray[third++] = a [left++];
//			}else{
//				tmpArray[third++] = a[rightStart++];
//			}
//		}
//		//�����߻���������Ҫ���������������ʣ�µĿ�����������
//		while(left<=middle){
//			tmpArray[third++] = a[left++];
//		}
//		//����ұ߻�������......
//		while(rightStart<=right){
//			tmpArray[third++] = a[rightStart++];
//		}
//		while(tmp<=right){
//			a[tmp] = tmpArray[tmp++];
//		}
//	}
	
	
}
