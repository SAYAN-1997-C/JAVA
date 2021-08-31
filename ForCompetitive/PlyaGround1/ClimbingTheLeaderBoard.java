package PlyaGround1;

import java.util.*;

public class ClimbingTheLeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ranked = new ArrayList<Integer>();
		List<Integer> player =  new ArrayList<Integer>();
		List<Integer> result =  new ArrayList<Integer>();
		
		ranked.add(100);
		ranked.add(50);
		ranked.add(40);
		ranked.add(40);
		ranked.add(20);
		ranked.add(10);
		
		player.add(5);
		player.add(25);
		player.add(50);
		player.add(120);
		
		List<Integer> rank = new ArrayList<Integer>();
		rank.add(1);
		for(int i=1;i<ranked.size();i++) {
			if(ranked.get(i) == ranked.get(i-1)) {
				rank.add(rank.get(i-1));
			} else {
				rank.add(rank.get(i-1)+1);
			}
		}
		System.out.println(rank);
		for(Integer p : player ) {
			if(p > ranked.get(0)) {
				result.add(1);
			} else if (p < ranked.get(ranked.size()-1)) {
				result.add(rank.get(ranked.size()-1)+1);
			} else {
				int index = binarySearch(ranked,p);
				result.add(rank.get(index));
				
			}
			
		}
		
//	
//		for(Integer i : player) {
//			int rank=1;
//			int flag=0;
//			int prev=0;
//			for(int j=0;j<ranked.size();j++) {
//				int x = ranked.get(j);
//				if(x<=i) {
//					result.add(rank);
//					flag=1;
//					break;
//				}
//				if(x!=prev) {
//					rank++;
//				}
//				prev=x;
//			}
//			if(flag==0) {
//				result.add(rank);
//			}	
//		}
		System.out.println(result);
	}
	public static int binarySearch(List<Integer> ranked,int p) {
		int lo=0;
		int hi=ranked.size()-1; 
		while(lo<=hi) {
			int mid = lo + (hi - lo) / 2;
			if (ranked.get(mid) == p) {
				return mid;
			} else if (ranked.get(mid) < p && p < ranked.get(mid-1)) {
				return mid;
			} else if (ranked.get(mid) > p && p >= ranked.get(mid+1)) {
				return mid + 1;
			} else if (ranked.get(mid) < p) {
				hi = mid - 1;
			} else if (ranked.get(mid) > p) {
				lo = mid + 1;
			}
		}
		return -1;
	}

}
