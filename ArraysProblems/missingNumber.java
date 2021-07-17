package ArraysProblems;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20};
		
		int sum1=0,sum2=0;
		for(int i : arr) {
			sum1+=i;
		}
		sum2=20*(20+1)/2;
		if(sum1==sum2) {
			System.out.println("no missing element!");
		} else {
			System.out.println((sum2-sum1)+ " is missing element!");
		}
	}

}
