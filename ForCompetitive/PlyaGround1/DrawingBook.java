package PlyaGround1;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, p = 5;
		if (p == 1 || p == n) {
			System.out.println(0);
			return;
		}
		int countFront = 1;
		int countBack = 0;
		int countBackC = 1;
		for (int i = 2; i <= n; i = i + 2) {
			if (i == p || i + 1 == p) {
				break;
			}
			countFront++;
		}
		if (n % 2 == 0) {
			for (int i = n - 1; i >= 1; i = i - 2) {
				if (i == p || i - 1 == p) {
					break;
				}
				countBackC++;
			}
			if (countFront < countBackC) {
				System.out.println(countFront);
				return;
			} else {
				System.out.println(countBackC);
				return;
			}
		} else {
			for (int i = n; i >= 1; i = i - 2) {
				if (i == p || i - 1 == p) {
					break;
				}
				countBack++;
			}
			if (countFront < countBack) {
				System.out.println(countFront);
				return;
			} else {
				System.out.println(countBack);
				return;
			}
		}
	}
}
