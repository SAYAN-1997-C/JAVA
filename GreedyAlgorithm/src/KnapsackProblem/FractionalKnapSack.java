package KnapsackProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapSack {

	public static void fractionalKnapSack(ArrayList<KnapSackItem> itemList,int capacity) {
		
		Comparator<KnapSackItem> ratioCompare = new Comparator<KnapSackItem>(){
			@Override
			public int compare(KnapSackItem o1,KnapSackItem o2) {
				if(o2.ratio > o1.ratio)
					return 1;
				else 
					return -1;
			}
		};
		
		Collections.sort(itemList, ratioCompare);
		System.out.println(itemList.get(0));
		
		int usedCapacity = 0;
		double totalValue = 0.0;
		
		for(KnapSackItem item : itemList) {
			if( usedCapacity + item.weight <= capacity) {
				usedCapacity += item.weight;
				totalValue += item.value;
				System.out.println("Taken : "+item);
			}
			else {
				int usedWeight = capacity - usedCapacity;
				double val = usedWeight*item.ratio;
				System.out.println("Taken : Item Index : "+item.index + " Obtain value :"+val+" used Weight : "+usedWeight+" ratio :"+item.ratio);
				usedCapacity +=usedWeight;
				totalValue +=val;
			}
			if(usedCapacity == capacity) break;
		}
		System.out.println("\nTotal value obtained : "+totalValue);
	}
}
