package MatrixCostProblem;

public class OpMatrixCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost = {
				{4,7,8,6,4},
				{6,7,3,9,2},
				{3,8,1,2,4},
				{7,1,7,3,7},
				{2,9,8,9,3},
		};
		MatrixCost obj = new MatrixCost();
		int res = obj.findMinCost(cost, cost.length-1, cost[0].length-1);
		System.out.println(res);
	}

}
