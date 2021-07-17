package ArraysProblems;

public class isUniqueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isUniqueDemo obj = new isUniqueDemo();
		int arr[] = {1,2,3,4,5,6,6};
		boolean res = obj.isUnique(arr);
		System.out.println(res);
	}
	public boolean isUnique(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1 ; j<arr.length ;j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
