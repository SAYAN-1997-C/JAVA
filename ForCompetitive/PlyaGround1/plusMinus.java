package PlyaGround1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.lang.*;
import java.io.*;

public class plusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-4);
		arr.add(3);
		arr.add(-9);
		arr.add(0);
		arr.add(4);
		arr.add(4);
		arr.add(1);
		//plusMin(arr);
		int count=1;
		Collections.sort(arr);
		int h = arr.get(arr.size()-1);
		for(int i=arr.size()-2;i>=0;i--) {
			if(arr.get(i)==h) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

	public static void plusMin(List<Integer> arr) {
		// Write your code here
		double pos = 0.0, neg = 0.0, zero = 0.0;
		for (Integer i : arr) {
			if (i == 0)
				pos++;
			else if (i < 0)
				neg++;
			else
				zero++;
		}
		pos =pos / arr.size();
		neg =neg / arr.size();
		zero =zero / arr.size();

		Locale locale = Locale.ENGLISH;
		NumberFormat nf = NumberFormat.getNumberInstance(locale);
		nf.setMinimumFractionDigits(6);
		nf.setMaximumFractionDigits(6);
		System.out.println(nf.format(pos));
		System.out.println(nf.format(neg));
		System.out.println(nf.format(zero));
	}
}
