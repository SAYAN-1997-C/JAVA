package KnapsackProblem;

import java.util.ArrayList;

public class OpKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<KnapSackItem> items = new ArrayList<KnapSackItem>();
		
		int[] value = {100,120,60};
		int[] weight = {20,30,10};
		int capacity = 50;
		
		for(int i=0;i<value.length;i++) {
			items.add(new KnapSackItem(i, value[i], weight[i]));
		}
		FractionalKnapSack.fractionalKnapSack(items, capacity);
		
	}

}
