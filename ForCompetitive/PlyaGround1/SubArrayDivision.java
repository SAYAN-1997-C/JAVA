package PlyaGround1;

import java.util.*;

public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(4);
//		s.add(3);
//		s.add(3);
//		s.add(2);
		int d=4; int m=1;
		int res = 0;
        for(int i=0;i<s.size();i++) {
            int sum=0;
            for(int j=i;j<i+m;j++) {
            	if(j>=s.size()) {
            		break;
            	}
                sum+=s.get(j);
            }
            if(sum==d) {
                res++;
            }
        }
        System.out.println(res);
	}

}
