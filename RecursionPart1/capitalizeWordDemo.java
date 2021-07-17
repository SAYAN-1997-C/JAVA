package RecursionPart1;

public class capitalizeWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hey i am sayan jashu";
		String s = capitalizeWord(str);
		System.out.println(s);
	}
	static String capitalizeWord(String str) {
		if(str.length() == 0) {
			return "-1";
		}
		String words[] = str.split(" ");
		String finalString = "";
		for(String w : words) {
			String first = w.substring(0,1);
			String afterFirst = w.substring(1);
			finalString += first.toUpperCase()+afterFirst+" "; 
		}
		return finalString.trim();
		
	}

}
