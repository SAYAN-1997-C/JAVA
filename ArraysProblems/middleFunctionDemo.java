package ArraysProblems;

import java.util.Arrays;

public class middleFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {11,12,13,14,15};
//		int copy[] = Arrays.copyOfRange(arr, 1 , 2);
//		System.out.println(Arrays.toString(copy));
		
		
		middleFunctionDemo obj = new middleFunctionDemo();
		int arr[] = {11,12,13,14,15,16};
		arr = obj.middleFunction(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public int[] middleFunction(int arr[]) {
		return Arrays.copyOfRange(arr,1,arr.length-1);
	}

}
