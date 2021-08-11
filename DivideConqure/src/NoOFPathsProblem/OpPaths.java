package NoOFPathsProblem;

public class OpPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost = {
				{4,7,1,6},
				{5,7,3,9},
				{3,2,1,2},
				{7,1,6,3},
		};
		NoOfPaths obj = new NoOfPaths();
		int res = obj.numberOfPaths(cost, cost.length-1, cost[0].length-1, 25);
		System.out.println(res);
	}

}
