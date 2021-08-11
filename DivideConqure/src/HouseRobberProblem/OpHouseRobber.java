package HouseRobberProblem;

public class OpHouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] houseNetWorth = {6,7,1,30,8,2,4};
		HouseRobber obj = new HouseRobber();
		int res = obj.maxMoneyRecursive(houseNetWorth, 0);
		System.out.println(res);
	}

}
