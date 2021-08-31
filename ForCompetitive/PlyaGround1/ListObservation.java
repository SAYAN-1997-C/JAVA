package PlyaGround1;

import java.util.*;

public class ListObservation {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		// Write your code here
		List<Integer> res = new ArrayList<Integer>();
		int x =0;
		int y = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				x++;
			}
			if (a.get(i) < b.get(i)) {
				y++;
			}
		}
		res.add(x);
		res.add(y);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(6);
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(6);
		arr1.add(4);
		
		List<Integer> res = compareTriplets(arr1, arr);
		System.out.println(res);
//		for (Integer l : arr) {
//			System.out.println(l + 1);
//		}
//		arr.add(2, 100);
//		System.out.println(arr);
	}

}
