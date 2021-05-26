package algorithmPart;

public class KnapShak {

	public static void main(String[] args) {
		
		float object[]= {1,2,3,4,5,6,7};
		float profit[]= {10,5,15,7,6,18,3};
		float weight[]= {2,3,5,7,1,4,1};
		
		float ProfitPerWeight[]=new float[object.length];
		
		for(int i=0;i<profit.length;i++) {
			ProfitPerWeight[i]=profit[i]/weight[i];
		}
		int bagMax=15;
		float maxProfit=0;
		while(bagMax>0) {
			int mIndex=maxIndex(ProfitPerWeight);
			if(weight[mIndex]<=bagMax) {
				bagMax-=weight[mIndex];
				maxProfit+=profit[mIndex];
				ProfitPerWeight[mIndex]=-999999;
			}
			else {
				int x=bagMax;
				bagMax=bagMax-x;
				maxProfit+=x*ProfitPerWeight[mIndex];
			}
		}
		System.out.println("Maximum profit:"+ maxProfit);
	}
	public static int maxIndex(float ProfitPerWeight[]) {
		
		int index=0;
		float max=ProfitPerWeight[0];
		for(int i=0;i<ProfitPerWeight.length;i++) {
			if(ProfitPerWeight[i]>max) {
				max=ProfitPerWeight[i];
				index=i;
			}
		}
		return index;
	}

}
