package RecursionPart1;

public class PowerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerDemo obj = new PowerDemo();
		int res = obj.powerOfNumber(2, 3);
		System.out.println(res);

	}
	public int powerOfNumber(int base, int exp) {
		if(exp < 0) {
			return -1;
		}
		if( exp == 0) {
			return 1;
		}
		return base * powerOfNumber(base, exp-1);
	}

}
