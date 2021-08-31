package PlyaGround1;

import java.util.*;

public class MigratoryBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		Map<Integer,Integer> mp = new TreeMap<Integer, Integer>();
		for(Integer i : arr) {
			if(!mp.containsKey(i)) {
				mp.put(i,1);
			}
			else {
				int x = mp.get(i);
				x++;
				mp.replace(i,x);
			}
		}
		System.out.println(mp);
		Set set = mp.entrySet();
		Iterator itr = set.iterator();
		int max=0;
		int id =0;
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> m = (Map.Entry<Integer, Integer>) itr.next();
			if(m.getValue()>max) {
				max=m.getValue();
				id=m.getKey();
			}
		}
		System.out.println(id);
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		m.put(1,50);
		m.put(2, 51);
		m.put(3, 52);
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		System.out.println(m.containsValue(52));
	}

}
