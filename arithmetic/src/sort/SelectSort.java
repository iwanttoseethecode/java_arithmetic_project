package sort;

/**
 * 选择排序(原理是将后面剩下最小<最大>的数放在最前面)
 * */

public class SelectSort {
	public static void main(String[] args) {
		int[] a = {45,23,64,12,77,85,34,60,5,8,100,44};
		
		selectsort(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	
	/**
	 * 重小到大排序
	 * */
	 public static void selectsort(int[] b){
		int index;
		int temp;
		
		for(int i=0;i<b.length-1;i++){
			index = i;
			for(int j=i+1;j<=b.length-1;j++){
				if(b[index]>b[j]){
					index = j;
				}
			}
			temp = b[i];
			b[i] = b[index];
			b[index] = temp;
			
			System.out.print("第"+(i+1)+"步排序结果：");
			for(int k=0;k<b.length;k++){
				System.out.print(" "+b[k]);
			}
			System.out.println();
		}
		
	}
	
}
