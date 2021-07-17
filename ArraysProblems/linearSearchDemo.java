package ArraysProblems;

public class linearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linearSearchDemo obj = new linearSearchDemo();
		int arr[] = {4,5,7,88,99,100};
		int value = 85;
		obj.linearSearch(arr, value);
	}
	public void linearSearch(int arr[],int value) {
		for(int i= 0 ;i<arr.length;i++) {
			if(arr[i]==value) {
				System.out.println("The value present at index : "+i);
				return ;
			}
		}
		System.out.println(value+" is not present into the list.");
		return;
	}

}
