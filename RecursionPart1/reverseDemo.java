package RecursionPart1;

public class reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sayanjashu";
		System.out.println(reverse(str));
	}
	static String reverse(String str) {
		if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
	}

}
