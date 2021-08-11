package LPSproblem;

public class LPS {

	public int findLpsLength(String s1,int startIndex,int endIndex) {
		if(startIndex > endIndex) {
			return 0;
		}
		if(startIndex == endIndex) {
			return 1;
		}
		int count1 = 0;
		if(s1.charAt(startIndex) == s1.charAt(endIndex)) {
			count1 = 2+findLpsLength(s1, startIndex+1, endIndex-1);
		}
		int count2= findLpsLength(s1, startIndex+1, endIndex);
		int count3 = findLpsLength(s1, startIndex, endIndex-1);
		
		return Math.max(count1, Math.max(count2, count3));
	}
}
