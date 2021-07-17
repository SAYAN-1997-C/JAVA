package ArraysProblems;

public class maxProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxProductDemo obj = new maxProductDemo();
		int arr[] = {20,10,30,50,40,60};
		String res = obj.maxProduct(arr);
		System.out.println(res);
	}
	public String maxProduct(int arr[]) {
		int max = 0;
		String pairs="";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j] > max) {
					max=arr[i]*arr[j];
					pairs = "";
					pairs +=arr[i]+","+arr[j];
				}
			}
		}
		return pairs;
	}

}
