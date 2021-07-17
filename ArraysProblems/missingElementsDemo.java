package ArraysProblems;

import java.util.Arrays;

public class missingElementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missingElementsDemo obj = new missingElementsDemo();
		int arr[] = {6,9,12,14};
		obj.missingElements(arr);
		
	}
	public void missingElements(int arr[]) {
		Arrays.sort(arr);
		int diff = arr[0] - 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-i != diff) {
				while(diff < arr[i]-i) {
					System.out.println(i+diff);
					diff++;
				}
			}
		}
		
		
	}
	

}
