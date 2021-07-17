package RecursionPart1;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciDemo obj = new FibonacciDemo();
		int res = obj.fibonacci(6);
		System.out.println(res);
	}
	public int fibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
