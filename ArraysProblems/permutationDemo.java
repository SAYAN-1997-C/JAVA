package ArraysProblems;

public class permutationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationDemo obj = new permutationDemo();
		int arr1[] = {1,2,-3,4,5};
		int arr2[] = {2,1,3,-4,5};
		boolean res = obj.permutation(arr1, arr2);
		System.out.println(res);
		
	}
	public boolean permutation(int arr1[],int arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		}
		int sum1=0,sum2=0,mul1=1,mul2=1;
		for(int i=0;i<arr1.length;i++) {
			sum1+=arr1[i];
			sum2+=arr2[i];
			mul1*=arr1[i];
			mul2*=arr2[i];
		}
		if(sum1==sum2 && mul1==mul2) {
			return true;
		}
		return false;
	}

}
