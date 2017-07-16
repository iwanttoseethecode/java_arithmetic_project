package sort;

import java.util.Random;

/* ���ֲ�������
 * �ٶ���С�������򣬴ӵڶ�������ʼ���ѵ�ǰ������һ����������������Ȼ����ݶ��ֲ���ԭ���ҵ���Ҫ����ĵط���Ȼ��ϴ�������������ơ��������ѭ�������е��������ȥ��
 * ʱ�临�Ӷ� O(nlogn)
 * */

//public class BinaryInsertSort {
//    public static void main(String[] args) {
//        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
//        System.out.println("����֮ǰ��");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        //���ֲ�������
//        sort(a);
//        System.out.println();
//        System.out.println("����֮��");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//    }
////���ַ�����
//    private static void sort(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            int temp = a[i];
//            int left = 0;
//            int right = i-1;
//            int mid = 0;
//            //ȷ��Ҫ�����λ��
//            while(left<=right){
//            	//�Ȼ�ȡ�м�λ��
//                mid = (left+right)/2;
//                if(temp<a[mid]){
//                	//���ֵ���м�ֵС����right���Ƶ��м��±�-1
//                    right = mid-1;
//                }else{
//                	//���ֵ���м�ֵ��,��left���Ƶ��м��±�+1
//                    left = mid+1;
//                }
//            }
//            for (int j = i-1; j >= left; j--) {
//            	//�����±�Ϊ��׼������λ��ǰ��������ݣ�������ȫ������
//                a[j+1] = a[j];
//            }
//            if(left != i){
//            	//��λ�ò��������
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