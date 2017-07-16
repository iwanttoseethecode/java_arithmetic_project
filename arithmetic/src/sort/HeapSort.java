package sort;

import java.util.Random;

//堆排序   时间复杂度 O(nlogn)
//public class HeapSort {   //(1)
//		public static void main(String[] args) {
//			HeapSort heapSort = new HeapSort();
//			int[] array = { 19, 8, 27, 6, 35, 14, 3, 12, 1, 0, 9, 10, 7 };
//
//			System.out.println("Before heap:");
//			heapSort.printArray(array);
//
//			heapSort.heapSort(array);
//
//			System.out.println("After heap sort:");
//			heapSort.printArray(array);
//		}
//
//		public void heapSort(int[] array) {
//			if (array == null || array.length <= 1) {
//				return;
//			}
//			buildMaxHeap(array);//建立最大堆
//			for (int i = array.length - 1; i >= 1; i--) {
//				//最大的在0位置，那么开始沉降，这样每交换一次最大的值就丢到最后了
//				exchangeElements(array, 0, i);
//				//继续获取0位置最大值
//				maxHeap(array, i, 0);
//			}
//		}
//
//		//(2)		//建立最大堆
//		private void buildMaxHeap(int[] array) {
//			if (array == null || array.length <= 1) {
//				return;
//			}
//			int half = (array.length-1) / 2;
//			for (int i = half; i >= 0; i--) {
//				maxHeap(array, array.length, i);
//			}
//		}
//
//		private void maxHeap(int[] array, int heapSize, int index) {
//			int left = index * 2 + 1;
//			int right = index * 2 + 2;
//			int largest = index;
//			if (left < heapSize && array[left] > array[index]) {
//				largest = left;
//			}
//			if (right < heapSize && array[right] > array[largest]) {
//				largest = right;
//			}
//			if (index != largest) {
//				exchangeElements(array, index, largest);
//
//				maxHeap(array, heapSize, largest);
//			}
//		}
//		
////（3）		
//		public void printArray(int[] array) {  
//            System.out.print("{");  
//            for (int i = 0; i < array.length; i++) {  
//                System.out.print(array[i]);  
//                if (i < array.length - 1) {  
//                    System.out.print(", ");  
//                }  
//            }  
//            System.out.println("}");  
//        }  
//		
//		
//		public void exchangeElements(int[] array, int index1, int index2) {  
//            int temp = array[index1];  
//            array[index1] = array[index2];  
//            array[index2] = temp;  
//        }  
//	}


public class HeapSort{
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		
		for(int i = 0; i<20;i++){
			a[i] = r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		heapSort(a);
		
		for(int num : a){
			System.out.print(num+" ");
		}
	}

	private static void heapSort(int[] a) {
		buildMaxHeap(a);
		
		for(int i=a.length-1;i>0;i--){
			exChangeElements(a, i, 0);
			maxHeap(a,i,0);
		}
	}

	private static void buildMaxHeap(int[] a) {
		for(int i = a.length/2;i>=0;i--){
			maxHeap(a,a.length,i);
		}
	}

	private static void maxHeap(int[] a, int length, int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		int large = i;
		if(left<length && a[i]<a[left]){
			large=left;
		}
		if(right<length && a[large]<a[right]){
			large=right;
		}
		
		if(large!=i){
			exChangeElements(a,large,i);
			maxHeap(a,length,large);
		}
	}

	private static void exChangeElements(int[] a, int large, int i) {
		int temp = a[i];
		a[i] = a[large];
		a[large] = temp;
	}

//	private static void heapSort(int[] a) {
//		buildMaxHeap(a);
//		
//		for(int i=a.length-1;i>0;i--){
//			exChangeElements(a, i, 0);
//			maxHeap(a,i,0);
//		}
//	}
//
//	private static void buildMaxHeap(int[] a) {
//		for(int i = a.length/2;i>=0;i--){
//			maxHeap(a,a.length,i);
//		}
//	}
//
//	private static void maxHeap(int[] a, int length, int i) {
//		int left = 2*i+1;
//		int right = 2*i+2;
//		int large = i;
//		if(left<length && a[i]<a[left]){
//			large = left;
//		}
//		if(right<length && a[right]>a[large]){
//			large = right;
//		}
//		
//		if(large!=i){
//			exChangeElements(a,large,i);
//			maxHeap(a,length,large);
//		}
//		
//	}
//
//	private static void exChangeElements(int[] a, int large, int i) {
//		int temp = 0;
//		temp = a[large];
//		a[large] = a[i];
//		a[i] = temp;
//	}
	
	

//	private static void heapSort(int[] a) {
//		buildMaxHeap(a);
//		
//		for(int i = a.length-1;i>=0;i--){
//			exChangeElements(a, i, 0);
//			maxHeap(a, i, 0);
//		}
//		
//	}
//
//	private static void buildMaxHeap(int[] a) {
//		
//		for(int i = a.length/2;i>=0;i--){
//			maxHeap(a,a.length,i);
//		}
//	}
//
//	private static void maxHeap(int[] a, int length, int i) {
//		int left = i*2+1;
//		int right = i*2+2;
//		int largest = i;
//		
//		
//		if(left<length && a[left]>a[largest]){
//			largest = left;
//		}
//		if(right<length && a[right]>a[largest]){
//			largest = right;
//		}
//		
//		if(largest != i){
//			exChangeElements(a,largest,i);
//			maxHeap(a,length,largest);
//		}
//	}
//
//	private static void exChangeElements(int[] a, int largest, int i) {
//		int temp = a[largest];
//		a[largest]=a[i];
//		a[i]=temp;
//		
//	}

//	private static void heapSort(int[] a) {
//		
//		buildMaxHeap(a);
//		
//		for(int i=a.length-1;i>0;i--){
//			exChangeElements(a, 0, i);
//			maxHeap(a, i, 0);
//		}
//		
//	}
//	
//	//建立最大堆
//	private static void buildMaxHeap(int[] a){
//		int half = a.length/2;
//		
//		for(int i = half;i>=0;i--){
//			maxHeap(a,a.length,i);
//		}
//	}
//
//	private static void maxHeap(int[] a, int length, int i) {
//		int leftChild = i*2+1;
//		int rightChild = i*2+2;
//		int largest = i;
//		
//		if(leftChild<length && a[i]<a[leftChild]){
//			largest = leftChild;
//		}
//		if(rightChild<length && a[largest]<a[rightChild]){
//			largest = rightChild;
//		}
//		if(largest != i){
//			exChangeElements(a,largest,i);
//			maxHeap(a,length,largest);
//		}
//	}
//
//	private static void exChangeElements(int[] a, int j, int i) {
//		int temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//	}
	
	
}