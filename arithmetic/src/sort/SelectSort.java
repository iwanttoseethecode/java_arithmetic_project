package sort;

import java.util.Random;

/**
 * ѡ������(ԭ���ǽ�����ʣ����С<���>����������ǰ��) ʱ�临�Ӷ� O(n^2)
 * */

//public class SelectSort {
//	public static void main(String[] args) {
//		int[] a = {45,23,64,12,77,85,34,60,5,8,100,44};
//		
//		selectsort(a);
//		for(int i = 0;i<a.length;i++){
//			System.out.print(" "+a[i]);
//		}
//	}
//	
//	/**
//	 * ��С��������
//	 * */
//	 public static void selectsort(int[] b){
//		int index;
//		int temp;
//		
//		for(int i=0;i<b.length-1;i++){
//			index = i;
//			for(int j=i+1;j<=b.length-1;j++){
//				if(b[index]>b[j]){
//					index = j;
//				}
//			}
//			temp = b[i];
//			b[i] = b[index];
//			b[index] = temp;
//			
//			System.out.print("��"+(i+1)+"����������");
//			for(int k=0;k<b.length;k++){
//				System.out.print(" "+b[k]);
//			}
//			System.out.println();
//		}e
//		
//	}
//	
//}


//public class SelectSort{
//	
//	public static int[] a = {45,23,64,12,77,85,34,60,5,8,100,44};
//	
//	public static void main(String[] args) {
//		for(int i=0;i<a.length;i++){
//			int max = a[a.length-i-1];
//			int temp = 0;
//			for(int j=0;j<a.length-i;j++){
//				if(a[j]>max){
//					temp = a[j];
//					a[j] = max;
//					max = temp;
//				}
//			}
//			a[a.length-i-1] = max;
//		}
//		
//		for(int num:a){
//			System.out.println(num);
//		}
//	}
//}

//public class SelectSort{
//	public static void main(String[] args){
//		int[] a = new int[20];
//		
//		Random r = new Random();
//		
//		for(int i = 0; i < 20; i++){
//			a[i] = r.nextInt(100);
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		selectSort(a);
//		
//		for(int num : a){
//			System.out.print(num+" ");
//		}
//	}
//
//	private static void selectSort(int[] a) {
//		for(int i = 0; i<a.length;i++){
//			int temp = 0;
//			for(int j = 0;j<a.length-i-1;j++){
//				if(a[j]>a[a.length-i-1]){
//					temp = a[j];
//					a[j] = a[a.length-i-1];
//					a[a.length-i-1] = temp;
//				}
//			}
//		}
//	}
//}

public class SelectSort{
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for(int i=0;i<20;i++){
			a[i] = r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		selectSort(a);
		for(int num : a){
			System.out.print(num+" ");
		}
	}
	
	public static void selectSort(int[] a){
		/*for(int i=0;i<a.length;i++){
			int temp = 0;
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[a.length-i-1]){
					temp = a[j];
					a[j]=a[a.length-i-1];
					a[a.length-i-1]=temp;
				}
			}
			
		}*/
		
		for(int i=0;i<a.length;i++){
			int maxSub = 0;
			int temp = 0;
			for(int j=0;j<a.length-i;j++){
				if(a[maxSub]<a[j]){
					maxSub = j;
				}
			}
			temp = a[maxSub];
			a[maxSub]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}
	
}