package HouseRobberProblem;

public class HouseRobber {

	public int maxMoneyRecursive(int[] houseNetWorth,int currentIndex) {
		if(currentIndex >= houseNetWorth.length) {
			return 0;
		}
		int stealCurrentHome = houseNetWorth[currentIndex] + maxMoneyRecursive(houseNetWorth, currentIndex+2);
		int skipCurrentHome = maxMoneyRecursive(houseNetWorth, currentIndex+1);
		
		return Math.max(stealCurrentHome, skipCurrentHome);
	}
}
