package sort;

/**
 * ѡ������(ԭ���ǽ�����ʣ����С<���>����������ǰ��)
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
	 * ��С��������
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
			
			System.out.print("��"+(i+1)+"����������");
			for(int k=0;k<b.length;k++){
				System.out.print(" "+b[k]);
			}
			System.out.println();
		}
		
	}
	
}
