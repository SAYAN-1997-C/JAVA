package ArraysProblems;

import java.util.Arrays;

public class removeDuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicateDemo obj = new removeDuplicateDemo();
		int arr[]= {8,9,8,7,8,7,9};
		int x = removeDuplicates(arr,arr.length);
		for(int i =0 ;i<x;i++)
			System.out.println(arr[i]);
		System.out.println(Arrays.toString(arr));
	}
	public static int removeDuplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
  
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
//	public int[] removeDuplicate(int arr[]) {
//		
//		int n = arr.length;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[i] == arr[j]) {
//					for(int k=j;k<n-1;k++) {
//						arr[k]=arr[k+1];
//					}
//					n--;
//					arr = Arrays.copyOfRange(arr, 0 , n);
//				}
//			}
//		}
//		return arr;
////		
//	}

}
