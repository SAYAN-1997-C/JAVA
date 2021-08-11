package ZeroOneKnapSackProblem;

public class OpKanpsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = {3,1,2,5};
		int[] profits= {31,26,17,72};
		ZeroOneKnapsack obj = new ZeroOneKnapsack();
		int res = obj.knapsack(profits, weights, 7, 0);
		System.out.println(res);
	}

}
