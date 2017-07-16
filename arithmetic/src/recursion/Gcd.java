package recursion;

public class Gcd {

	public static void main(String[] args) {
		int x = gcd(336,36);
		System.out.println("公约数为"+x);
	}
	
	// (m>n)m和n的最大公约数 = n 和m%n的最大公约数
	private static int gcd(int m,int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}

}
