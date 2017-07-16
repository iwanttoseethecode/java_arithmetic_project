package sort;

/**
 * 插入排序  
 * 原理：假定从小到大排序，从第二个数开始，把当前的数用一个变量保存起来，然后倒序依次跟前面的数比较，较大的数依次往后移，找到自己要插入的地方将数插入。如此往返循环将所有的树插入进去。
 * 时间复杂度 O(n^2)
 * */

import java.util.Random;

//public class InsertionSort {
//	public static void main(String[] args) {
//		int[] a = new int[100];
//		Random r = new Random();
//		System.out.print("排序前的数组为：");
//		for(int i =0 ;i<10;i++){
//			a[i] = r.nextInt(100);
//			System.out.print(" "+a[i]);
//		}
//		System.out.println();
//		insertSort(a);
//	}
//	
//	public static void insertSort(int[] b){
//		int theInsert,j;
//		for(int i=1;i<b.length;i++){
//			theInsert = b[i];
//			j = i-1;
//			while(j>=0 && b[j]>theInsert){
//				b[j+1]=b[j];
//				j--;
//			}
//			b[j+1]=theInsert;
//			
//			System.out.print("第"+i+"步排序结果：");
//			for(int h=0;h<b.length;h++){
//				System.out.print(" "+b[h]);
//			}
//			System.out.println();
//		}
//	}
//}


//public class InsertionSort{
//	public static void main(String[] args) {
//		int[] a = new int[20];
//		Random random = new Random();
//		for(int i=0;i<20;i++){
//			a[i] = random.nextInt(100);
//		}
//		insertSort(a);
//		
//		for(int num:a){
//			System.out.println(num);
//		}
//	}
//	
//	public static void insertSort(int[] b){
//		for(int i =1;i<b.length;i++){
//			int temp = b[i];
//			int j = i-1;
//			
//			while(j>0 && b[j]>temp){
//				b[j+1]=b[j];
//				j--;
//			}
//			
//			b[j+1] = temp;
//		}
//	}
//	
//}

//public class InsertionSort{
//	public static void main(String[] args) {
//		int[] a = new int[20];
//		
//		Random r = new Random();
//		for(int i=0;i<20;i++){
//			a[i] = r.nextInt(100);
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		insertionSort(a);
//		for(int num : a){
//			System.out.print(num+" ");
//		}
//	}
//
//	private static void insertionSort(int[] a) {
//		for(int i = 1; i<a.length;i++){
//			int temp = a[i];
//			int j = i-1;
//			while(j>=0 && a[j]>temp){
//				a[j+1] = a[j];
//				j--;
//			}
//			a[j+1] = temp;
//		}
//	}
//}

public class InsertionSort{
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for(int i =0 ;i<a.length;i++){
			a[i] = r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		insertSort(a);
		for(int num : a){
			System.out.print(num + " ");
		}
	}
	
	public static void insertSort(int[] a){
		/*for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j=i-1;

			while(j>=0 && a[j]>temp){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}*/
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[++j]=temp;
		}
	}
}
