package CollectionsFramework;

import java.util.*;

public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 16, 70000));
		laps.add(new Laptop("Lenovo", 8 , 50000));
		laps.add(new Laptop("Acer", 20, 55000));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop arg0, Laptop arg1) {
				// TODO Auto-generated method stub
				if(arg0.getPrice() > arg1.getPrice()) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		
		Collections.sort(laps,com);
		
		for(Laptop l : laps) {
			System.out.println(l);
		}
	}

}
