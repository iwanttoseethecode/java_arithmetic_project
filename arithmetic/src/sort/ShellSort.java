package sort;

import java.util.Random;

/**
 * shell�����㷨 (��һ�ֲ��ȶ������㷨)
 * ԭ�� �� �������2���飬������r��ʼ���������Ԫ�أ���Ԫ�ظ�֮ǰ�����ڵ�Ԫ�رȽϽ��в������򣬱�����ɺ����Ը�С����������ǰ��Ĳ�����ֻҪr>=1�ͼ���ѭ����
 * ʱ�临�Ӷ� O(n^1.3)
 * */

//public class ShellSort {
//	public static void main(String[] args) {
//		int[] a = new int[100];
//		Random r = new Random();
//		System.out.print("����ǰ������Ϊ: ");
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
//			System.out.print("��"+(++x)+"��������: ");
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
//		//��ʼ������
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
//		int d = a.length/2;//��ʼ������
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
