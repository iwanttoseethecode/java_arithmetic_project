package recursion;

public class Gcd {

	public static void main(String[] args) {
		int x = gcd(336,36);
		System.out.println("��Լ��Ϊ"+x);
	}
	
	// (m>n)m��n�����Լ�� = n ��m%n�����Լ��
	private static int gcd(int m,int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}

}
