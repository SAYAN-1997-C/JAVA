package CoinChangeProblem;

import java.util.Arrays;

public class CoinChange {
	
	static void coinChange(int coins[], int N) {
		
		Arrays.sort(coins);
		int index = coins.length - 1;
		while(index >= 0) {
			int coinValue = coins[index] ;
			index--;
			int maxAmount = (N/coinValue) * coinValue;
			if(maxAmount > 0) {
				System.out.println("Coin Value : " + coinValue + " Count " + (N/coinValue));
				N = N-maxAmount;
			}
			if(N==0) {
				return;
			}
		}
		
	}

}
