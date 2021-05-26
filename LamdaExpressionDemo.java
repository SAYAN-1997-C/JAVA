package Practice;

interface A{
	void show(int i);
}
//class xyz implements A{
//	public void show() {
//		System.out.println("Hello !");
//	}
//}

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
//		obj= new A(){  //Anonymous class
//			public void show() {
//				System.out.println("Hello ");
//			}
//		} ;

//		obj = (i) -> {
//			System.out.println("hello"+i);
//		};
		
		obj = (i) -> System.out.println("Hello "+i);
		obj.show(25);
	}

}
