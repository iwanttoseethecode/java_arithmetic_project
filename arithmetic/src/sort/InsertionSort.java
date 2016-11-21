package sort;

/**
 * ��������  
 * ԭ���ٶ���С�������򣬴ӵڶ�������ʼ���ѵ�ǰ������һ����������������Ȼ�������θ�ǰ������Ƚϣ��ϴ�������������ƣ��ҵ��Լ�Ҫ����ĵط��������롣�������ѭ�������е��������ȥ��
 * */

import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		Random r = new Random();
		System.out.print("����ǰ������Ϊ��");
		for(int i =0 ;i<10;i++){
			a[i] = r.nextInt(100);
			System.out.print(" "+a[i]);
		}
		System.out.println();
		insertSort(a);
	}
	
	public static void insertSort(int[] b){
		int theInsert,j;
		for(int i=1;i<b.length;i++){
			theInsert = b[i];
			j = i-1;
			while(j>=0 && b[j]>theInsert){
				b[j+1]=b[j];
				j--;
			}
			b[j+1]=theInsert;
			
			System.out.print("��"+i+"����������");
			for(int h=0;h<b.length;h++){
				System.out.print(" "+b[h]);
			}
			System.out.println();
		}
	}
}
