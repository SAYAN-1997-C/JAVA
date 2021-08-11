package LCSproblem;

public class OpLCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="elephant";
		String s2 = "erepat";
		
		LCS obj = new LCS();
		int res = obj.findLcsLength(s1, s2, 0, 0);
		System.out.println(res);
	}

}
