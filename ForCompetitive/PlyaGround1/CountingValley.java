package PlyaGround1;

import java.util.*;

public class CountingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="UDDDUDUU";
		int step=8;
		int x = 0;
		int res = 8;
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i) == 'U') {
				step++;
				if(res==step) {
					x++;
				}
			} else {
				step--;
			}
		}
		System.out.println(x);
	}

}
