package PlyaGround1;

import java.util.*;

public class BetweenTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = {2,4};
		int b[] = {16,32,96};
		
		List<Integer> arr = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		int x = a[0];
		boolean judge=true;
		while(x<=b[0]) {
			judge=true;
			for(int i=0;i<a.length;i++) {
				if(x%a[i]!=0) {
					judge=false;
				}
			}
			if(judge==true) {
				arr.add(x);
			}
			x++;
		}
		int res = 0;
		for(Integer num : arr) {
			judge=true;
			for(int i=0;i<b.length;i++) {
				if(b[i]%num!=0) {
					judge=false;
				}
			}
			if(judge==true) {
				res++;
			}
		}
		System.out.println(arr);
		System.out.println(res);
	}

}
