package recursion;

public class CalNFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = fact(6);
		System.out.println("100�Ľ׳˽����"+m);
	}
	
	private static int fact(int n){
		if(n==1){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}

}
