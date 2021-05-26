package Practice;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="the big cat jumped over the lazy dog";
		String ResultString="";
		String strArr[]=str.split(" ");
		
		int size=(strArr.length)-1,i=0;
		while(size >= i)
		{
			ResultString+=reverse(strArr[size]);
			ResultString+=" ";
			if(size == i)
				break ;
			size--;
			ResultString+=reverse(strArr[i++]);
			ResultString+=" ";
		}
		System.out.println(ResultString);
	}
	static String reverse(String St)
	{
		String result=" ";
		char a[]=St.toCharArray();
		for(int i=St.length()-1;i>=0;i--) {
			result+=a[i];
		}
		return result;
	}

}
