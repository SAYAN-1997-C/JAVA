package ArraysProblems;

public class diagonalSumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diagonalSumDemo obj = new diagonalSumDemo();
		int arr[][] = {{1,2,3},{4,10,5},{6,7,9}};
		int sum = obj.diagonalSum(arr);
		System.out.println(sum);
	}
	public int diagonalSum(int arr[][]) {
		boolean x = checkCoulmn(arr);
		if( arr.length == 0 || x ) {
			return 0;
		}
		int sum = 0;
		for(int i= 0 ; i < arr.length ; i++) {
			sum +=arr[i][i];
		}
		return sum;
	}
	public boolean checkCoulmn(int arr[][]) {
		for(int i = 0 ; i< arr.length ; i++ ) {
			if(arr[i].length != arr.length) {
				return true;
			}
		}
		return false;
	}

}
