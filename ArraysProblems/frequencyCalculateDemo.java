package ArraysProblems;

public class frequencyCalculateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,8,6,8,9,10,9,10};
		removeDuplicates(arr);
	}
	public static void removeDuplicates(int arr[]) {
		int n = arr.length;
		int fre[] = new int[n];
		
		for(int i=0;i<n;i++) {
			fre[i]=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					fre[i] +=1; 
				}
			}
		}
		for(int i =0;i<n;i++) {
			if(fre[i] == 0) {
				System.out.println(arr[i]+" Frequency "+fre[i]);
			}
		}
	}

}
