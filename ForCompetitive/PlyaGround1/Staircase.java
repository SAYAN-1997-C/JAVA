package PlyaGround1;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int x=n-1;
		for(int i=0;i<n;i++) {
			for(int k=0;k<x;k++) {
				System.out.print(" ");
			}
			x--;
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
