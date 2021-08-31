package PlyaGround1;

import java.util.*;

public class RoundOffProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(73);
		l.add(67);
		l.add(38);
		l.add(33);
		l.add(100);
		List<Integer> res = new ArrayList<Integer>();
		int arr[] = new int[13];
		int x = 8;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 5 * x++;
		}
		for (Integer i : l) {
			if (i < 38) {
				res.add(i);
			} else {
				int y = i/5;
				y++;
				y*=5;
				if ((y - i) < 3) {
					res.add(y);
				} else {
					res.add(i);
				}
			}
		}
		System.out.println(res);
		System.out.println(arr[12]);
	}
}
