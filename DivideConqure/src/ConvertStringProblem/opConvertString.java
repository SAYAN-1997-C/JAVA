package ConvertStringProblem;

public class opConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "table";
		String s2 = "tbres";
		
		ConvertString obj = new ConvertString();
		int res = obj.findMinOperations(s1, s2, 0, 0);
		System.out.println(res);
	}

}
