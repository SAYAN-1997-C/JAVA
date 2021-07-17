package RecursionPart1;

import java.util.Scanner;

public class ProductOfArryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArryDemo obj = new ProductOfArryDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the data : ");
		for(int i = 0; i< arr.length ; i++) {
			arr[i]=sc.nextInt();
		}
		int res = obj.productOfArray(arr, arr.length-1);
		System.out.println(res);
		
	}
	
	public int productOfArray(int a[] , int n) {
		
		if(n < 0 ) {
			return 1;
		}
		return a[n] * productOfArray(a, n-1);
	}

}
