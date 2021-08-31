package PlyaGround1;

import java.util.*;

public class BeautyfulDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int i=20,j=23,k=6;
		for(int m=i;m<=j;m++) {
            int x = rev(m);
            int dif = Math.abs(x-m);
            if(dif%k == 0) {
                count++;
            }
        }
		System.out.println(count);
	}

	public static int rev(int x) {
		int rev = 0;
		while (x > 0) {
			int mod = x % 10;
			rev = rev * 10 + mod;
			x /= 10;
		}
		return rev;
	}

}
