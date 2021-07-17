package RecursionPart1;

public class GcdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GcdDemo obj = new GcdDemo();
		int res = obj.gcdCalculate(48, 18);
		System.out.println(res);
	}
	public int gcdCalculate(int a , int b) {
		if(a < 0 || b < 0) {
			return -1;
		}
		if( b == 0 ) {
			return a;
		}
		return gcdCalculate(b, a%b);
	}

}
