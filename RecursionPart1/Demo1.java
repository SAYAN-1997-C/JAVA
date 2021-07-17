package RecursionPart1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 obj = new Demo1();
		obj.recursiveMethod(5);

	}
	public void recursiveMethod(int n) {
		if(n<1) {
			System.out.println("n is less than 1");
			return;
		} 
		recursiveMethod(n-1);
		System.out.println(n);
	}

}
