package PlyaGround1;

public class StringProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12:40:22AM";
		String res = str.substring(8,10);
		str = str.substring(0, 8);
		
		String s[] = str.split(":");
		
		String result;
		int r=0;
		String rx = "00";
		if(res.equals("PM")) {
			if(Integer.valueOf(s[0])!=12) {
				r = Integer.valueOf(s[0])+12;
				String f = String.valueOf(r);
				result = f+":"+s[1]+":"+s[2];
				System.out.println(result);
				return;
			}
		}
		if(Integer.valueOf(s[0])==12 && res.equals("AM")){
			result = rx +":"+s[1]+":"+s[2];
			System.out.println(result);
			return;
		}
		System.out.println(str);
	}

}
