package PlyaGround1;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leapDays = 244;
		int days = 243;
		int exception = 230;
		int y = 1918;
		String res="";
		if(y<1918) {
			int x=0;
			if(y%4==0) {
				x = 256-leapDays;
			}
			else {
				x = 256-days;
			}
			res=myFun(x, y);
		}
		else if(y>1918) {
			int x=0;
			if(y%400==0 || (y%4==0)&&(y%100)!=0) {
				x = 256-leapDays;
			}
			else {
				x = 256-days;
			}
			res=myFun(x, y);
		}
		else if(y==1918) {
			int x=256-exception;
			res=myFun(x, y);
		}
		System.out.println(res);
	}
	static String myFun(int x,int y) {
		StringBuffer str = new StringBuffer();
		if(x<10) {
			str.append(0);
			str.append(x+".");
		}
		else {
			str.append(x+".");
		}
		str.append(0);
		str.append(9+".");
		str.append(y);
		return str.toString();
	}

}
