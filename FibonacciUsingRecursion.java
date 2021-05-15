package Practice;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("0 1 ");
		Fibonacci(0,1);
		
	}
	static void Fibonacci(int a,int b) {
		
		int sum=a+b;
		if(sum>100)
			return;
		System.out.print(sum+" ");
		Fibonacci(b, sum);
	}

}
