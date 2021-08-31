package PlyaGround1;

import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(-1);
		l.add(-3);
		l.add(4);
		l.add(2);
		
		int k=3;
		int count=0;
		for(Integer i : l) {
			if(i<=0) {
				count++;
			}
			if(count>=k) {
				System.out.println("Yes");
			}
		}
		System.out.println("no");
	}

}
