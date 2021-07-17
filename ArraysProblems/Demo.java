package ArraysProblems;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
		String res = firstSecond(arr);
		System.out.println(res);
	}
	static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
          if (arr[i] != first) {
            second = arr[i];
            break;  
          }
        }
        return first+" "+second;
 
  }

}
