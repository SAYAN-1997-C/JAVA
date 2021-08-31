package PlyaGround1;

public class NumberLineJump {

	public static void main(String[] args) {
		
		int x1=0;
		int v1=2;
		int x2=5;
		int v2=3;
		
		if((x1==x2 && v2<v1) || (x2>x1 && v2>=v1) )
		{
			System.out.println("no");
		}
		int x=x1;
		int y=x2;
		while(true) {
			x+=v1;
			y+=v2;
			if(x==y) {
				System.out.println("yes");
				break;
			}
			if(x>y) {
				System.out.println("No");
				break;
			}
		}
				

	}

}
