package RecursionPart1;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialDemo obj = new FactorialDemo();
		int res = obj.factorial(4);
		System.out.println(res);
	}
	public int factorial(int n) {
		if(n < 0 ) {
			return -1;
		}
		if( n == 0 || n == 1 ) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
