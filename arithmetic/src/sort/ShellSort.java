package sort;

import java.util.Random;

/**
 * shell�����㷨
 * ԭ�� �� �������2���飬������r��ʼ���������Ԫ�أ���Ԫ�ظ�֮ǰ�����ڵ�Ԫ�رȽϽ��в������򣬱�����ɺ��ٳ���2����ǰ��Ĳ�����ֻҪr>=1�ͼ���ѭ����
 * */

public class ShellSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		Random r = new Random();
		System.out.print("����ǰ������Ϊ: ");
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(100);
			System.out.print(" "+a[i]);
		}
		System.out.println();
		shellSort(a);
	}
	
	public static void shellSort(int[] b){
		int temp;
		int x = 0;
		for(int r = b.length/2;r>=1;r/=2){
			for(int i = r;i<b.length;i++){
				temp = b[i];
				int j = i-r;
				while(j>=0 && temp<b[j]){
					b[j+r] = b[j];
					j-=r;
				}
				b[j+r] = temp;
			}
			System.out.print("��"+(++x)+"��������: ");
			for (int h = 0; h < b.length; h++) {
				System.out.print(" "+b[h]);
			}
			System.out.println();
		}
	}
}
