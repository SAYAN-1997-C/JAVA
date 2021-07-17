package RecursionPart1;

public class SumOfDigitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitDemo obj = new SumOfDigitDemo();
		int res = obj.sumOfDigit(1000);
		System.out.println(res);

	}
	public int sumOfDigit(int n) {
		if( n==0 || n<0) {
			return 0;	
		}
		return n%10 + sumOfDigit(n/10);
	}

}
