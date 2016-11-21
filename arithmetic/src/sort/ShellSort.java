package sort;

import java.util.Random;

/**
 * shell排序算法
 * 原理 ： 将数组除2分组，从增量r开始遍历数组的元素，把元素跟之前分组内的元素比较进行插入排序，遍历完成后再除以2继续前面的操作，只要r>=1就继续循环。
 * */

public class ShellSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		Random r = new Random();
		System.out.print("排序前的数组为: ");
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
			System.out.print("第"+(++x)+"步排序结果: ");
			for (int h = 0; h < b.length; h++) {
				System.out.print(" "+b[h]);
			}
			System.out.println();
		}
	}
}
