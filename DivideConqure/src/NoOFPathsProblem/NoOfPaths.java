package NoOFPathsProblem;

public class NoOfPaths {

	int numberOfPaths(int arr[][],int row,int col,int cost) {
		if(cost<0) {
			return 0;
		}
		if(row == 0 && col == 0) {
			return (arr[0][0]-cost == 0) ? 1 : 0;
		}
		if(row == 0) {
			return numberOfPaths(arr, 0, col-1, cost-arr[row][col]);
		}
		if(col == 0) {
			return numberOfPaths(arr, row-1, 0, cost-arr[row][col]);
		}
		
		int noOfPathFromPreviousRow = numberOfPaths(arr, row-1, col, cost-arr[row][col]);
		int noOfPathFromPreviousCol = numberOfPaths(arr, row, col-1, cost-arr[row][col]);
		
		return noOfPathFromPreviousCol + noOfPathFromPreviousRow;
	}
}
