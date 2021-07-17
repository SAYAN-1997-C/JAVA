package Practice;

public class missingNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missingNumberDemo obj = new missingNumberDemo();
		int arr[] = {1,3,4,5,6,7,8,9,10};
		int res = obj.missingNumber(arr, 10);
		System.out.println(res);
	}
	public int missingNumber(int arr[],int totalCount) {
		int sum1=0,sum2=0;
		sum2=totalCount*(totalCount+1)/2;
		for(int i : arr ) {
			sum1 +=i;
		}
		if(sum1==sum2) {
			return 0;
		}
		else {
			return sum2-sum1;
		}
	}

}
