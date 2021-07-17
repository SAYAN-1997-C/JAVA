package RecursionPart1;

public class isPalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kahbu";
		str = str.toLowerCase();
		System.out.println(isPalindrome(str));
	}
	static  boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }

}
