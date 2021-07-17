package RecursionPart1;

import java.util.Scanner;

public class recursiveRangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveRangeDemo obj = new recursiveRangeDemo();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = obj.recursiveRange(num);
		System.out.println(res);
	}
	public int recursiveRange(int num) {
		if(num <= 0) {
			return 0;
		}
		return num + recursiveRange(num-1);
	}

}
