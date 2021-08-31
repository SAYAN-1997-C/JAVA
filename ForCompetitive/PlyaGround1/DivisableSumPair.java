package PlyaGround1;

import java.util.*;

public class DivisableSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(6);
		ar.add(1);
		ar.add(2);
		int n=6;
		int k=3;
		int count=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int x=ar.get(i);
                int y=ar.get(j);
                if(i < j ) {
                    if(((x+y)%k)==0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
	
	}

}
