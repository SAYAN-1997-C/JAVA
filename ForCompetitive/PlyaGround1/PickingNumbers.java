package PlyaGround1;

import java.util.*;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,1,4,6,2,2,5,3,3,2,2};
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
//		mp.put(1,5);
//		mp.put(2,6);
//		mp.put(3,10);
//		mp.put(4,2);
//		
//		int maxValues = Collections.max(mp.values());
//		System.out.println(maxValues);
//		int maxKeys = Collections.max(mp.keySet());
//		System.out.println(maxKeys);
		int maxValue = 0;
		
		for(int i=0;i<a.length;i++) {
			List<Integer> forPlus =  new ArrayList<Integer>();
			List<Integer> forMinus =  new ArrayList<Integer>();
			forPlus.add(a[i]);
			forMinus.add(a[i]);
			for(int j=i+1;j<a.length;j++) {
				int div = a[i]-a[j];
				if(div==1) {
					forPlus.add(a[j]);
				}
				else if(div==0) {
					forPlus.add(a[i]);
					forMinus.add(a[i]);
				}
				else if(div==-1) {
					forMinus.add(a[j]);
				}
			}
			if(forPlus.size() > forMinus.size()) {
				if(forPlus.size() > maxValue) {
					maxValue=forPlus.size();
				}
			}
			else {
				if(forMinus.size() > maxValue) {
					maxValue=forMinus.size();
				}
			}
		}
		System.out.println(maxValue);
	}

}
