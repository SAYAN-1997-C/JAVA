package RecursionPart1;

public class DecimalToBinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToBinaryDemo obj = new DecimalToBinaryDemo();
		int res = obj.decimalToBinary(8);
		System.out.println(res);
		
	}
	public int decimalToBinary(int num) {
		if( num < 0 ) {
			return -1;
		}
		if( num == 0) {
			return 0;
		}
		return num%2 + 10 * decimalToBinary(num/2);
	}

}
