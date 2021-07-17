package ArraysProblems;

import java.util.Arrays;

public class findingPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findingPairDemo obj = new findingPairDemo();
		int arr[] = {1,8,9,10,25,16,7};
		int sum=2;
		obj.findingPair(arr, sum);
	}
	static void findingPair(int arr[] , int sum) {
		
		Arrays.sort(arr);
		int low=0,flag=0;
		int high=arr.length - 1 ;
		while(low < high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println("pair found "+ "("+arr[low]+","+arr[high]+")");
				low++;
				high--;
				flag=1;
			}
			if(arr[low]+arr[high] > sum) {
				high--;
			}
			if(arr[low]+arr[high] < sum) {
				low++;
			}
		}
		if(flag==0)
			System.out.println("pair not found!!");
	}

}
