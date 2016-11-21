package sort;

import java.util.Random;

/**
 * ���������㷨�����÷��η�ԭ��1������������һ��Ԫ������Ϊ�ֽ�ֵ������������Ԫ����ֽ�ֵ�Ƚϣ�С�ķ�������ߴ�ķ��ұߣ���󽫷ֽ�ֵ���뵽�����С�����ֵ��м�;
 *                        2�� �ٽ�����ֽ�ֵ�����������ֱַ����1���裬ͨ���ݹ�ϸ����ȥ��ֱ�������ٷ�Ϊֹ.
 *                        
 * ������ʾ���� c���������ָ�룬i�������ֽ�ֵҪ����ĵ㡣
 * 
 * 2   8   7   1   3   5   6   4(��Ԫ)   ��ʼ�� c,i,��2��4�Ƚϣ�2��4С�����Խ���4�Ĳ����Ӧ����2���ұ�;
 * |
 * c
 * i
 * 2   8   7   1   3   5   6   4(��Ԫ)   ��i��c������8,��8��4�Ƚϣ�8��4��i��Ϊ����㲻����
 *     |
 *     c
 *     i
 * 
 * 2   8   7   1   3   5   6   4(��Ԫ)   c�����Ƶ�7, ��7��4�Ƚϣ�,7��4��i��Ϊ����㲻����
 *     |   |
 *     i   c
 *     
 * 2   1   8   7   3   5   6   4(��Ԫ)   c�����Ƶ�3, ��3��4�Ƚϣ�,4��3�󣬽�3��8��������ʱ�������3���ұߣ�����i������һλ
 *         |       |
 *         i       c
 *         
 * 2   1   3   8   7   5   6   4(��Ԫ)   c�����Ƶ�5, ��5��4�Ƚϣ�,5��4��i��Ϊ����㲻��;
 *             |       |
 * 			   i       c
 * 2   1   3   8   7   5   6   4(��Ԫ)   c�����Ƶ�6, ��6��4�Ƚϣ�,6��4��i��Ϊ����㲻��;
 *             |           |
 *             i           c
 * 2   1   3   8   7   5   6   4(��Ԫ)    cָ��������ˣ����4��8������
 *             ^               ^
 *             |_______________|
 *             
 *            |    |
 * 2   1   3  | 4  | 8   7   5   6      ����ߡ��ұߵ�����ֱ�������ķ����ֳɴ�С�����֣�ͨ���ݹ�ϸ����ȥ��ֱ�������ٷ�Ϊֹ
 *     ���          |    |  �ұ�
 * */

public class QuickSort {
	public static void main(String[] args) {
//		int[] array = new int[]{2,8,7,1,3,5,6,4};
//		int[] array = new int[]{12,34,4,99,65,25,77,48,66,91,64,87,3};
		int[] array = new int[20];
		Random random = new Random();
		for(int i = 0;i<20;i++){
			array[i] = random.nextInt(100);
		}
		
		
		quickSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]);
		}
	}
	
	public static void quickSort(int[] array,int left,int right){
		//�ֽ�ֵ
		int boundValue;
		
		//insertsub ��Ϊ�ֽ�ֵ�Ĳ���һ�±�������ɺ󽫽��ֽ�ֵ������±��Ӧ��Ԫ��
		int insertsub;
		//�������ȡ������С��������������±ꡣ
		int cursorsub;
		
		insertsub = left;
		cursorsub = left;
		boundValue = array[right];
		while(cursorsub<right){
			if(array[cursorsub]<boundValue){
				int temp = array[cursorsub];
				array[cursorsub] = array[insertsub];
				array[insertsub] = temp;
				insertsub++;
			}
			cursorsub++;
		}

		array[right] = array[insertsub];
		array[insertsub] = boundValue;
		
		if(left<insertsub){
			quickSort(array,left,insertsub-1);
		}
		if(right>insertsub){
			quickSort(array,insertsub+1,right);
		}
	}
}
