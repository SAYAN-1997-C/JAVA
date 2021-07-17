package ArraysProblems;

import java.util.*;

public class rotateMatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateMatrixDemo obj = new rotateMatrixDemo();
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		boolean x = obj.rotateMatrix(arr);
		System.out.println(Arrays.deepToString(arr));
	}
	public boolean rotateMatrix(int arr[][]) {
		if(arr.length == 0 || arr.length != arr[0].length) {
			return false;
		}
		int n = arr.length;
		for(int layer=0;layer<n/2;layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i = first;i<last;i++) {
				int offset = i- first;
				int top = arr[first][i];
				arr[first][i] = arr[last-offset][first];
				arr[last-offset][first] = arr[last][last-offset];
				arr[last][last-offset] = arr[i][last];
				arr[i][last] = top;
			}
		}
		return true;
		
	}
}
