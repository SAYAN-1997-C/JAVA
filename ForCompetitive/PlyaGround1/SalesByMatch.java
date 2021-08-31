package PlyaGround1;

import java.util.*;

public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(6);
		ar.add(5);
		ar.add(2);
		ar.add(3);
		ar.add(5);
		ar.add(2);
		ar.add(2);
		ar.add(1);
		ar.add(1);
		ar.add(5);
		ar.add(1);
		ar.add(3);
		ar.add(3);
		ar.add(3);
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(Integer i : ar) {
            if(!mp.containsKey(i)) {
                mp.put(i,1);
            } else {
                int x = mp.get(i);
                x++;
                mp.replace(i,x);
            }
        }
        int count=0;
        System.out.println(mp);
        Set set = mp.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer,Integer> m = (Map.Entry<Integer,Integer>) itr.next();
            if(m.getValue()%2 == 0) {
                count++;
            }
        }
        System.out.println(count);

	}

}
