package PlyaGround1;

import java.util.*;

public class CheckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4};
		int B[] = {1,3,2,4};
		
		List<int []> arA = new ArrayList<int[]>();
		List<int []> arB = new ArrayList<int[]>();
		arA.add(A);
		arB.add(B);
		for(int i=0;i<A.length;i++) {
			int x[] = new int[A.length];
			for(int j=0;j<A.length;j++) {
				x[j] = A[j];
			}
			if(i==0) {
				int temp = x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
			else if(i==A.length-1) {
				break;
			}
			else {
				int temp = x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
			arA.add(x);
		}
		for(int[] k : arA) {
			for(int j=0;j<k.length;j++) {
				System.out.print(k[j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<B.length;i++) {
			int x[] = new int[B.length];
			for(int j=0;j<B.length;j++) {
				x[j] = B[j];
			}
			if(i==0) {
				int temp = x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
			else if(i==B.length-1) {
				break;
			}
			else {
				int temp = x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
			arB.add(x);
		}
		int max=0;
		for(int[] x : arA) {
			for(int[] y : arB) {
				int i=1;
				int sum=0;
				for(int j=0;j<x.length;j++) {
					sum=sum+x[j]*y[j]*i++;
				}
				if(sum>max) {
					max=sum;
				}
			}
		}
		System.out.println(max);
	}

}
