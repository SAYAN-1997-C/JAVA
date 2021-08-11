package LPSproblem;

public class OpLPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ELRMENMET";
		LPS obj = new LPS();
		int res = obj.findLpsLength(s1, 0, s1.length()-1);
		System.out.println(res);
	}

}
