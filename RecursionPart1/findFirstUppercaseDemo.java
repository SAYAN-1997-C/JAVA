package RecursionPart1;

import java.util.*;


public class findFirstUppercaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aayaahu";
		char res = findFirstUppercase(str);
		System.out.println(res);
	}
	public static char findFirstUppercase(String str) {
		if( str.length() == 0) {
			return '0';
		}
		if( Character.isUpperCase(str.charAt(0)) ) {
			return str.charAt(0);
		}
		return findFirstUppercase(str.substring(1));
		
	}
//	static char first(String str)
//    {
//        for (int i = 0; i < str.length(); i++)
//            if (Character.isUpperCase(str.charAt(i)))
//                return str.charAt(i);
//        return '0';
//    }
//     
//    // Driver program
//    public static void main(String args[])
//    {
//        String str = "geeksfordeedd";
//        char res = first(str);
//        if (res == 0)
//            System.out.println("No uppercase letter");
//        else
//            System.out.println(res);
//    }

}
