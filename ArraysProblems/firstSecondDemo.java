package ArraysProblems;

public class firstSecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {84,84,86,87,85,90,85,83,23,5,84,1,2,0};
		String res = firstSecond(arr);
		System.out.println(res);

	}
	static String firstSecond(int arr[]) {
		int first=0,second=0,flag=0;
		if(arr[0]>arr[1]) {
			first = arr[0];
			second = arr[1];
		}
		else {
			first = arr[1];
			second = arr[0];
		}
		for(int i = 2 ; i < arr.length ; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
				flag=1;
			}
			if( flag == 0 ) {
				if(arr[i] > second) {
					second = arr[i];
				}
			}
		}
		String result = "";
		result +=first+" "+second;
		return result;
	}

}
