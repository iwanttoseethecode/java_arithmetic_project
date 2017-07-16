package sort;

import java.util.Random;

/* 二分插入排序
 * 假定从小到大排序，从第二个数开始，把当前的数用一个变量保存起来，然后根据二分查找原则找到需要插入的地方，然后较大的数依次往后移。如此往返循环将所有的数插入进去。
 * 时间复杂度 O(nlogn)
 * */

//public class BinaryInsertSort {
//    public static void main(String[] args) {
//        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
//        System.out.println("排序之前：");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        //二分插入排序
//        sort(a);
//        System.out.println();
//        System.out.println("排序之后：");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//    }
////二分法插入
//    private static void sort(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            int temp = a[i];
//            int left = 0;
//            int right = i-1;
//            int mid = 0;
//            //确定要插入的位置
//            while(left<=right){
//            	//先获取中间位置
//                mid = (left+right)/2;
//                if(temp<a[mid]){
//                	//如果值比中间值小，让right左移到中间下标-1
//                    right = mid-1;
//                }else{
//                	//如果值比中间值大,让left右移到中间下标+1
//                    left = mid+1;
//                }
//            }
//            for (int j = i-1; j >= left; j--) {
//            	//以左下标为标准，在左位置前插入该数据，左及左后边全部后移
//                a[j+1] = a[j];
//            }
//            if(left != i){
//            	//左位置插入该数据
//                a[left] = temp;
//            }
//        }
//    }
//}


//public class BinaryInsertSort{
//	public static void main(String[] args) {
//		int[] a = new int[20];
//		
//		Random r = new Random();
//		for(int i = 0; i<a.length;i++){
//			a[i] = r.nextInt(100);
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println();
//		
//		sort(a);
//		
//		for(int num : a){
//			System.out.print(num+" ");
//		}
//	}
//
//	private static void sort(int[] a) {
//		for(int i=1; i<a.length;i++){
//			int temp = a[i];
//			int left = 0;
//			int right = i-1;
//			
//			while(left<=right){
//				int mid = (left+right)/2;
//				if(a[mid]<temp){
//					left = mid+1;
//				}else{
//					right = mid-1;
//				}
//				
//			}
//			
//			for(int j = i-1;j>=left;j--){
//				a[j+1] = a[j];
//			}
//			a[left] = temp;
//		}
//		
//	}
//}

public class BinaryInsertSort{
	public static void main(String[] args) {
		int[] a = new int[20];
		Random r = new Random();
		for(int i = 0;i<20;i++){
			a[i] = r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		binaryInsetSort(a);
		
		for(int num : a){
			System.out.print(num + " ");
		}
	}

	private static void binaryInsetSort(int[] a) {
		/*for(int i=1; i<a.length; i++){
			int temp = a[i];
			int left = 0;
			int right = i-1;
			while(left<=right){
				int mid = (left+right)/2;
				if(a[i]<a[mid]){
					right = mid-1;
				}else{
					left = mid+1;
				}
			}
			for(int j=i-1;j>=left;j--){
				a[j+1]=a[j];
			}
			a[left]=temp;
		}*/
		
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int left = 0;
			int right = i-1;
			while(left<=right){
				int mid = (left+right)/2;
				if(a[i]<a[mid]){
					right = mid-1;
				}else{
					left = mid+1;
				}
			}
			for(int j=i-1;j>=left;j--){
				a[j+1]=a[j];
			}
			a[left] = temp;
		}
		
	}

//	private static void binaryInsetSort(int[] a) {
//		for(int i = 1;i<a.length;i++){
//			int left = 0;
//			int right = i-1;
//			int temp = a[i];
//			while(left<=right){
//				int mid = (left+right)/2;
//				if(a[i]<a[mid]){
//					right = mid-1;
//				}else{
//					left = mid+1;
//				}
//			}
//			for(int j=i-1;j>=left;j--){
//				a[j+1] = a[j];
//			}
//			a[left]=temp;
//		}
//	}
}