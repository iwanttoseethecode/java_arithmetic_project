package sort;

import java.util.Random;

/**
 * 快速排序算法，采用分治法原理：1、将数组的最后一个元素设置为分界值，将整个数组元素与分界值比较，小的放数组左边大的放右边，最后将分界值插入到数组大小两部分的中间;
 *                        2、 再将数组分界值的左右两部分分别进行1步骤，通过递归细化下去，直到不能再分为止.
 *                        
 * 下面演示方法 c代表遍历的指针，i代表将来分界值要插入的点。
 * 
 * 2   8   7   1   3   5   6   4(主元)   初始化 c,i,将2和4比较，2比4小，所以将来4的插入点应该再2的右边;
 * |
 * c
 * i
 * 2   8   7   1   3   5   6   4(主元)   将i，c向右移8,将8和4比较，8比4大，i作为插入点不动；
 *     |
 *     c
 *     i
 * 
 * 2   8   7   1   3   5   6   4(主元)   c向右移道7, 将7和4比较，,7比4大，i作为插入点不动；
 *     |   |
 *     i   c
 *     
 * 2   1   8   7   3   5   6   4(主元)   c向右移道3, 将3和4比较，,4比3大，将3和8交换，此时插入点在3的右边，所以i向右移一位
 *         |       |
 *         i       c
 *         
 * 2   1   3   8   7   5   6   4(主元)   c向右移道5, 将5和4比较，,5比4大，i作为插入点不动;
 *             |       |
 * 			   i       c
 * 2   1   3   8   7   5   6   4(主元)   c向右移道6, 将6和4比较，,6比4大，i作为插入点不动;
 *             |           |
 *             i           c
 * 2   1   3   8   7   5   6   4(主元)    c指针遍历完了，最后将4和8交换。
 *             ^               ^
 *             |_______________|
 *             
 *            |    |
 * 2   1   3  | 4  | 8   7   5   6      将左边、右边的数组分别按照上面的方法分成大小两部分，通过递归细化下去，直到不能再分为止
 *     左边          |    |  右边
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
		//分界值
		int boundValue;
		
		//insertsub 作为分界值的插入一下表，分类完成后将将分界值插入该下表对应的元素
		int insertsub;
		//对数组截取部分由小到大遍历的数组下标。
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
