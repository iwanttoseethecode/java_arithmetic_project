package recursion;

public class Hanoi {
	static int  m=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(21,'a','b','c');
	}

	private static void hanoi(int n,char from,char dependOn,char to){
		if(n==1){
			move(1,from,to);
		}else{
			hanoi(n-1,from,to,dependOn);
			move(n,from,to);
			hanoi(n-1,dependOn,from,to);
		}
	}

	private static void move(int i, char from, char to) {
		// TODO Auto-generated method stub
		System.out.println("第"+m+++"步,将第"+i+"个盘子从"+from+"移动到"+to);
	}
	
}
