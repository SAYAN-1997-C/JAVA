package ArraysProblems;

import java.util.HashSet;

public class duplicateRemoveHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,2,1,2};
		removeDuplicate(arr);
	}
	public static void removeDuplicate(int arr[]) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
