package SamAndSubstrings;

import java.util.*;

public class SamAndSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "1234";
		long ch[] = new long[n.length()];
		for(int i=0;i<n.length();i++) {
			ch[i] = n.charAt(i)-48;
		}
		List<Long> arr = new ArrayList<Long>();
		long ans=0;
		for(long x : ch) {
			arr.add(x);
			for(int i=0;i<arr.size()-1;i++) {
				arr.set(i, (arr.get(i)*10)+x);
				ans+=arr.get(i);
			}
			System.out.println(arr);
		}
//		System.out.println(arr);
	}

}
